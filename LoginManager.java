import java.sql.ResultSet;
import java.util.Scanner;

public class LoginManager {
    private DataBaseManager dbManager;
    private Scanner input;

    public LoginManager(DataBaseManager dbManager, Scanner input) {
        this.dbManager = dbManager;
        this.input = input;
    }

     public void validateUser() {
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();

            boolean isValid = dbManager.validateUser(username, password);
            if (isValid) {
               String squery = "SELECT role FROM login WHERE username=? AND password=?";
                          

                System.out.println("Login successful!");
                return;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Invalid username or password. Attempts remaining: " + attempts);
                       System.out.println();
                } else {
                    System.out.println("Invalid username or password. Attempts remaining: " + attempts);
                    System.out.println();
                    System.out.println("Terminated. Too many failed attempts.");
                    return;
                }
            }
        }
    }

    
}
