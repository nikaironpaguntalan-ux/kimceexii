import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JudgeDdManager extends DataBaseManager {
    Scanner input = new Scanner(System.in);

    public void addCase(String caseID, String caseType, String caseNature, String fileDate,
                        String Accused, String Complainant, String Status, String Prosecutor,
                        String Witness, String Evidence, String hearingDate) {
        
        String insertcase = "INSERT INTO cases (caseID, caseType, caseNature, fileDate, Accused, Complainant, Status, Prosecutor, Witness, Evidence, hearingDate) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(insertcase)) {
            
            pstmt.setString(1, caseID);
            pstmt.setString(2, caseType);
            pstmt.setString(3, caseNature);
            pstmt.setString(4, fileDate);
            pstmt.setString(5, Accused);
            pstmt.setString(6, Complainant);
            pstmt.setString(7, Status);
            pstmt.setString(8, Prosecutor);
            pstmt.setString(9, Witness);
            pstmt.setString(10, Evidence);
            pstmt.setString(11, hearingDate);

            pstmt.executeUpdate();
            System.out.println("Case Added Successfully");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //searcH LOGIC

    public void searchCaseId(String caseID) {
        String searchq = "SELECT * FROM cases WHERE caseID = ?";
        
        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(searchq)) {
            
            pstmt.setString(1, caseID);
            ResultSet resultSet = pstmt.executeQuery();
            
            if (resultSet.next()) {
                System.out.println("\nCase Found");
                System.out.println("Case ID: " + resultSet.getString("caseID"));
                System.out.println("Case Type: " + resultSet.getString("caseType"));
                System.out.println("Case Nature: " + resultSet.getString("caseNature"));
                System.out.println("File Date: " + resultSet.getString("fileDate"));
                System.out.println("Accused: " + resultSet.getString("Accused"));
                System.out.println("Complainant: " + resultSet.getString("Complainant"));
                System.out.println("Status: " + resultSet.getString("Status"));
                System.out.println("Prosecutor: " + resultSet.getString("Prosecutor"));
                System.out.println("Witness: " + resultSet.getString("Witness"));
                System.out.println("Evidence: " + resultSet.getString("Evidence"));
                System.out.println("Hearing Date: " + resultSet.getString("hearingDate"));
            } else {
                System.out.println("\nCase not found");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchAccused(String Accused){
        String searchquery= "SELECT * FROM cases WHERE Accused = ?";

        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(searchquery)){

            pstmt.setString(1, Accused);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                System.out.println("\nFound");
                System.out.println("Case ID: " + resultSet.getString("caseID"));
                System.out.println("Case Type: " + resultSet.getString("caseType"));
                System.out.println("Case Nature: " + resultSet.getString("caseNature"));
                System.out.println("File Date: " + resultSet.getString("fileDate"));
                System.out.println("Accused: " + resultSet.getString("Accused"));
                System.out.println("Complainant: " + resultSet.getString("Complainant"));
                System.out.println("Status: " + resultSet.getString("Status"));
                System.out.println("Prosecutor: " + resultSet.getString("Prosecutor"));
                System.out.println("Witness: " + resultSet.getString("Witness"));
                System.out.println("Evidence: " + resultSet.getString("Evidence"));
                System.out.println("Hearing Date: " + resultSet.getString("hearingDate"));
            } else {
                System.out.println("\nCase not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void srchCaseType(String caseType){
        String searchquery= "SELECT * FROM cases WHERE caseType = ?";

        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(searchquery)){

            pstmt.setString(1, caseType);
            ResultSet resultSet = pstmt.executeQuery();
            
            int ctr = 0;
            while (resultSet.next()) {
                if (ctr == 0) {
                    System.out.println("Cases Found");
                }
                System.out.print("Case ID: " + resultSet.getString("caseID"));
                System.out.println(" | Accused: " + resultSet.getString("Accused"));
                
                ctr++;
            }

            if (ctr == 0) {
                System.out.println("No cases found for the specified type.");
            } else {
                System.out.print("Enter Case ID to view: ");
                String caseID = input.nextLine();
                searchCaseId(caseID);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void srchNatureT(String caseNature){
        String searchquery= "SELECT * FROM cases WHERE caseNature = ?";

        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(searchquery)){

            pstmt.setString(1, caseNature);
            ResultSet resultSet = pstmt.executeQuery();
            
            int ctr = 0;
            while (resultSet.next()) {
                if (ctr == 0) {
                    System.out.println("Cases Found");
                }
                System.out.print("Case ID: " + resultSet.getString("caseID"));
                System.out.println(" | Accused: " + resultSet.getString("Accused"));
                
                ctr++;
            }

            if (ctr == 0) {
                System.out.println("No cases found for the specified nature.");
            } else {
                System.out.print("Enter Case ID to view: ");
                String caseID = input.nextLine();
                searchCaseId(caseID);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void srchCompName(String Complainant){
        String searchquery= "SELECT * FROM cases WHERE Complainant = ?";

        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(searchquery)){

            pstmt.setString(1, Complainant);
            ResultSet resultSet = pstmt.executeQuery();
            
            int ctr = 0;
            while (resultSet.next()) {
                if (ctr == 0) {
                    System.out.println("Cases Found");
                }
                System.out.print("Case ID: " + resultSet.getString("caseID"));
                System.out.println(" | Accused: " + resultSet.getString("Accused"));
                
                ctr++;
            }

            if (ctr == 0) {
                System.out.println("No cases found for the specified complainant.");
            } else {
                System.out.print("Enter Case ID to view: ");
                String caseID = input.nextLine();
                searchCaseId(caseID);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void srchProsec(String Prosecutor){
        String searchquery= "SELECT * FROM cases WHERE Prosecutor = ?";

        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(searchquery)){

            pstmt.setString(1, Prosecutor);
            ResultSet resultSet = pstmt.executeQuery();
            
            int ctr = 0;
            while (resultSet.next()) {
                if (ctr == 0) {
                    System.out.println("Cases Found");
                }
                System.out.print("Case ID: " + resultSet.getString("caseID"));
                System.out.println(" | Accused: " + resultSet.getString("Accused"));
                
                ctr++;
            }

            if (ctr == 0) {
                System.out.println("No cases found for the specified prosecutor.");
            } else {
                System.out.print("Enter Case ID to view: ");
                String caseID = input.nextLine();
                searchCaseId(caseID);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void srchCStatus(String Status){
        String searchquery= "SELECT * FROM cases WHERE Status = ?";

        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(searchquery)){

            pstmt.setString(1, Status);
            ResultSet resultSet = pstmt.executeQuery();
            
            int ctr = 0;
            while (resultSet.next()) {
                if (ctr == 0) {
                    System.out.println("Cases Found");
                }
                System.out.print("Case ID: " + resultSet.getString("caseID"));
                System.out.println(" | Accused: " + resultSet.getString("Accused"));
                
                ctr++;
            }

            if (ctr == 0) {
                System.out.println("No cases found for the specified status.");
            }else {
                System.out.print("Enter Case ID to view: ");
                String caseID = input.nextLine();
                searchCaseId(caseID);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void srchHDate(String hearingDate){
        String searchquery= "SELECT * FROM cases WHERE hearingDate = ?";

        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(searchquery)){

            pstmt.setString(1, hearingDate);
            ResultSet resultSet = pstmt.executeQuery();
            
            int ctr = 0;
            while (resultSet.next()) {
                if (ctr == 0) {
                    System.out.println("Cases Found");
                }
                System.out.print("Case ID: " + resultSet.getString("caseID"));
                System.out.println(" | Accused: " + resultSet.getString("Accused"));
                
                ctr++;
            }

            if (ctr == 0) {
                System.out.println("No cases found for the specified hearing date.");
            } else {
                System.out.print("Enter Case ID to view: ");
                String caseID = input.nextLine();
                searchCaseId(caseID);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    //UPDATE LOGIC
    public void updateProsName(String caseID, String prosecutorName) {
        String updateq = "UPDATE cases SET Prosecutor = ? WHERE caseID = ?";
        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(updateq)){
            pstmt.setString(1, prosecutorName);
            pstmt.setString(2, caseID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Prosecutor name updated successfully!");
                searchCaseId(caseID);
            } else {
                System.out.println("Case not found. No updates made.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateWitness(String caseID, String witnessName) {
        String updateq = "UPDATE cases SET Witness = ? WHERE caseID = ?";
        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(updateq)){
            pstmt.setString(1, witnessName);
            pstmt.setString(2, caseID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Witness name updated successfully!");
                searchCaseId(caseID);
            } else {
                System.out.println("Case not found. No updates made.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateEvidence(String caseID, String evidence) {
        String updateq = "UPDATE cases SET Evidence = ? WHERE caseID = ?";
        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(updateq)){
            pstmt.setString(1, evidence);
            pstmt.setString(2, caseID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Evidence updated successfully!");
                searchCaseId(caseID);
            } else {
                System.out.println("Case not found. No updates made.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateCStatus(String caseID, String caseStatus) {
        String updateq = "UPDATE cases SET Status = ? WHERE caseID = ?";
        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(updateq)){
            pstmt.setString(1, caseStatus);
            pstmt.setString(2, caseID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Case status updated successfully!");
                searchCaseId(caseID);
            } else {
                System.out.println("Case not found. No updates made.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateHDate(String caseID, String hearingDate) {
        String updateq = "UPDATE cases SET hearingDate = ? WHERE caseID = ?";
        try(Connection connect = getConnection();
            PreparedStatement pstmt = connect.prepareStatement(updateq)){
            pstmt.setString(1, hearingDate);
            pstmt.setString(2, caseID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Hearing date updated successfully!");
                searchCaseId(caseID);
            } else {
                System.out.println("Case not found. No updates made.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}