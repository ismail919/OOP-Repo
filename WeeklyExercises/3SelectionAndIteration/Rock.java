import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        String personPlay;    // User's play -- "R", "P", or "S"
        String computerPlay;  // Computer's play -- "R", "P", or "S"
        int computerInt;      // Randomly generated number used to determine computer's play

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // Get player's play -- note that this is stored as a string
        System.out.print("Enter your play (R, P, or S): ");

        // Make player's play uppercase for ease of comparison
        personPlay = scan.nextLine().toUpperCase();

        // Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);

        // Translate computer's randomly generated play to string
        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            default:
                computerPlay = ""; // default case should not happen, but just in case
        }

        // Print computer's play
        System.out.println("Computer's play: " + computerPlay);

        // See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else
                System.out.println("Paper covers rock. Computer wins!!");
        else if (personPlay.equals("P"))
            if (computerPlay.equals("R"))
                System.out.println("Paper covers rock. You win!!");
            else
                System.out.println("Scissors cut paper. Computer wins!!");
        else if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors cut paper. You win!!");
            else
                System.out.println("Rock crushes scissors. Computer wins!!");
        else
            System.out.println("Invalid input. Please enter R, P, or S.");
    }
}
