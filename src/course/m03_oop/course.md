# Module 3: Object-Oriented Programming (OOP)

## Lesson 1: Introduction to OOP Concepts

### Classes and Objects
- **Class**: A blueprint for creating objects that defines the attributes (fields) and methods (behaviors) common to all objects of that type.
- **Object**: An instance of a class, created using the `new` keyword.

#### Example:
```java
class Car {
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object (instance) of the Car class
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;

        car1.displayDetails();  // Output: Model: Toyota, Year: 2020
    }
}
```

### Constructors
- **Constructor:** A special method that is called when an object is created. It initializes the object’s fields.
If no constructor is defined, Java provides a default constructor.
#### Example:
```java
class Car {
    String model;
    int year;

    // Constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2021);
        car1.displayDetails();  // Output: Model: Honda, Year: 2021
    }
}
```
### this keyword
- **this:** Refers to the current object instance. It is used when the method or constructor has local variables with the same name as instance variables.
**Example:**
```java
class Car {
    String model;
    int year;

    // Constructor using `this` to refer to instance variables
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Model: " + this.model + ", Year: " + this.year);
    }
}
```
## Lesson 2: Methods

### Method declaration and invocation
- **Method:** A block of code that performs a specific task and can return a result.
Declared with a return type, method name, and parameters.
**Example:**
```java
class MathOperations {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        int sum = math.add(5, 10);  // Invoking the method
        System.out.println("Sum: " + sum);  // Output: Sum: 15
    }
}
```
### Method overloading
- **Method overloading:** Multiple methods with the same name but different parameter types or number of parameters.
**Example:**
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum (int): " + math.add(5, 10));      // Output: Sum (int): 15
        System.out.println("Sum (double): " + math.add(5.5, 3.2)); // Output: Sum (double): 8.7
    }
}
```

### Static methods and variables

- **Static methods:** Methods that belong to the class rather than an instance. They can be called without creating an object.

- **Static variables:** Variables shared among all instances of a class.

**Example:**
```java
class Counter {
    static int count = 0;

    // Static method to increase count
    static void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        System.out.println("Count: " + Counter.count);  // Output: Count: 2
    }
}
```

## Lesson 3: Encapsulation

### Access modifiers
_Public_     :  Accessible from anywhere.
_Private_    :  Accessible only within the class.
_Protected_  :  Accessible within the package and by subclasses.
_Default_    :  Accessible only within the same package (no modifier).
**Example:**
```java
class Employee {
    private String name;  // Private variable

    // Getter method to access private variable
    public String getName() {
        return name;
    }

    // Setter method to update private variable
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");  // Setting the name
        System.out.println("Employee Name: " + emp.getName());  // Getting the name
    }
}
```
## Lesson 4: Inheritance

### extends keyword
- **Inheritance:** Allows one class to inherit fields and methods from another class using the extends keyword.
**Example:**
```java
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Output: Dog barks
    }
}
```
### super keyword
- **super:** Refers to the parent class. It is used to call parent class methods or constructors.
**Example:**
```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // Call parent class constructor
        System.out.println("Dog constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Output: Animal constructor, Dog constructor
    }
}
```

### Method overriding
- **Overriding:** A subclass provides a specific implementation of a method that is already defined in its parent class.
**Example:**
```java
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();  // Output: Cat meows
    }
}
```

## Lesson 5: Polymorphism

### Compile-time polymorphism (Method overloading)
Compile-time polymorphism occurs through method overloading. The method is resolved at compile time.
**Example:**
```java
class MathOperations {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.multiply(5, 6));      // Output: 30
        System.out.println(math.multiply(2.5, 3.5));  // Output: 8.75
    }
}
```
### Run-time polymorphism (Method overriding)
Run-time polymorphism occurs through method overriding. The method to execute is determined at run-time.
**Example:**
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();  // Output: Dog barks
    }
}
```

## Lesson 6: Abstraction
### Abstract classes and methods
- **Abstract class:** A class that cannot be instantiated and may contain abstract methods that subclasses must implement.
- **Abstract method:** A method without a body that must be implemented by subclasses.
**Example:**
```java
abstract class Animal {
    abstract void makeSound();  // Abstract method

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();  // Output: Dog barks
        dog.eat();  // Output: Animal eats
    }
}
```
### Interfaces
- **Interface:** A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, and static methods. A class implements an interface.
**Example:**
```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound
```