package app;
import java.util.Scanner; // Import the Scanner class to read input from the user

public class ReverseString {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");

        // Read the input string entered by the user
        String input = scanner.nextLine();

        // Call the reverseString method and display the reversed string
        System.out.println("Reversed string: " + reverseString(input));

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }

    // Method that takes a string and returns its reverse
    public static String reverseString(String input) {
        // Use StringBuilder to reverse the string
        // StringBuilder has a built-in method reverse() that reverses its content
        return new StringBuilder(input).reverse().toString();
    }
}
