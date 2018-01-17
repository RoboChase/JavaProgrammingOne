package Chapter5;

import java.util.Scanner;

/**
 * Program to display ' Rock Paper Scissors game ' to the console
 *
 * @author Daniel Anderson
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int CG = 0;
        int PG = 0;
        do {
            System.out.print("Enter '0' for Rock, '1' for Paper, and '2' for Scissors: ");
            int playerGuess = input.nextInt();
            int computerGuess = (int) (Math.random() * 3);

            switch (computerGuess) {
                case 0: // computer is rock
                    if (playerGuess == 0) {
                        System.out.println("TIE");
                    } else if (playerGuess == 1) {
                        System.out.println("You win");
                        ++PG;
                    } else if (playerGuess == 2) {
                        System.out.println("You lose");
                        ++CG;
                    }
                    break;
                case 1: // computer is paper
                    if (playerGuess == 0) {
                        System.out.println("You lose!");
                        ++CG;
                    } else if (playerGuess == 1) {
                        System.out.println("It's a tie!");
                    } else if (playerGuess == 2) {
                        System.out.println("You win!");
                        ++PG;
                    }
                    break;
                case 2: // computer is scissors
                    if (playerGuess == 0) {
                        System.out.println("You win!");
                        ++PG;
                    } else if (playerGuess == 1) {
                        System.out.println("You lose!");
                        ++CG;
                    } else if (playerGuess == 2) {
                        System.out.println("It's a tie!");
                    }
                    break;
            }

        } while (CG < 2 && PG < 2);
        System.out.println("The computer's score is: " + CG + ", and your's was: " + PG);
        if (PG > CG) {
            System.out.println("You win!");
        } else if (CG > PG) {
            System.out.println("You lose!");
        }
    }
}
