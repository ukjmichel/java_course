import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create an instance of Random class
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        int guess = 0; // User's guess
        int numberOfTries = 0; // Number of attempts

        System.out.println("Guess the number between 1 and 100:");

        // Loop until the user guesses the correct number
        while (guess != targetNumber) {
            // Read the user's guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            // Provide feedback on the user's guess
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + numberOfTries + " attempts.");
            }
        }

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}
