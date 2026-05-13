import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBaseManager dbManager = new DataBaseManager();
        Scanner input = new Scanner(System.in);
        LoginManager loginManager = new LoginManager(dbManager, input);
        boolean running = true;

        System.out.println("--------------------------------------------------------------");
        System.out.println("        WELCOME TO DEPARTMENT OF JUSTICE RECORD SYSTEM");
        System.out.println("--------------------------------------------------------------");
    while (running) {
        loginManager.validateUser();


        input.close();
        }

    }
}