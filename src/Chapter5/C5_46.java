package Chapter5;

import java.util.Scanner;

/**
 * Program to display ' A reversed string ' to the console
 *
 * @author Daniel Anderson
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = 0;
        while (X == 0) {
            System.out.print("Enter a string so I can reverse it: ");
            String a = input.nextLine();
            System.out.println("You type the string " + a + ". The string reversed is " + (new StringBuffer(a).reverse().toString()));
        }
    }
}
