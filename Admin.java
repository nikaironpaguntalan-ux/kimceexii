import java.util.Scanner;
public class Admin extends User {

    public Admin(int id, String username, String password, String role) {
        super(id, username, password, role);
    }

    Scanner input = new Scanner(System.in);

    @Override
    public void RoleDashb() {
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("             Welcome " + username + "!");
        System.out.println("You have access to the Admin dashboard.");
        System.out.println("-----------------------------------------------");
        while(true){
        System.out.println("");
        System.out.println("[1] Add New User ");
        System.out.println("[2] View User List");
        System.out.println("[3] Delete User");
        System.out.println("[4] Exit");
        System.out.print("Enter your choice: ");
        String choice=input.nextLine();
        if (choice.equals("1")){
            LoginManager loginManager = new LoginManager(new DataBaseManager(), input);
            loginManager.AddUser();
        }else if (choice.equals("2")){
            DataBaseManager dbManager = new DataBaseManager();
            dbManager.ViewUserList();
        }else if (choice.equals("3")){
            DataBaseManager dbManager = new DataBaseManager();
                System.out.print("Enter username to delete: ");
                String username = input.nextLine();
                dbManager.DeleteUser(username);
        }else if (choice.equals("4")){
            System.out.println("Exiting Admin dashboard...");
            break;
        }else{
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
} 

