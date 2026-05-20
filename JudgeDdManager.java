import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class JudgeDdManager {
    Scanner input = new Scanner(System.in);

        public void addCase(String caseID, String caseType, String caseNature, String fileDate, String Accused, String Complainant, String Status, String Prosecutor, String Judge ){
            String insertcase= "INSERT INTO cases (caseID, caseType, caseNature,fileDate, Accused, Complainant, Status, Prosecutor, Judge ) VALUES(?,?,?,?,?,?,?,?,?)";
              try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(insertcase)) {
                pstmt.setString(1, caseID);
                pstmt.setString(2, caseType);
                pstmt.setString(3, caseNature);
                 pstmt.setString(4, fileDate);
                pstmt.setString(5, Accused);
                pstmt.setString(6, Complainant);
                pstmt.setString(7, Status);
                pstmt.setString(8,Prosecutor);
                pstmt.setString(9, Judge);
                pstmt.executeUpdate();
                System.out.println("Case Added Successfully");
             } catch (SQLException e) {
            e.printStackTrace();
        }
    }




        }
  


}    

