# Module 1: Introduction to Java Programming

## Lesson 1: Overview of Java

### 1.1 History of Java

- **Creation**:
  - Developed by James Gosling and his team at Sun Microsystems in 1995.
  - Originally designed for interactive television but was too advanced for the digital cable television industry at that time.
- **Evolution**:
  - Java 1.0 (1996): First public release; introduced key features like the JVM.
  - Java 2 (1998): Introduced the Swing graphical API and the Collections Framework.
  - Java 5 (2004): Introduced generics, annotations, enumerated types, and the enhanced for loop.
  - Java 8 (2014): Introduced lambdas, streams, and the `java.time` package for date and time handling.
  - Subsequent versions introduced features like modules (Java 9), local-variable type inference (Java 10), and more.

### 1.2 Features of Java

- **Platform Independence**:
  - Java code is compiled into bytecode, which runs on the JVM, allowing it to run on any device with a JVM installed.
- **Object-Oriented**:
  - Supports key OOP concepts:
    - **Encapsulation**: Restricting access to certain components of an object.
    - **Inheritance**: Mechanism for creating new classes based on existing ones.
    - **Polymorphism**: Ability to present the same interface for different data types.
- **Automatic Memory Management**:
  - The garbage collector automatically reclaims memory from objects that are no longer in use, reducing memory leaks and enhancing performance.
- **Robust and Secure**:
  - Strong memory management, exception handling, and type-checking mechanisms prevent crashes and vulnerabilities.
- **Multithreaded**:
  - Built-in support for concurrent programming allows for efficient use of CPU resources.

### 1.3 Java Versions

- **Java SE (Standard Edition)**: For desktop applications, includes the core libraries.
- **Java EE (Enterprise Edition)**: For building large-scale, multi-tiered, distributed applications; includes APIs like Servlets, JSP, and EJB.
- **Java ME (Micro Edition)**: For developing applications for mobile devices and embedded systems.
- **Current LTS Versions**:
  - **Java 8** (March 2014): Long-term support until December 2020.
  - **Java 11** (September 2018): Added new features like the `var` keyword for local variable type inference, and was the first LTS release after Java 8.
  - **Java 17** (September 2021): Latest long-term support version, includes sealed classes, pattern matching for `instanceof`, and enhanced switch statements.

## Lesson 2: Java Syntax and Basic Constructs

### 2.1 Structure of a Java Program

- **Class Definition**: Every Java program must have at least one class. Classes can contain fields (attributes) and methods (functions).
- **Main Method**: The `main` method is the entry point for any Java application. It is where the program starts executing.
- **Package Declaration**: Helps in organizing classes into namespaces.

```java
package com.example;  // Package declaration

public class Main {  // Class definition
    public static void main(String[] args) {  // Main method
        System.out.println("Hello, World!");  // Output statement
    }
}
```

### 2.2 Data Types and Variables

- **Primitive Data Types:**
  - _int:_ 32-bit signed integer (e.g., int age = 25;)
  - _double:_ 64-bit double-precision floating-point (e.g., double price = 19.99;)
  - _char:_ Single 16-bit Unicode character (e.g., char letter = 'A';)
  - _boolean:_ Represents true or false values (e.g., boolean isAvailable = true;)
- **Non-Primitive Data Types:**
  - _String:_ A sequence of characters (e.g., String name = "Alice";)
  - _Arrays:_ Used to store multiple values of the same type (e.g., int[] numbers = {1, 2, 3, 4};)
  - _Classes:_ User-defined types that define objects.

```java
// Example of declaring and initializing variables
int age = 30;
double salary = 50000.50;
char grade = 'A';
boolean isEmployed = true;
String name = "John Doe";
```

### 2.3 Comments in Java

Single-line comments: Use // for inline comments.
Multi-line comments: Enclosed between /_ and _/, suitable for longer explanations.

```java
// This is a single-line comment

/*
 This is a
 multi-line comment
 used for explaining the code in detail.
*/
```

### 2.4 Operators

Arithmetic Operators: Perform basic mathematical operations.

- (Addition)

* (Subtraction)

- (Multiplication)
  / (Division)
  % (Modulus, returns the remainder)

```java
int a = 5;
int b = 10;
int sum = a + b;  // sum = 15
```

Relational Operators: Compare two values.

```java
== (Equal to)
!= (Not equal to)
> (Greater than)
< (Less than)
>= (Greater than or equal to)
<= (Less than or equal to)
```

```java
boolean isEqual = (a == b);  // isEqual = false
Logical Operators: Used for logical operations.
&& (Logical AND)
|| (Logical OR)
! (Logical NOT)
```

```java
boolean condition1 = true;
boolean condition2 = false;

boolean result = condition1 && condition2;  // result = false
boolean negation = !condition1;  // negation = false
```

### 2.5 Input/Output

Output: Use System.out.println to display output. This method prints the message followed by a newline. Use System.out.print if you don't want a newline.

```java
System.out.println("Hello, World!");  // Prints with newline
System.out.print("Welcome");          // Prints without newline
```

Input: The Scanner class is used to read input from the console. It needs to be imported from the java.util package.

```java
import java.util.Scanner;  // Importing Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your name: ");  // Prompt user for input
        String name = scanner.nextLine();  // Read user input

        System.out.println("Hello, " + name + "!");  // Output personalized greeting
    }
}
```

### 2.5.1 Scanner Methods

nextLine(): Reads an entire line of text input.
nextInt(): Reads the next integer input from the user.
nextDouble(): Reads the next double input.

```java
System.out.println("Enter your age: ");
int age = scanner.nextInt();  // Read an integer

System.out.println("Enter your salary: ");
double salary = scanner.nextDouble();  // Read a double
```
