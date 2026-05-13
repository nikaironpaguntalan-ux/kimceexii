public class Staff extends User {

    public Staff(int id, String username, String password, String role) {
        super(id, username, password, role);

    }
@Override
    public void displayDashb() {
        System.out.println("");
        System.out.println("Welcome" + username + "!");
        System.out.println("You have access to the Staff dashboard.");
        

    }
    
}
