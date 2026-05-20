import java.util.Scanner;

public class Judge extends User {

    public Judge(int id, String username, String password, String role) {
        super(id, username, password, role);
    }

    Scanner input = new Scanner(System.in);

    @Override
    public void RoleDashb() {
        System.out.println("");
        while (true) {
        System.out.println("-----------------------------------------------");
        System.out.println("             Welcome " + username + "!");
        System.out.println("You have access to the Judge dashboard.");
        System.out.println("-----------------------------------------------");
        System.out.println("[1] Add Case");
        System.out.println("[2] Search Case");
        System.out.println("[3] Update Case Status");
        System.out.println("[4] Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                AddCase();
                break;
            case 2:
                SearchCase();
                break;
            case 3:
                //
              
                break;
            case 4:
                System.out.println("Exiting Judge dashboard...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
             }       
        }
    }
    public void AddCase() {
        while (true) {
            System.out.println("");
            System.out.print("Add Case Number: ");
            String caseNumber = input.nextLine();
            System.out.print("Name of The Accused: ");
            String accusedName = input.nextLine();
            System.out.print("Case Type: ");
            String caseType = input.nextLine();
            System.out.print("Nature of Case: ");
            String natureOfCase = input.nextLine();
            System.out.print("Name of Complainant: ");
            String complainantName = input.nextLine();
            System.out.print("Assign Prosecutor: ");
            String prosecutorName = input.nextLine();
            System.out.print("Witnesses: ");
            String witnesses = input.nextLine();
            System.out.print("Date Filed: ");
            String dateFiled = input.nextLine();
            System.out.print("Evidence: ");
            String evidence = input.nextLine();
            System.out.print("Case Status: ");
            String caseStatus = input.nextLine();
            System.out.print("Assign Hearing Date: ");
            String hearingDate = input.nextLine();

            System.out.println("Case added successfully!");
            System.out.println("Do you want to add another case? (yes/no)");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    public void SearchCase() {
        System.out.println("");
        System.out.print("[1] Search by Case Number: ");
        System.out.print("[2] Search by Name of The Accused: ");
        System.out.print("[3] Search by Case Type: ");
        System.out.print("[4] Search by Nature of Case: ");
        System.out.print("[5] Search by Name of Complainant: ");
        System.out.print("[6] Search by Assigned Prosecutor: ");
        System.out.print("[7] Search by Date Filed: ");
        System.out.print("[8] Search by Case Status: ");
        System.out.print("[9] Search by Assigned Hearing Date: ");
        System.out.print("Enter your choice: ");

        String choice = input.nextLine();

        switch (choice) {
            case "1":
                System.out.print("Enter Case Number: ");
                String caseNumber = input.nextLine();
                break;
            case "2":
                System.out.print("Enter Name of The Accused: ");
                String accusedName = input.nextLine();
                break;
            case "3":
                System.out.print("Enter Case Type: ");
                String caseType = input.nextLine();
                break;
            case "4":
                System.out.print("Enter Nature of Case: ");
                String natureOfCase = input.nextLine();
                break;
            case "5":
                System.out.print("Enter Name of Complainant: ");
                String complainantName = input.nextLine();
                break;
            case "6":
                System.out.print("Enter Assigned Prosecutor: ");
                String prosecutorName = input.nextLine();
                break;
            case "7":
                System.out.print("Enter Date Filed: ");
                String dateFiled = input.nextLine();
                break;
            case "8":
                System.out.print("Enter Case Status: ");
                String caseStatus = input.nextLine();
                break;
            case "9":
                System.out.print("Enter Assigned Hearing Date: ");
                String hearingDate = input.nextLine();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    
    public void UpdateCaseStatus() {
        System.out.println("");
        System.out.print("Enter Case Number to Update Status: ");
        String caseNumber = input.nextLine();

    }



}
