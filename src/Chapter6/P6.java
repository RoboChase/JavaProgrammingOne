package Chapter6;

import java.util.Scanner;

/**
 * Program to display conversions to the console
 *
 * @author Daniel Anderson
 */
public class P6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros does a dollar buy? ");
        double euroMath = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy? ");
        double sterlingMath = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        double yenMath = input.nextDouble();

        String A2 = "";
        int n = 0;
        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            double amount = input.nextDouble();

            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            String A = input.next().toUpperCase();
            char a = A.charAt(0);
            switch (a) {
                case 'E':
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.", amount, convert(amount, euroMath));
                    break;
                case 'P':
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterlings.", amount, convert(amount, sterlingMath));
                    break;
                case 'Y':
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.", amount, convert(amount, yenMath));
                    break;
            }

            do {
                System.out.print("\nAre there more conversions to perform? (yes/no)");
                A2 = input.next();
            } while (!A2.equalsIgnoreCase("no") && !A2.equalsIgnoreCase("yes"));

        } while (A2.equalsIgnoreCase("yes"));
    }

    /**
     *
     * @param dollars amount entered by the user
     *
     * @param exchangeCurrency the amount a dollar can receive from another
     * currency
     *
     * @return amount of money that can be received
     */
    public static double convert(double dollars, double exchangeCurrency) {
        if (dollars > 100) {
            return (dollars * 0.95 * exchangeCurrency);
        } else {
            return (dollars * 0.90 * exchangeCurrency);
        }

    }

}
