import java.util.Scanner;

public class LoginManager {
    private DataBaseManager dbManager;
    private Scanner input;

    public LoginManager(DataBaseManager dbManager, Scanner input) {
        this.dbManager = dbManager;
        this.input = input;

        
    }

      
    public void AddUser() {
        DataBaseManager dbManager = new DataBaseManager();
        System.out.print("Enter new username: ");
        String username = input.nextLine();
        System.out.print("Enter new password: ");
        String password = input.nextLine();
        System.out.print("Enter role: ");
        String role = input.nextLine();
        dbManager.AddUser(username, password, role);

    }

     public void validateUser() {
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("");
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();
          

            boolean isValid = dbManager.validateUser(username, password);
            if (isValid) {
                
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