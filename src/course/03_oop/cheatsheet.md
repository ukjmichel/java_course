# Module 3: Object-Oriented Programming (OOP)

## Lesson 1: Introduction to OOP Concepts

- **Classes and Objects**
  - Classes are blueprints for creating objects.
  - Objects are instances of classes, containing attributes (fields) and behaviors (methods).
- **Constructors**
  - Special methods used to initialize objects.
  - A constructor is called when an object of a class is created.
- **this keyword**
  - Refers to the current instance of a class.
  - Used to resolve ambiguity between class attributes and parameters.

## Lesson 2: Methods

- **Method declaration and invocation**
  - Methods define the behavior of objects.
  - Syntax: `returnType methodName(parameters) { // method body }`
  - Methods are invoked using object references.
- **Method overloading**
  - Allows multiple methods in a class to have the same name but with different parameter lists.
  - Example: `int add(int a, int b)` vs `double add(double a, double b)`.
- **Static methods and variables**
  - Static methods and variables belong to the class rather than instances of the class.
  - Can be accessed using the class name: `ClassName.staticMethod()`.

## Lesson 3: Encapsulation

- **Access modifiers** (public, private, protected, default)
  - Control access to classes, methods, and variables.
  - `public`: Accessible everywhere.
  - `private`: Accessible only within the class.
  - `protected`: Accessible within the same package or subclasses.
  - `default` (no modifier): Accessible within the same package.
- **Getters and setters**
  - Methods that provide controlled access to private attributes.
  - Getters retrieve the value, and setters allow updating the value while maintaining encapsulation.

## Lesson 4: Inheritance

- **extends keyword**
  - Enables a class to inherit properties and behaviors from another class.
  - Example: `class Dog extends Animal`.
- **super keyword**
  - Refers to the parent class and is used to access the parent class's members (methods, constructors).
  - Example: `super();` calls the parent constructor.
- **Method overriding**
  - Allows a subclass to provide a specific implementation of a method already defined in its superclass.
  - Use `@Override` annotation for clarity.
- **Types of inheritance**
  - Single inheritance: A class inherits from one parent class.
  - Multilevel inheritance: A class inherits from a class, which in turn inherits from another class.
  - Hierarchical inheritance: Multiple classes inherit from the same parent class.

## Lesson 5: Polymorphism

- **Compile-time polymorphism (method overloading)**
  - The method to be executed is determined at compile time based on method signature.
- **Run-time polymorphism (method overriding)**
  - The method to be executed is determined at run time, allowing dynamic method dispatch.

## Lesson 6: Abstraction

- **Abstract classes and methods**
  - Abstract classes cannot be instantiated and may contain abstract methods (methods without implementation).
  - Subclasses must implement all abstract methods unless they are also abstract.
  - Example: `abstract class Animal { abstract void sound(); }`.
- **Interfaces**
  - Interfaces define a contract for what a class must implement.
  - Classes that implement an interface must provide an implementation for all of its methods.
  - Example: `interface Printable { void print(); }`.
- **Difference between abstract class and interface**
  - Abstract classes can have both concrete (implemented) methods and abstract methods, while interfaces contain only abstract methods (until Java 8 where default methods were introduced).
  - A class can implement multiple interfaces but can extend only one abstract class.
