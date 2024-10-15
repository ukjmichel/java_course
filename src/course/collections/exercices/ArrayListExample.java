package collections.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // manipulateFruitsList();
        manipulateIntegerList();
    }

    // Exercise :List of Strings Create an ArrayList of strings to store the names
    // of fruits.
    // Add at least 5 fruits to the list.Display the list of fruits.
    // Remove one fruit from the list and display the list again.
    // Search for a specific fruit in the list and display its index.

    public static void manipulateFruitsList() {
        // Initialize the ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Kiwi");

        // Displaying the list of fruits
        System.out.println("List of fruits: " + fruits);

        // Removing an element
        System.out.println("Eat a Banana");
        fruits.remove("Banana");
        System.out.println("Fruits remaining: " + fruits);

        // Finding the index of an element
        int index = fruits.indexOf("Kiwi");
        System.out.println("Index of Kiwi: " + index);
    }

    // Exercise:
    // Create a program that performs the following operations on a List of
    // integers:
    // Add elements to the list.
    // Remove an element by value.
    // Retrieve an element by index.
    // Sort the list in ascending order.
    // Find the maximum and minimum values in the list.

    public static void manipulateIntegerList() {
        // Create an ArrayList to store random integers
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(29, 32, 5, 12, 17, 59, 98, 82, 69, 42));

        // Print the ArrayList
        System.out.println("ArrayList: " + integerList);

        // remove integer
        integerList.remove(Integer.valueOf(5));
        System.out.println("updated ArrayList: " + integerList);

        // retrieve element
        System.out.println("Element at index 5: " + integerList.get(5));

        // Sort the list in ascending order.
        Collections.sort(integerList);
        System.out.println("sorted ArrayList in ascending order: " + integerList);

        // Sort the ArrayList in descending order
        Collections.sort(integerList, Collections.reverseOrder());
        System.out.println("sorted ArrayList in descending order: " + integerList);

        // Find the maximum value
        int maxValue = Collections.max(integerList);
        System.out.println("Maximum value: " + maxValue);

        // Find the minimum value
        int minValue = Collections.min(integerList);
        System.out.println("Minimum value: " + minValue);
    }

}
