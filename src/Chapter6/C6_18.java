package Chapter6;

import java.util.Scanner;

/**
 * Program to display password to the console
 *
 * @author Daniel Anderson
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = input.next();

        if (passwordTester(password) == true) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    /**
     * Boolean Method
     *
     * @param password the password entered by the user
     *
     * @return true or false
     */
    public static boolean passwordTester(String password) {
        int Digit = 0;
        if (password.length() < 8) {
            System.out.println("A password must have at least eight characters");
            return false;
        }
        for (int x = 0; x < password.length(); x++) {
            if (!Character.isLetterOrDigit(password.charAt(x))) {
                System.out.println("A password must consist of only letters and digits");
                return false;
            }
        }
        for (int X = 0; X < password.length(); X++) {
            if (Character.isDigit(password.charAt(X))) {
                ++Digit;
            }
        }
        if (Digit < 2) {
            System.out.println("A password must contain at least two digits");
            return false;
        }
        return true;
    }

}
