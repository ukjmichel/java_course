import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {
        // Create an array of ten names
        String[] namesArray = {
            "Alice", "Bob", "Charlie", "David", "Eve",
            "Frank", "Grace", "Hannah", "Isaac", "Jack"
        };

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.println("Enter a name: ");

        // Read the input name from the user
        String inputName = scanner.nextLine();

        // Capitalize the first letter of the entered name
        String capitalizedInputName = capitalizeFirstLetter(inputName);

        // Check if the capitalized name is in the array
        boolean isInArray = false;
        for (String name : namesArray) {
            if (name.equals(capitalizedInputName)) {
                isInArray = true;
                break;
            }
        }

        // Print the result
        if (isInArray) {
            System.out.println("The name " + capitalizedInputName + " is in the list.");
        } else {
            System.out.println("The name " + capitalizedInputName + " is not in the list.");
        }

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }

    // Method to capitalize the first letter of a string
    public static String capitalizeFirstLetter(String name) {
        if (name == null || name.isEmpty()) {
            return name; // Return the original name if it's null or empty
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
