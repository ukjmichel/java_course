# Java Comparator Tutorial

## Overview

The `Comparator` interface in Java is used to define custom comparison logic for objects. This allows you to control how two objects of the same type are compared and sorted, without modifying the class itself.

## Table of Contents

1. [What is a Comparator?](#what-is-a-comparator)
2. [Comparator Syntax](#comparator-syntax)
3. [How to Use a Comparator](#how-to-use-a-comparator)
4. [Comparator Example](#comparator-example)
5. [Comparator with Multiple Fields](#comparator-with-multiple-fields)
6. [Comparator Functional Interface](#comparator-functional-interface)
7. [Using Lambda Expressions with Comparator](#using-lambda-expressions-with-comparator)
8. [Conclusion](#conclusion)

---

## What is a Comparator?

The `Comparator` interface is part of the `java.util` package. It provides a way to sort custom objects without altering the class itself. This is useful when you need different sorting orders for the same type of object.

### Key Methods:

- `int compare(T obj1, T obj2)`: Compares two objects and returns a value based on their ordering:
  - Negative if `obj1 < obj2`
  - Zero if `obj1 == obj2`
  - Positive if `obj1 > obj2`

---

## Comparator Syntax

```java
public interface Comparator<T> {
    int compare(T o1, T o2);
}
```

## How to Use a Comparator

To use a comparator, you must:

Create a class that implements the Comparator interface.
Override the compare() method to define the custom comparison logic.

```java
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);
    }
}
```

__Integer class:__
Part of the java.lang package, the Integer class provides methods and constants for manipulating integers. It is used to represent an int value as an object, making it a wrapper class for the primitive int type.

__Integer.compare(int x, int y) method:__
This is a static method provided by the Integer class that compares two int values (x and y) and returns:
A negative integer if x < y.
Zero if x == y.
A positive integer if x > y.

## Comparator Example

Sorting by Age:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 31));
        people.add(new Person("Susan", 28));
        people.add(new Person("Peter", 25));

        // Sort using AgeComparator
        Collections.sort(people, new AgeComparator());

        System.out.println("Sorted by age:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
```

## Comparator with Multiple Fields

Sometimes, you may want to compare objects based on multiple fields. For example, you might want to compare by age first, and if the ages are the same, compare by name.

Example:

```java

Collections.sort(people, new Comparator<Person>() {
    @Override // Overriding the compare method to define custom sorting logic
    public int compare(Person p1, Person p2) {    
        int ageCompare = Integer.compare(p1.age, p2.age); // Compare the ages of the two Person objects  
        if (ageCompare == 0) // If ages are equal, compare their names lexicographically (alphabetical order)
        {
            return p1.name.compareTo(p2.name);
        }
        // If ages are not equal, return the result of the age comparison
        return ageCompare;
    }
});
```

**In this example:**

The age field is compared first.
If the age is equal, the name is compared lexicographically.

## Comparator Functional Interface

Comparator is a functional interface, meaning it can be used with lambda expressions and method references in Java 8 and above. This allows for more concise and readable code.

Example with Lambda Expression:

```java
Collections.sort(people, (Person p1, Person p2) -> Integer.compare(p1.age, p2.age));
```

This simplifies the code by eliminating the need for an anonymous class or a separate Comparator class.

## Using Lambda Expressions with Comparator

Lambda expressions provide a more elegant way to define comparators. Here's how you can use them for both single and multiple field comparisons.

**Single Field Comparator (Age):**

```java
Copier le code
people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
```

**Multiple Field Comparator (Age, then Name):**

```java
people.sort((p1, p2) -> {
    int ageCompare = Integer.compare(p1.age, p2.age);
    return (ageCompare == 0) ? p1.name.compareTo(p2.name) : ageCompare;
});
```

## Conclusion

Comparator allows you to define custom sorting behavior without modifying the class itself.
It provides flexibility when sorting by multiple fields or custom rules.
With Java 8+, you can leverage lambda expressions to make your comparators concise and readable.

```

```
