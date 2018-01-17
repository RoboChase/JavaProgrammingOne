/**
 * Program to display Total Pay to the console
 *
 * @author Daniel Anderson
 */
package Chapter4;

import java.util.Scanner;

public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double sRate = input.nextDouble();
        double grossPay = (payRate * hoursWorked);
        double fWithholding = fRate * 100;
        double sWithholding = sRate * 100;
        double fTotal = fRate * grossPay;
        double sTotal = sRate * grossPay;
        double total = fTotal + sTotal;
        double Total = grossPay - total;
        System.out.printf("Employee name: %s", name);
        System.out.printf("\nHours Worked: %.2f", hoursWorked);
        System.out.printf("\nPay Rate: $%.2f", payRate);
        System.out.printf("\nGross Pay: $%.2f", grossPay);
        System.out.println("\nDeductions: ");
        System.out.printf("\n\tFederal withholding: (%.2f%%): $%.2f", fWithholding, fTotal);
        System.out.printf("\n\tState withholding: (%.2f%%) : $%.2f", sWithholding, sTotal);
        System.out.printf("\n\tTotal deduction: %.2f", total);
        System.out.printf("\nNet pay: $%.2f", Total);
        System.out.println();
    }
}
