import java.util.Scanner; // Import the Scanner class

public class CharacterCounter {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a word: ");

        // Read the input string from the user
        String inputString = scanner.nextLine();

        // Calculate the number of characters in the string
        int length = inputString.length();

        // Display the number of characters
        System.out.println("The number of characters in the word " + inputString  + " is: " + length);

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}