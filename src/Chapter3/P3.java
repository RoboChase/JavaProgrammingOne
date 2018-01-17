package Chapter3;

import java.util.Scanner;

/**
 * Program to display greater number to the console
 *
 * @author Daniel Anderson
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double one = input.nextDouble();
        double two = input.nextDouble();
        if (one < two) {
            System.out.println("The first number is less than the second.");
        }
        if (one > two) {
            System.out.println("The first number is greater than the second.");
        }
        if (one == two) {
            System.out.println("The first number is equal to the second.");
        }
        if (one <= two) {
            System.out.println("The first number is less than or equal to the second.");
        }
        if (one != two) {
            System.out.println("The first number is not equal to the second");
        }
        if (two == 0) {
            System.out.println("Cannot divide by zero");
        } else if (one / two < 1) {
            System.out.println("Proper fraction");
        } else if (one / two > 1) {
            System.out.println("Improper fraction");
        }
        if (one >= 90) {
            System.out.println("A");
        } else if (one >= 80) {
            System.out.println("B");
        } else if (one >= 70) {
            System.out.println("C");
        } else if (one >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (one >= 1 && one <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }

}
