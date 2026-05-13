import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseManager {
    private static final String url = "jdbc:mysql://localhost:3306/finals";
    private static final String user = "root";
    private static final String password = "";

     public Connection getConnection() {
        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            return connect;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public boolean validateUser(String username, String password){
        String selectq= "SELECT * FROM login WHERE username = ? AND password = ?";
        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(selectq)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            ResultSet rs = pstmt.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}