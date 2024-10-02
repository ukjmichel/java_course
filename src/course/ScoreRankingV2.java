package course;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScoreRankingV2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // List to store Person objects
            List<Person> players = new ArrayList<>();

            // Collect names and scores
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the name of player " + (i + 1) + ": ");
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

                // Add new Person object to the list
                players.add(new Person(name, score));
            }

            // Sort players by score in descending order
            players.sort(new Comparator<Person>() {
                @Override
                public int compare(Person a, Person b) {
                    return Integer.compare(b.getScore(), a.getScore()); // Sort by score descending
                }
            });

            // Print the ranking
            System.out.println("\nRanking:");
            for (int i = 0; i < players.size(); i++) {
                System.out
                        .println((i + 1) + ". " + players.get(i).getName() + " - Score: " + players.get(i).getScore());
            }
        }
    }

    // Person class defined as static to avoid requiring an instance of
    // ScoreRankingV2
    private static class Person {
        private String name;
        private int score;

        // Constructor
        public Person(String name, int score) {
            this.name = name;
            this.score = score;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Getter for score
        public int getScore() {
            return score;
        }

        @SuppressWarnings("unused")
        public void setScore(int score) {
            this.score = score;
        }

        @SuppressWarnings("unused")
        public void setName(String name) {
            this.name = name;
        }
    }
}
