package Chapter2;

import java.util.Scanner;

/**
 * Program to display total to the console
 *
 * @author Daniel Anderson
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = subtotal * .15;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity + " and the total is " + total);

    }

}
