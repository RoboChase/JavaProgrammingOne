package Chapter3;

import java.util.Scanner;

/**
 * Program to display Heads or Tails to the console
 *
 * @author Daniel Anderson
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for Heads and 1 for Tails: ");
        int number1 = (int) (Math.random() * 2);
        double answer = input.nextDouble();
        if (number1 > 0) {
            if (answer > 0) {
                System.out.println("Correct! The answer was tails!");
            }
        }
        if (number1 <= 0) {
            if (answer <= 0) {
                System.out.println("Correct! The answer was heads!");
            } else {
                System.out.println("Wrong! The answer was " + number1);
            }
        }
    }

}
