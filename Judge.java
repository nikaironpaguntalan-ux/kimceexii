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
    
                break;
            case 4:
                System.out.println("Exiting Judge dashboard...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
             }       
        }
    }
    public void AddCase() {
        while (true) {
            JudgeDdManager judgeDdManager = new JudgeDdManager();
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
            judgeDdManager.addCase(caseNumber, caseType, natureOfCase, dateFiled, accusedName, complainantName, caseStatus, prosecutorName, witnesses, evidence, hearingDate);
            System.out.print("Do you want to add another case? (yes/no): ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    public void SearchCase() {
        System.out.println("");
        JudgeDdManager judgeDdManager = new JudgeDdManager();
        System.out.println("[1] Search by Case Number: ");
        System.out.println("[2] Search by Name of The Accused: ");
        System.out.println("[3] Search by Case Type: ");
        System.out.println("[4] Search by Nature of Case: ");
        System.out.println("[5] Search by Name of Complainant: ");
        System.out.println("[6] Search by Assigned Prosecutor: ");
        System.out.println("[7] Search by Case Status: ");
        System.out.println("[8] Search by Assigned Hearing Date: ");
        System.out.print("Enter your choice: ");
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                System.out.print("Enter Case Number: ");
                String caseNumber = input.nextLine();
                judgeDdManager.searchCaseId(caseNumber);
                break;
            case "2":
                System.out.print("Enter Name of The Accused: ");
                String accusedName = input.nextLine();
                judgeDdManager.searchAccused(accusedName);
                break;
            case "3":

                System.out.print("Enter Case Type: ");
                String caseType = input.nextLine();
                judgeDdManager.srchCaseType(caseType);
                break;
            case "4":
                System.out.print("Enter Nature of Case: ");
                String natureOfCase = input.nextLine();
                judgeDdManager.srchNatureT(natureOfCase);
                break;
            case "5":
                System.out.print("Enter Name of Complainant: ");
                String complainantName = input.nextLine();
                judgeDdManager.srchCompName(complainantName);
                break;
            case "6":
                System.out.print("Enter Assigned Prosecutor: ");
                String prosecutorName = input.nextLine();
                judgeDdManager.srchProsec(prosecutorName);
                break;
            case "7":
                System.out.print("Enter Case Status: ");
                String caseStatus = input.nextLine();
                judgeDdManager.srchCStatus(caseStatus);
                break;
            case "8":
                System.out.print("Enter Assigned Hearing Date: ");
                String hearingDate = input.nextLine();
                judgeDdManager.srchHDate(hearingDate);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    
    public void UpdateCaseStatus() {
        System.out.println("");
        System.out.println("[1] Update Prosecutor Name: ");
        System.out.println("[2] Update Witness Name: ");
        System.out.println("[3] Update Evidence: ");
        System.out.println("[4] Update Case Status: ");
        System.out.println("[5] Update Hearing Date: ");
        System.out.print("Enter your choice: ");
        String choice = input.nextLine();
        JudgeDdManager judgeDdManager = new JudgeDdManager();
        switch (choice) {
            case "1":
                System.out.print("Enter Case Number: ");
                String caseNumber = input.nextLine();
                System.out.print("Enter New Prosecutor Name: ");
                String prosecutorName = input.nextLine();
                judgeDdManager.updateProsName(caseNumber, prosecutorName);
                break;
            case "2":
                System.out.print("Enter Case Number: ");
                String caseNum = input.nextLine();
                System.out.print("Enter New Witness Name: ");
                String witnessName = input.nextLine();
                judgeDdManager.updateWitness(caseNum, witnessName);
               
                break;
            case "3":
                System.out.print("Enter Case Number: ");
                String cNumber = input.nextLine();
                System.out.print("Enter New Evidence: ");
                String evidence = input.nextLine();
                judgeDdManager.updateEvidence(cNumber, evidence);

               
                break;
            case "4":
                System.out.print("Enter Case Number: ");
                String casenumber = input.nextLine();
                System.out.print("Enter New Case Status: ");
                String caseStatus = input.nextLine();
                judgeDdManager.updateCStatus(casenumber, caseStatus);
               
                break;
            case "5":
                System.out.print("Enter Case Number: ");
                String cNum = input.nextLine();
                System.out.print("Enter New Hearing Date: ");
                String hearingDate = input.nextLine();
                judgeDdManager.updateHDate(cNum, hearingDate);       
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }


    }



}
