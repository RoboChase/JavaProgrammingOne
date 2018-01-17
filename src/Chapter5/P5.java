package Chapter5;

import java.util.Scanner;

/**
 * Program to display votes to the console
 *
 * @author Daniel Anderson
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        //Initial value for yes and no votes
        int Yes = 0;
        int No = 0;
        int Invalid = 0;
        int Q = 0;
        //Ask to enter answer
        do {
            System.out.print("Enter 'Y' to vote yes, 'N' to vote no, and 'Q' to quit voting: ");
            String A = input.next();
            char answer = A.charAt(0);
            switch (answer) {
                //If answer is Yes
                case 'Y':
                    Yes++;
                    continue;
                case 'y':
                    Yes++;
                    continue;
                //If answer is No
                case 'N':
                    No++;
                    continue;
                case 'n':
                    No++;
                    continue;
                //If wanting to quit    
                case 'Q':
                    System.out.println("Yes votes: " + Yes);
                    System.out.println("No votes: " + No);
                    System.out.println("Invalid votes: " + Invalid);
                    System.out.println("Total votes: " + (Yes + No + Invalid));
                    Q++;
                    System.exit(0);
                case 'q':
                    System.out.println("Yes votes: " + Yes);
                    System.out.println("No votes: " + No);
                    System.out.println("Invalid votes: " + Invalid);
                    System.out.println("Total votes: " + (Yes + No + Invalid));
                    Q++;
                    System.exit(0);
                //If answer is not valid
                default:
                    System.out.print("INVALID CODE: ");
                    Invalid++;
            }
        } while (Q == 0);
    }
}
