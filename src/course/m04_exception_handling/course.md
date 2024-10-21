# Module 4: Exception Handling

## Lesson 1: Introduction to Exceptions

### 1.1 try, catch, finally blocks

In Java, exceptions are errors that occur during the execution of a program. The `try` block is used to wrap code that may throw an exception. The `catch` block is used to handle the exception. The `finally` block contains code that will execute regardless of whether an exception occurred or not.

#### Example:

```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
```
Output:
Exception caught: / by zero
Finally block executed.

### 1.2 throw and throws keywords
The throw keyword is used to explicitly throw an exception from a method or block of code.
The throws keyword is used in method declarations to indicate that the method might throw one or more exceptions.

**Example of throw:**
```java
public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        validateAge(16);  // This will throw an ArithmeticException
    }
}
```
_Output:_
Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote

**Example of throws:**
```java
public class ThrowsExample {
    public static void checkFile() throws FileNotFoundException {
        File file = new File("non_existent_file.txt");
        FileReader fr = new FileReader(file);  // This will throw FileNotFoundException
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```
_Output:_
File not found: non_existent_file.txt (No such file or directory)

## Lesson 2: Types of Exceptions

### 2.1 Checked vs Unchecked Exceptions
- **Checked exceptions:** These are exceptions that are checked at compile time. If your code throws a checked exception and you don’t handle it, your program won’t compile. Example: IOException, SQLException.

- **Unchecked exceptions:** These are exceptions that occur at runtime and are not checked at compile time. Example: ArithmeticException, NullPointerException.

### 2.2 Common exceptions
- **NullPointerException:** Thrown when you try to use a null reference where an object is required.

- **ArrayIndexOutOfBoundsException:** Thrown when you try to access an invalid index in an array.

**Example of NullPointerException:**
```java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
        }
    }
}
```
_Output:_
NullPointerException caught!

**Example of ArrayIndexOutOfBoundsException:**
```java
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
    }
}
```
_Output:_
ArrayIndexOutOfBoundsException caught!

## Lesson 3: Custom Exceptions

### 3.1 Creating your own exception classes
You can create custom exceptions by extending the Exception class for checked exceptions or the RuntimeException class for unchecked exceptions.

**Example of a custom checked exception:**
```java
// Custom checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomCheckedExceptionExample {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid for voting");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
```
_Output:_
Caught custom exception: Age is not valid for voting

**Example of a custom unchecked exception:**
```java
// Custom unchecked exception
class InvalidProductException extends RuntimeException {
    public InvalidProductException(String message) {
        super(message);
    }
}

public class CustomUncheckedExceptionExample {
    public static void validateProduct(String product) {
        if (product == null || product.isEmpty()) {
            throw new InvalidProductException("Product name is invalid");
        } else {
            System.out.println("Valid product: " + product);
        }
    }

    public static void main(String[] args) {
        try {
            validateProduct("");  // This will throw InvalidProductException
        } catch (InvalidProductException e) {
            System.out.println("Caught custom unchecked exception: " + e.getMessage());
        }
    }
}
```
_Output:_
Caught custom unchecked exception: Product name is invalid