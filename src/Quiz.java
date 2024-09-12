import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the purpose of the `switch` statement in Java?");
        System.out.println("A. To define functions or methods");
        System.out.println("B. To create loops");
        System.out.println("C. To make decisions based on multiple conditions");
        System.out.println("D. To declare variables");

        char answer1;
        do {
            answer1 = scanner.next().charAt(0);
            if (answer1 != 'A' && answer1 != 'B' && answer1 != 'C' && answer1 != 'D') {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
            }
        } while (answer1 != 'A' && answer1 != 'B' && answer1 != 'C' && answer1 != 'D');

        if (answer1 == 'C') {
            score++;
        }

        // Question 2
        System.out.println("Question 2: Which of the following data types can be used with a `switch` statement in Java?");
        System.out.println("A. `int`, `byte`, `short`, `char`");
        System.out.println("B. `float`, `double`");
        System.out.println("C. `boolean`");
        System.out.println("D. All of the above");

        char answer2;
        do {
            answer2 = scanner.next().charAt(0);
            if (answer2 != 'A' && answer2 != 'B' && answer2 != 'C' && answer2 != 'D') {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
            }
        } while (answer2 != 'A' && answer2 != 'B' && answer2 != 'C' && answer2 != 'D');

        if (answer2 == 'A') {
            score++;
        }

        // Question 3
        System.out.println("Question 3: What is the keyword used to specify a specific case within a `switch` statement?");
        System.out.println("A. `if`");
        System.out.println("B. `else`");
        System.out.println("C. `case`");
        System.out.println("D. `when`");

        char answer3;
        do {
            answer3 = scanner.next().charAt(0);
            if (answer3 != 'A' && answer3 != 'B' && answer3 != 'C' && answer3 != 'D') {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
            }
        } while (answer3 != 'A' && answer3 != 'B' && answer3 != 'C' && answer3 != 'D');

        if (answer3 == 'C') {
            score++;
        }

        // Question 4
        System.out.println("Question 4: What is the purpose of the `break` statement within a `switch` case?");
        System.out.println("A. To exit the entire `switch` statement");
        System.out.println("B. To jump to the next case");
        System.out.println("C. To continue execution to the next case");
        System.out.println("D. To define a new case");

        char answer4;
        do {
            answer4 = scanner.next().charAt(0);
            if (answer4 != 'A' && answer4 != 'B' && answer4 != 'C' && answer4 != 'D') {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
            }
        } while (answer4 != 'A' && answer4 != 'B' && answer4 != 'C' && answer4 != 'D');

        if (answer4 == 'A') {
            score++;
        }

        // Question 5
        System.out.println("Question 5: What is the default case in a `switch` statement used for?");
        System.out.println("A. To execute code if none of the other cases match");
        System.out.println("B. To define the default value for the switch variable");
        System.out.println("C. To break out of the switch statement");
        System.out.println("D. To specify the data type of the switch variable");

        char answer5;
        do {
            answer5 = scanner.next().charAt(0);
            if (answer5 != 'A' && answer5 != 'B' && answer5 != 'C' && answer5 != 'D') {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
            }
        } while (answer5 != 'A' && answer5 != 'B' && answer5 != 'C' && answer5 != 'D');

        if (answer5 == 'A') {
            score++;
        }

        System.out.println("Your score is: " + score + "/5");

        scanner.close();
    }
}