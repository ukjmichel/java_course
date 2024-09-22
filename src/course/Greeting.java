package course;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueInput = true; // Flag to control the loop

            while (continueInput) {
                // Prompt the user to enter a name
                System.out.println("Enter a name (or type 'exit' to end the program): ");
                String inputName = scanner.nextLine();

                // Check if the user wants to exit
                if (checkIfExit(inputName)) {
                    break; // Exit the loop
                }

                boolean validAge = false; // Flag to control the age loop

                // Loop for age input
                while (!validAge) {
                    System.out.println("Enter your age (0 to 100) (or type 'exit' to end the program): ");
                    String ageInput = scanner.nextLine();

                    // Check if the user wants to exit
                    if (checkIfExit(ageInput)) {
                        continueInput = false;
                        break; // Exit the loop
                    }

                    try {
                        int inputAge = Integer.parseInt(ageInput); // Parse the input age

                        // Validate the age is between 0 and 100
                        if (inputAge >= 0 && inputAge <= 100) {
                            validAge = true; // Age is valid
                            System.out.println("Hello " + inputName + ", you are " + inputAge + " years old.");
                        } else {
                            System.out.println("Please enter a valid age between 0 and 100.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number for your age.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static boolean checkIfExit(String input) {
        return input.equalsIgnoreCase("exit"); // Returns true if input is "exit"
    }
}
