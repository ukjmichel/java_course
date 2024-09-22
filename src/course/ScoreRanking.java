package course;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class ScoreRanking {
    public static void main(String[] args) {
        // Array to store names and scores
        try (Scanner scanner = new Scanner(System.in)) {
            // Array to store names and scores
            String[][] players = new String[5][2]; // [name, score]
            
            // Collect names and scores
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the name of the player " + (i + 1) + ": ");
                String name = scanner.nextLine();
                
                int score = -1;
                while (score < 0 || score > 300) {
                    System.out.println("Enter the score of " + name + " (between 0 and 300): ");
                    try {
                        score = Integer.parseInt(scanner.nextLine());
                        if (score < 0 || score > 300) {
                            System.out.println("Score must be between 0 and 300. Please try again.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }
                
                players[i][0] = name; // Store name
                players[i][1] = String.valueOf(score); // Store score
            }
            
            // Sort players by score in descending order
            Arrays.sort(players, new Comparator<String[]>() {
                @Override
                public int compare(String[] a, String[] b) {
                    return Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])); // Sort by score descending
                }
            });
            
            // Print the ranking
            System.out.println("\nRanking:");
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + ". " + players[i][0] + " - Score: " + players[i][1]);
            }
        } // [name, score]
    }
}
