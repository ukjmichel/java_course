package app;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;

public class BingoNumberGeneratorv2 {

    public static void main(String[] args) {
        Random random = new Random(); // Create a Random object for generating random numbers
        HashSet<Integer> generatedNumbers = new HashSet<>(); // A set to store unique bingo numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 'Enter' to generate the next bingo number, or 'q' to quit.");

        // Keep generating numbers until we have 75 unique numbers
        while (generatedNumbers.size() < 75) {
            System.out.print("Press Enter: ");
            String input = scanner.nextLine();

            // If the user inputs 'q', exit the game
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Game over!");
                break;
            }

            int nextNumber;
            do {
                // Generate a random number between 1 and 75
                nextNumber = random.nextInt(75) + 1;
            } while (generatedNumbers.contains(nextNumber)); // Ensure it's unique by checking if it's in the set

            // Add the unique number to the set
            generatedNumbers.add(nextNumber);

            // Display the generated number
            System.out.println("Bingo number: " + nextNumber);

            // Display all previously generated numbers
            System.out.print("Previously generated numbers: ");
            for (int number : generatedNumbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}
