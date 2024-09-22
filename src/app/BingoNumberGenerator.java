package app;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; // Import to shuffle the list

public class BingoNumberGenerator {

    public static void main(String[] args) {
        // Create a list of numbers from 1 to 75
        ArrayList<Integer> bingoNumbers = new ArrayList<>();
        for (int i = 1; i <= 75; i++) {
            bingoNumbers.add(i);
        }

        // Shuffle the list to randomize the numbers
        Collections.shuffle(bingoNumbers);

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        int nextNumberIndex = 0;

        // Instructions for the user
        System.out.println("Press 'Enter' to generate the next bingo number, or 'q' to quit.");

        // Loop to generate and display bingo numbers
        while (nextNumberIndex < 75) {
            System.out.print("Press Enter: ");
            String input = scanner.nextLine();

            // Check if the user wants to quit
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Game over!");
                break;
            }

            // Get the next number from the shuffled list
            int nextNumber = bingoNumbers.get(nextNumberIndex);
            System.out.println("Bingo number: " + nextNumber);

            // Display all previously generated numbers
            System.out.print("Previously generated numbers: ");
            for (int i = 0; i <= nextNumberIndex; i++) {
                System.out.print(bingoNumbers.get(i) + " ");
            }
            System.out.println();

            nextNumberIndex++; // Move to the next number
        }

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}
