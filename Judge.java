import java.util.Scanner;
public class Judge extends User {

    public Judge(int id, String username, String password, String role) {
        super(id, username, password, role);
    }
    Scanner input = new Scanner(System.in);

    @Override
    public void RoleDashb() {
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("             Welcome " + username + "!");
        System.out.println("You have access to the Judge dashboard.");
        System.out.println("-----------------------------------------------");
        System.out.println("[1] Add Case");
        System.out.println("[2] Search Case");
        System.out.println("[3] Update Case Status");
        System.out.println("[4] Exit");
        System.out.println("Enter your choice: ");
        String choice=input.nextLine();
        //CREATE BAG O NAMAN NA FILE TAS TAWGON LANG
    }
}