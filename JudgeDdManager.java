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

    public void searchCaseId(String caseID) {
        String searchq = "SELECT * FROM cases WHERE caseID = ?";
        
        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(searchq)) {
            
            pstmt.setString(1, caseID);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                System.out.println("Case Found");
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
                System.out.println("Case not found");
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
                System.out.println("Found");
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
                System.out.println("Case not found");
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

            if (resultSet.next()) {
                System.out.println("Found");
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
                System.out.println("Case not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        

        }


}
