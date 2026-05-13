public class Admin extends User {

    public Admin(int id, String username, String password, String role) {
        super(id, username, password, role);
    }
@Override
    public void displayDashb() {
        System.out.println("");
        System.out.println("Welcome" + username + "!");
        System.out.println("You have access to the Judge dashboard.");

        

    }
}

