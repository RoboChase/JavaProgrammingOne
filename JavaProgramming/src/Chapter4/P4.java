/**
 * Program to display Winner to the console
 *
 * @author Daniel Anderson
 */
package Chapter4;

import java.util.Scanner;

public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the first Bidder: ");
        String name = input.next();
        System.out.print("Enter hours of work required: ");
        int hours = input.nextInt();
        System.out.print("Enter amount " + name + " charges per hour: $");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter the name of the second Bidder: ");
        String name2 = input.next();
        System.out.print("Enter hours of work required: ");
        int hours2 = input.nextInt();
        System.out.print("Enter amount " + name2 + " charges per hour: $");
        double hourlyRate2 = input.nextDouble();

        double firstCost = hours * hourlyRate;
        double secondCost = hours2 * hourlyRate2;

        System.out.println("");
        if (firstCost < secondCost) {
            System.out.println("The winner is " + name);
            System.out.printf("The total cost is $%.2f", firstCost);
            System.out.println("");
        } else if (firstCost > secondCost) {
            System.out.println("The winner is " + name2);
            System.out.printf("The total cost is $%.2f", secondCost);
            System.out.println("");
        } else if ((firstCost == secondCost) && hours < hours2) {
            System.out.println("The winner is " + name);
            System.out.printf("The total cost is $%.2f with %d hours.", firstCost, hours);
            System.out.println("");
        } else if ((firstCost == secondCost) && hours > hours2) {
            System.out.println("The winner is " + name2);
            System.out.printf("The total cost is $%.2f with %d hours.", secondCost, hours2);
            System.out.println("");
        } else if ((firstCost == secondCost) && hours == hours2) {
            System.out.println("Both " + name + " and " + name2 + " have identical bids.");
            System.out.printf("\nNumber of hours: ");
            System.out.printf("\n" + name + " = " + hours);
            System.out.printf("\t" + name2 + " = " + hours2);
            System.out.printf("\nCost per hour: ");
            System.out.printf("\n" + name + " = " + hourlyRate);
            System.out.printf("\t" + name2 + " = " + hourlyRate2);
            System.out.printf("\nTotal Cost: ");
            System.out.printf("\n" + name + " = " + firstCost);
            System.out.printf("\t" + name2 + " = " + secondCost);
            System.out.println("");
        }
    }
}
