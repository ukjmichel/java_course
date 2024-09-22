package app;
import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        // Create an instance of Random class
        Random random = new Random();

        // Generate a random integer between 1 (inclusive) and 100 (inclusive)
        int randomNumber = random.nextInt(100) + 1;

        // Print the random number
        System.out.println("Random number between 1 and 100: " + randomNumber);
    }
}