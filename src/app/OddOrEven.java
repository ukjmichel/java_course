package app;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = reader.nextInt();
            
            String result = (number % 2 == 0) ? "even" : "odd";
            System.out.println("The number is " + result);
        }
    }
}