package Chapter7;

import java.util.Scanner;

/**
 * Program to display numbers to the console
 *
 * @author Daniel Anderson
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double x[] = new double[10];
        System.out.print("Enter 10 numbers: ");
        System.out.println("The minimum number is " + min(x));
    }

    /**
     * Program to display minimum to the console
     *
     * @param array an array of numbers created by the console
     *
     * @return the minimum number
     */
    public static double min(double[] array) {
        double whateveryouwant = 0;

        Scanner input = new Scanner(System.in);
        double x[] = new double[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextDouble();
            if (whateveryouwant > x[i]) {
                whateveryouwant = x[i];
            }
        }
        return x[0];
    }
}
