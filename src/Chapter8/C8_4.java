package Chapter8;

/**
 * Program to display hours to the console
 *
 * @author Daniel Anderson
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.printf("\t\tSun\tMon\tTues\tWed\tThurs\tFri\tSat\tTotal");

        double[][] hours = {
            //Employee 0
            {2, 4, 3, 4, 5, 8, 8},
            ////Employee 1
            {7, 3, 4, 3, 3, 4, 4},
            //Employee 2
            {3, 3, 4, 3, 3, 2, 2},
            //Employee 3
            {9, 3, 4, 7, 3, 4, 1},
            //Employee 4
            {3, 5, 4, 3, 6, 3, 8},
            //Employee 5
            {3, 4, 4, 6, 3, 4, 4},
            //Employee 6
            {3, 7, 4, 8, 3, 8, 4},
            //Employee 7
            {6, 3, 5, 9, 2, 7, 9}};

        for (int i = 0; i < hours.length; i++) {
            int total = 0;

            System.out.print("\nEmployee" + i + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(hours[i][j] + "\t");
                total += hours[i][j];
            }
            System.out.print(total);
        }
    }
}
