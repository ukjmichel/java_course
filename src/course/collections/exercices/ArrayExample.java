package collections.exercices;

// Exercise 1:Array Manipulation 

import java.util.Random;

// Create an array of integers of size 10. 
// Fill this array with random numbers between 1 and 100.
// Display the elements of the array.
// Find and display the sum of all the elements in the array.

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
            sum += numbers[i];
        }

        System.out.println("Array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nSum: " + sum);
    }

}
