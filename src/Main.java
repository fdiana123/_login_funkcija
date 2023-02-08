import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);

        System.out.println("E-mail: ");
        String user_email= scam.nextLine();

        System.out.println("Password: ");
        String user_passwowd= scam.nextLine();

        if(user_email.equals("diana@.lv") && user_passwowd.equals("parole1")) {
          System.out.println("Welcome " + user_email+"!");
        } else {
            System.out.println("Login or password is not correct, please try one more time!");
        }




    }
}