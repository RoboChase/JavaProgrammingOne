package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to display elements to the console
 *
 * @author Daniel Anderson
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read: ");
        int a[] = new int[input.nextInt()];
        numbers(a);

        System.out.println("The average is: " + average(a));
        System.out.println("The contents of the array: ");
        System.out.println(java.util.Arrays.toString(a));
    }

    /**
     * numbers method program to display array to the console
     *
     * @param a array entered by the console
     */
    public static void numbers(int a[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        average(a);
    }

    /**
     * average method program to display the average to the console
     *
     * @param a array entered by the console
     * @return total
     */
    public static int average(int a[]) {
        int total = 0;
        for (int ar : a) {
            total += ar;

        }
        return total / a.length;
    }

    /**
     * printing method program to print the results to the console
     *
     * @param a array entered by the console
     */
    public static void printing(int a[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {

        }
    }
}
