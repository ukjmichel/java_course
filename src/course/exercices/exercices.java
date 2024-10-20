package course.exercices;

import java.util.Scanner;

public class exercices {
    public static void main(String[] args) {
        // ###001
        // helloWorld();
        // ###002
        // myScanner();
        // ### 003
        addInput();

    }

    // ###001
    public static void helloWorld() {
        System.out.println("Hello, World!");

    }

    // ###002
    public static void myScanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }

    // ### 003
    public static void addInput() {
        int inta = 0;
        int intb = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            // Get the first number with validation
            boolean validInputA = false;
            while (!validInputA) {
                System.out.println("Enter first number:");
                try {
                    inta = Integer.parseInt(scanner.nextLine()); // Convert input to an integer
                    validInputA = true; // Set flag to true if parsing is successful
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter a valid integer.");
                }
            }

            // Get the second number with validation
            boolean validInputB = false;
            while (!validInputB) {
                System.out.println("Enter second number:");
                try {
                    intb = Integer.parseInt(scanner.nextLine()); // Convert input to an integer
                    validInputB = true; // Set flag to true if parsing is successful
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter a valid integer.");
                }
            }
        }

        // Calculate the result
        int result = inta + intb;
        System.out.println("The sum is: " + result); // Print the result
    }
}
