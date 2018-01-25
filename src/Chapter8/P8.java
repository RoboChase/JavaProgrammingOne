package Chapter8;

import java.util.Scanner;

/**
 * Program to display strings to the console
 *
 * @author Daniel Anderson
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] hours = new double[4][5];
        String[] ID = {"A", "B", "C", "D"};
        String answer;
        do {
            System.out.print("Enter the salesman ID as A, B, C, or D: ");
            String salesman = input.next();

            System.out.print("Enter the day as M, T, W, H, or F:");
            String day = input.next().toUpperCase();

            System.out.print("Enter the amount of the sale for " + salesman + " on " + day + ":");
            double sale = input.nextDouble();

            switch (salesman) {
                case "A": {
                    switch (day) {
                        case "M":
                            hours[0][0] = (sale + hours[0][0]);
                            break;
                        case "T":
                            hours[0][1] = (sale + hours[0][1]);
                            break;
                        case "W":
                            hours[0][2] = (sale + hours[0][2]);
                            break;
                        case "H":
                            hours[0][3] = (sale + hours[0][3]);
                            break;
                        case "F":
                            hours[0][4] = (sale + hours[0][4]);
                            break;
                    }
                    break;

                }
                case "B": {
                    switch (day) {
                        case "M":
                            hours[1][0] = (sale + hours[1][0]);
                            break;
                        case "T":
                            hours[1][1] = (sale + hours[1][1]);
                            break;
                        case "W":
                            hours[1][2] = (sale + hours[1][2]);
                            break;
                        case "H":
                            hours[1][3] = (sale + hours[1][3]);
                            break;
                        case "F":
                            hours[1][4] = (sale + hours[1][4]);
                            break;
                    }
                    break;

                }
                case "C": {
                    switch (day) {
                        case "M":
                            hours[2][0] = (sale + hours[2][0]);
                            break;
                        case "T":
                            hours[2][1] = (sale + hours[2][1]);
                            break;
                        case "W":
                            hours[2][2] = (sale + hours[2][2]);
                            break;
                        case "H":
                            hours[2][3] = (sale + hours[2][3]);
                            break;
                        case "F":
                            hours[2][4] = (sale + hours[2][4]);
                            break;
                    }
                    break;
                }
                case "D": {

                    switch (day) {
                        case "M":
                            hours[3][0] = (sale + hours[3][0]);
                            break;
                        case "T":
                            hours[3][1] = (sale + hours[3][1]);
                            break;
                        case "W":
                            hours[3][2] = (sale + hours[3][2]);
                            break;
                        case "H":
                            hours[3][3] = (sale + hours[3][3]);
                            break;
                        case "F":
                            hours[3][4] = (sale + hours[3][4]);
                            break;
                    }

                    break;
                }

            }

            System.out.println("More data? Enter Y for more or N to stop");
            answer = input.next().toUpperCase();

        } while (!answer.equals("N"));
        System.out.println("\t\tMon\tTues\tWed\tThurs\tFri");

        for (int i = 0; i < hours.length; i++) {
            System.out.println("\t" + ID[i] + "\t ");
            for (int j = 0; j < hours[i].length; j++) {
                System.out.print("\t\t" + hours[i][j] + "");
            }
            System.out.println();
        }
    }
}
