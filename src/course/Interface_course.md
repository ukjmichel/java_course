# Java Interfaces - Course Outline

## 1. What is an Interface in Java?
An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. 
Interfaces cannot contain instance fields or constructors, and methods in interfaces are abstract by default unless marked otherwise.

## Key Concepts
- **Abstract Methods**: Methods without a body that must be implemented by any class that implements the interface.
- **Constant Variables**: Variables declared in interfaces are implicitly `public`, `static`, and `final`.
- **Multiple Inheritance**: A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.

---

## 2. Declaring an Interface
An interface is declared using the `interface` keyword. It can contain method declarations (without implementations), default methods, and static methods.

### Example:
```java
interface Animal {
    void makeSound(); // abstract method
    default void eat() {
        System.out.println("This animal eats.");
    }
    static void sleep() {
        System.out.println("Animals need sleep.");
    }
}
```
## 3. Implementing an Interface
To implement an interface, a class uses the implements keyword. The class must provide concrete implementations for all abstract methods of the interface.

### Example:
```java
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
```
## 4. Multiple Interfaces
A class in Java can implement multiple interfaces, allowing it to inherit behaviors from multiple sources. This is Java's way of supporting multiple inheritance.

**Example:**
```java
interface Swimmer {
    void swim();
}

interface Runner {
    void run();
}

class Triathlete implements Swimmer, Runner {
    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}
```

## 5. Default Methods in Interfaces
Java 8 introduced default methods in interfaces, allowing interfaces to have methods with a body. This feature allows the addition of new methods in interfaces without breaking existing code.

**Example:**
```java
interface Vehicle {
    void drive();
    
    // Default method with a body
    default void fuelUp() {
        System.out.println("Fueling up...");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}
```

## 6. Static Methods in Interfaces
Java 8 also introduced static methods in interfaces. These methods belong to the interface, not to the class that implements the interface.

**Example:**
```java
interface Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(5, 3));  // Output: 8
    }
}
```

## 7. Functional Interfaces and Lambdas
A functional interface is an interface with only one abstract method. They are typically used with lambda expressions, method references, or constructor references. Java provides the @FunctionalInterface annotation to denote such interfaces.

**Example:**
```java
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda expression to implement the interface
        MathOperation addition = (a, b) -> a + b;
        System.out.println(addition.operate(5, 3));  // Output: 8
    }
}
```

## 8. Extending Interfaces
An interface can extend another interface, inheriting its methods. A class implementing the child interface must implement all methods from both interfaces.

**Example:**
```java
interface FlyingAnimal {
    void fly();
}

interface Bird extends FlyingAnimal {
    void chirp();
}

class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void chirp() {
        System.out.println("Sparrow is chirping");
    }
}
```

## 9. Marker Interfaces
A marker interface is an interface with no methods or fields. It is used to signal or mark that a class has a certain property or behavior.

**Example:**
```java
interface Serializable { }  // Marker interface

class Data implements Serializable {
    // Implementation here
}
```

Marker interfaces like Serializable are often used by libraries or frameworks to add metadata to classes.

## 10. Interface vs Abstract Class
While both interfaces and abstract classes can contain abstract methods, they have several key difference:

**Interface**
An interface defines a contract that classes must adhere to. It contains only method declarations (without implementation) and possibly properties. A class implementing an interface must provide implementations for all declared methods.

**Abstract Class**
An abstract class is a class that cannot be instantiated and can contain both abstract methods (without implementation) and concrete methods (with implementation). It may also have attributes and constructors.

### Use Cases
- **Interface**: Ideal for specifying behaviors that multiple classes should implement, especially when those classes are not logically related.
- **Abstract Class**: Useful for sharing common behavior and attributes among related classes.


**Feature**	                          **Interface**	                 **Abstract Class**
|   Multiple Inheritance	|   Can implement multiple interfaces	| Can only extend one class
|   Fields	                |   Only constants (static final)	    | Can have instance fields
|   Methods	                |   Abstract, default, static methods	| Abstract and concrete methods
|   Constructors	        |   No constructors	                    | Can have constructors
|   Inheritance 	        |   A class can implement               | A class can inherit from 
                                multiple interfaces	                  one abstract class
|   Use Case	            |   Defines behavior without specifics  | Provides a base for related classes


## 11. Interface Example: Real-world Use Case
Let’s look at a practical example of using interfaces to model a payment system where different payment methods can be implemented.

Example:
```java
interface PaymentMethod {
    void makePayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCardPayment();
        payment1.makePayment(100.00);
        
        PaymentMethod payment2 = new PayPalPayment();
        payment2.makePayment(50.00);
    }
}
```

## 12. Best Practices with Interfaces
Use interfaces to define behaviors and allow for different implementations.
Prefer interfaces over abstract classes for defining types.
Use default methods carefully to ensure backward compatibility.
Apply the @FunctionalInterface annotation to clarify intent when using functional interfaces.

**Summary:**
An interface defines a contract for behavior without specifying how the behavior is implemented.
Java supports multiple inheritance through interfaces.
Default and static methods were introduced in Java 8, enabling more flexible interfaces.
Functional interfaces and lambda expressions work together to provide concise and readable code.