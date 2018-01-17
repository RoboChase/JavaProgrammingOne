package Chapter3;

import java.util.Scanner;

/**
 * Program to display correct number to the console
 *
 * @author Daniel Anderson
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to see if it is divisible by 5 or 6: ");
        int number = input.nextInt();
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by 5 and 6");
        } else {
            System.out.println(number + " is not divisible by 5 and 6");
        }
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6");
        } else {
            System.out.println(number + " is not divisble by 5 or 6");
        }
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(number + " is divisible by either 5 or 6, but not both");
        } else {
            System.out.println(number + " is not divisible by either 5 or 6");
        }
    }
}
