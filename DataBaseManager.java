import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBaseManager {
    private static final String url = "jdbc:mysql://localhost:3306/finals";
    private static final String user = "root";
    private static final String password = "";
    Scanner input = new Scanner(System.in);

    public Connection getConnection() {
        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            return connect;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void AddUser(String username, String password, String role) {
        String insertq = "INSERT INTO login (username, password, role) VALUES (?, ?, ?)";
        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(insertq)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, role);
            pstmt.executeUpdate();
            System.out.println("User added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ViewUserList() {
        String selectq = "SELECT * FROM login";
        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(selectq);
             ResultSet resultSet = pstmt.executeQuery()) {

            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String role = resultSet.getString("role");
                System.out.println("Username: " + username + " | Role: " + role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DeleteUser(String username) {
        String deleteq = "DELETE FROM login WHERE username = ?";
        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(deleteq)) {
            pstmt.setString(1, username);
            int rowsAffected = pstmt.executeUpdate();
            System.out.print("Enter username to delete: ");
            username = input.nextLine();
            if (rowsAffected > 0) {
                System.out.println("User deleted successfully!");
            } else {
                System.out.println("User not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean validateUser(String username, String password) {
        String selectq = "SELECT * FROM login WHERE username = ? AND password = ?";

        try (Connection connect = getConnection();
             PreparedStatement pstmt = connect.prepareStatement(selectq)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");

                if (role.equals("Admin")) {
                    Admin admin = new Admin(rs.getInt("id"), username, password, role);
                    admin.RoleDashb();
                } else if (role.equals("Judge")) {
                    Judge judge = new Judge(rs.getInt("id"), username, password, role);
                    judge.RoleDashb();
                } else if (role.equals("Staff")) {
                    Staff staff = new Staff(rs.getInt("id"), username, password, role);
                    staff.RoleDashb();
                } else {
                    System.out.println("Unknown role. Access denied.");
                    return false;
                }
                return true;
            }
            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
