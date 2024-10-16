package collections.exercices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        // basic_operation();
        // handling_duplicate();
        // unite_set();
        // iterate_over_set();
        unique_name();

    }

    // Exercise 1: Basic Operations
    // Create a HashSet:

    // Create a HashSet of integers.
    // Add the numbers 1 through 10 to the set.
    // Print the contents of the set.

    // Check for Existence:
    // Check if the number 5 is in the set and print the result.
    // Check if the number 15 is in the set and print the result.

    // Remove an Element:
    // Remove the number 5 from the set and print the updated set.
    // Remove the number 15 from the set and print the updated set.

    public static void basic_operation() {
        // Create a HashSet of integers.
        Set<Integer> integerSet = new HashSet<>();
        // Add the numbers 1 through 10 to the set.
        for (int i = 1; i <= 10; i++) {
            integerSet.add(i);
        }
        // Print the contents of the set.
        System.out.println(integerSet);
        // Check for Existence:
        System.out.println(integerSet.contains(5)); // true
        System.out.println(integerSet.contains(15)); // false
        // Remove an Element:
        integerSet.remove(5);
        System.out.println(integerSet);
    }

    // Exercise 2:

    // Handling Duplicates
    // Add Duplicates:
    // - Create a new HashSet of strings.
    // - Add the following
    // strings:"apple","banana","orange","apple","grape","banana".
    // - Print the contents of the set to show that duplicates are removed.

    // Convert to Array:
    // - Convert the HashSet of strings to an array and print the array.

    public static void handling_duplicate() {
        // Create a new HashSet of strings.
        String[] fruitList = { "apple", "banana", "orange", "apple", "grape", "banana" };
        Set<String> fruitSet = new HashSet<>();
        // Add the following strings: "apple", "banana", "orange", "apple", "grape",
        // "banana".
        fruitSet.addAll(Arrays.asList(fruitList));
        // Print the contents of the original array to show duplicates.
        System.out.println("Fruit List: " + Arrays.toString(fruitList)); // Convert array to string format

        // Print the contents of the set to show that duplicates are removed.
        System.out.println("Unique Fruits: " + fruitSet);

        // Convert HashSet to an array
        String[] fruitArray = fruitSet.toArray(new String[0]);
        // Print the array
        System.out.println("Array of unique fruits: " + Arrays.toString(fruitArray));
    }

    // Exercise 3: Set Operations
    // Union ofTwo Sets:
    // Create two HashSets of integers.
    // Set A: {1, 2, 3, 4, 5}
    // Set B: {4, 5, 6, 7, 8}
    // Create a new HashSet that contains the union of both sets and print it.

    // Intersection of Two Sets:
    // Create a new HashSet that contains the intersection of both sets and print
    // it.

    // Difference ofTwo Sets:
    // Create a new HashSet that contains the difference of Set A and Set B
    // (elements in Set A that are not in Set B) and print it.

    public static void unite_set() {
        // Create two HashSets of integers.
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        // Create a new HashSet that contains the union of both sets
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println("Union of Set A and Set B: " + unionSet);
        // Create a new HashSet that contains the difference of Set A and Set B
        Set<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);
        System.out.println("Difference of Set A and Set B: " + differenceSet);

    }

    // Exercise 4:

    // Iterating Over a Set

    // Iterate Using Iterator:
    // Create a HashSet of characters:{'A', 'B', 'C', 'D', 'E'}.
    // Use an Iterator toprint each character in the set.

    // Iterate Using For-Each Loop:
    // Use a for-each loop to print each character in the same set
    // from Exercise 4.1.

    public static void iterate_over_set() {
        // Create a HashSet of characters
        Set<Character> charSet = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        // Use an Iterator to print each character in the set
        Iterator<Character> iterator = charSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Use a for-each loop to print each character in the same set
        for (Character c : charSet) {
            System.out.println(c);
        }

    }

    // Exercise 5:
    // Advanced Use Case

    // Store Unique Names:
    // Create a HashSet to store unique names from a list of names.
    // The list can include duplicates.
    // Use the following names:"Alice","Bob","Charlie","Alice","David","Bob","Eve".
    // Print the unique names.

    // Count Unique Characters:
    // Given a string, count the number of unique characters in it.
    // For example, use the string"Hello, World!"(consider only letters).
    // Print the count of unique characters.

    public static void unique_name() {
        String[] names_array = { "Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Eve" };
        // Create a HashSet to store unique names
        Set<String> uniqueNames = new HashSet<>(
                Arrays.asList(names_array));
        // print name
        System.out.println("names array: " + Arrays.toString(names_array));
        System.out.println("unique names set" + uniqueNames);

        // Count Unique Characters:
        String str = "Hello, World!";
        // Create a HashSet to store unique characters
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) // str.toCharArray(): converts the string str into an array of characters
        {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        // Print the unique characters and their count
        System.out.println("Unique characters: " + uniqueChars);
        System.out.println("Number of unique characters: " + uniqueChars.size());

    }

}
