package Chapter2;

import java.util.Scanner;

/**
 * Program to display price + tax to the console
 *
 * @author Daniel Anderson
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price for the meal, drink, and the dessert: ");
        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();
        double food = meal + drink + dessert;
        double tax = food * .10;
        double tip = food * .15;
        double total = food + tax + tip;
        System.out.println("The price of food is " + food);
        System.out.println("The price of the tax is " + tax);
        System.out.println("The price of the tip is " + tip);
        System.out.println("The total altogether would be " + total);
    }
}
