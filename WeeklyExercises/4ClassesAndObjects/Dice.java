import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random Random = new Random();

        // Prompt the user for the number of sides for two dice
         System.out.print("Enter the number of sides for each die: ");
         int sides = scanner.nextInt();

        // Variables to keep track of sum and count of rolls for each die
        int sumDie1 = 0, sumDie2 = 0;
        int countRolls = 3;

        // "Roll" the dice three times
        for (int i = 0; i < countRolls; i++) {
            // Generate random numbers for each die
            int rollDie1 = Random.nextInt(sides) + 1;
            int rollDie2 = Random.nextInt(sides) + 1;

            // Update the sum for each die
            sumDie1 += rollDie1;
            sumDie2 += rollDie2;

            // Output the result of each roll
            System.out.println("Roll " + (i + 1) + ": Die 1 = " + rollDie1 + ", Die 2 = " + rollDie2);
        }

        // Calculate and output the average for each die
        double avgDie1 = (double) sumDie1 / countRolls;
        double avgDie2 = (double) sumDie2 / countRolls;
        System.out.println("\nAverage for Die 1: " + avgDie1);
        System.out.println("Average for Die 2: " + avgDie2);
    }
}
