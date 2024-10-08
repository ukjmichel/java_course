# Java Lambda Expressions - Course Outline

## 1. What is a Lambda Expression?
   A lambda expression is a short block of code that takes in parameters and returns a value. Lambda expressions are used primarily to define the inline implementation of a functional interface (an interface with a single abstract method).

**Syntax:**
```java
(parameters) -> expression
```

**Example:**
```java
(int a, int b) -> a + b
```

This lambda takes two integers and returns their sum.

## 2. Understanding Functional Interfaces
   A functional interface is an interface with exactly one abstract method.

The @FunctionalInterface annotation can be used to mark an interface as functional.

Example:

java
Copier le code
@FunctionalInterface
interface MyFunctionalInterface {
void doSomething();
} 3. Basic Lambda Expression Example
Let’s implement a functional interface using lambda expressions.

Step 1: Create a functional interface.

java
Copier le code
@FunctionalInterface
interface Greeting {
void sayHello();
}
Step 2: Implement the interface using a lambda expression.

java
Copier le code
public class LambdaDemo {
public static void main(String[] args) {
// Lambda expression to implement Greeting interface
Greeting greet = () -> System.out.println("Hello, World!");

        // Call the method
        greet.sayHello();
    }

} 4. Lambda Expressions with Parameters
Lambda expressions can take parameters just like methods.

Example:

java
Copier le code
@FunctionalInterface
interface MathOperation {
int operate(int a, int b);
}

public class LambdaDemo {
public static void main(String[] args) {
// Lambda expression with two parameters
MathOperation addition = (a, b) -> a + b;

        // Use the lambda
        System.out.println(addition.operate(5, 3));  // Output: 8
    }

} 5. Lambda Expressions and Collections
Lambda expressions are commonly used with Java’s Collections API to make the code cleaner and more concise.

Example: Sorting a list of strings using a lambda expression.

java
Copier le code
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
public static void main(String[] args) {
List<String> names = Arrays.asList("John", "Susan", "Alice");

        // Sort the list using a lambda expression
        names.sort((a, b) -> a.compareTo(b));

        // Print the sorted list
        names.forEach(name -> System.out.println(name));
    }

} 6. Method References
Lambda expressions can sometimes be replaced by method references for more concise code.

A method reference uses the :: operator.

Example:

java
Copier le code
List<String> names = Arrays.asList("John", "Susan", "Alice");
names.forEach(System.out::println); 7. Using Built-in Functional Interfaces
Java provides several commonly used functional interfaces in the java.util.function package, such as Predicate, Consumer, Function, and Supplier.

Examples:

Predicate<T>: Takes an object of type T and returns a boolean.
java
Copier le code
Predicate<Integer> isEven = (number) -> number % 2 == 0;
System.out.println(isEven.test(4)); // Output: true
Consumer<T>: Takes an object of type T and returns no result.
java
Copier le code
Consumer<String> printer = (message) -> System.out.println(message);
printer.accept("Hello, Lambda!"); // Output: Hello, Lambda!
Function<T, R>: Takes an object of type T and returns an object of type R.
java
Copier le code
Function<Integer, String> converter = (number) -> "Number: " + number;
System.out.println(converter.apply(5)); // Output: Number: 5
Supplier<T>: Returns an object of type T.
java
Copier le code
Supplier<String> supplier = () -> "Hello from Supplier";
System.out.println(supplier.get()); // Output: Hello from Supplier 8. Scope and Lambda Expressions
Lambdas can access local variables from their surrounding scope, but these variables must be effectively final, meaning they cannot be modified after they are initialized.

Example:

java
Copier le code
public class LambdaScope {
public static void main(String[] args) {
int localVariable = 10;

        Runnable runnable = () -> {
            // Can access localVariable but cannot modify it
            System.out.println(localVariable);
        };

        runnable.run();
    }

} 9. Type Inference with Lambdas
The Java compiler can infer the types of parameters in lambda expressions, so you can omit the parameter types if they are obvious.

Example:

java
Copier le code
(a, b) -> a + b // The types of a and b are inferred 10. Final Challenge: Practical Example Using Lambdas
Let’s create a more advanced example using lambdas with the Collections framework.

Problem: Sort a list of Person objects by age, and if two people have the same age, sort by name.

Solution:

java
Copier le code
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
String name;
int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}

public class LambdaDemo {
public static void main(String[] args) {
List<Person> people = new ArrayList<>();
people.add(new Person("John", 31));
people.add(new Person("Susan", 28));
people.add(new Person("Peter", 28));

        // Sort by age, then by name if ages are equal
        Collections.sort(people, (p1, p2) -> {
            int ageCompare = Integer.compare(p1.age, p2.age);
            if (ageCompare == 0) {
                return p1.name.compareTo(p2.name);
            }
            return ageCompare;
        });

        people.forEach(System.out::println);
    }

}
Summary:
Lambda expressions allow for more readable and concise code.
They are primarily used with functional interfaces and make working with collections and streams easier.
Java provides several built-in functional interfaces like Predicate, Consumer, Function, and Supplier.
You can combine lambdas with method references, streams, and collections for powerful programming patterns.
Let me know if you want to dive into a specific topic further!
