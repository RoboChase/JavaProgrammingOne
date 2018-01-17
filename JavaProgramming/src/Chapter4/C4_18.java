/**
 * Program to display Grade and Class to the console
 *
 * @author Daniel Anderson
 */
package Chapter4;

import java.util.Scanner;

public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);

        if (c != '1' && c != '2' && c != '3' && c != '4') {
            System.out.println("Invalid input");
            System.exit(0);
        }

        switch (b) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.print("Invalid input ");
                System.exit(0);
        }
        switch (c) {
            case '1':
                System.out.print("Freshman ");
                break;
            case '2':
                System.out.print("Sophomore ");
                break;
            case '3':
                System.out.print("Junior ");
                break;
            case '4':
                System.out.print("Senior ");
                break;
        }

    }

}
