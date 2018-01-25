package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to display Scores to the console
 *
 * @author Daniel Anderson
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int x = input.nextInt();
        int y[] = new int[x];

        System.out.print("Enter 4 scores: ");
        int best = -1;
        for (int i = 0; i < x; i++) {
            y[i] = input.nextInt();
            if (best < y[i]) {
                best = y[i];

            }
        }
        for (int i = 0; i < x; i++) {
            System.out.println("Student " + i + " score is " + y[i] + " and grade is " + grade(y[i], best));
        }
    }

    /**
     * Program to display grade to the console
     *
     * @param score number entered by the console
     * @param best number entered by the console
     * @return Score for the student
     */
    public static char grade(int score, int best) {
        if (score >= best - 10) {
            return 'A';

        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';

        }
    }
}
