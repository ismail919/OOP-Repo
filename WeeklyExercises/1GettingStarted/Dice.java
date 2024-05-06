import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user for the number of sides for each die
        System.out.print("How many sides does die 1 have? ");
        int sidesDie1 = scanner.nextInt();
        System.out.print("How many sides does die 2 have? ");
        int sidesDie2 = scanner.nextInt();

        // Variables to keep track of sum and count of rolls for each die
        int sumDie1 = 0, sumDie2 = 0;
        int countRolls = 3;

        // "Roll" the dice three times
        for (int i = 0; i < countRolls; i++) {
            // Generate random numbers for each die
            int rollDie1 = random.nextInt(sidesDie1) + 1;
            int rollDie2 = random.nextInt(sidesDie2) + 1;

            // Update the sum for each die
            sumDie1 += rollDie1;
            sumDie2 += rollDie2;

            // Output the result of each roll
            System.out.println("Die 1 roll " + (i + 1) + " = " + rollDie1);
            System.out.println("Die 2 roll " + (i + 1) + " = " + rollDie2);
        }

        // Calculate and output the average for each die
        double avgDie1 = (double) sumDie1 / countRolls;
        double avgDie2 = (double) sumDie2 / countRolls;
        System.out.println("Die 1 rolled a total of " + sumDie1 + " and rolled " + avgDie1 + " on average.");
        System.out.println("Die 2 rolled a total of " + sumDie2 + " and rolled " + avgDie2 + " on average.");
    }
}
