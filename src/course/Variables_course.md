# Java Variables Tutorial

## Overview
Variables are fundamental building blocks in Java programming. They act as containers to store data values. In this tutorial, we will cover the types of variables in Java, how to declare and initialize them, and their scope and lifetime.

## Table of Contents
1. [What is a Variable?](#what-is-a-variable)
2. [Variable Declaration and Initialization](#variable-declaration-and-initialization)
3. [Types of Variables](#types-of-variables)
   - [Local Variables](#local-variables)
   - [Instance Variables](#instance-variables)
   - [Class Variables (Static Variables)](#class-variables-static-variables)
4. [Variable Naming Conventions](#variable-naming-conventions)
5. [Data Types](#data-types)
6. [Variable Scope](#variable-scope)
7. [Conclusion](#conclusion)

---

## What is a Variable?

In Java, a **variable** is a container that holds a value that can be changed during the execution of the program. Each variable is assigned a data type that defines what kind of value it can hold.

### Syntax:

data_type variable_name = value;


**Example:**

```java
int age = 25;
```

**In this example:**
int is the data type.
age is the variable name.
25 is the value assigned to the variable.

## Variable Declaration and Initialization
Variables must be declared before they can be used in the program. Optionally,
you can also initialize the variable when you declare it.

**Declaration:**

```java
int age;  // Declaration
```

**Initialization:**

```java
age = 25; // Initialization
```

You can also declare and initialize in one step:


```java
int age = 25;
```

## Types of Variables
In Java, variables can be categorized into three types:

- Local Variables
- Instance Variables
- Class Variables (Static Variables)

### Local Variables
**Definition:** 
Variables that are declared inside methods, constructors, or blocks.

**Scope:** 
Only accessible within the method/block in which they are declared.

**Lifetime**: 
Exist only during the method execution.

**Example:**
```java
public void displayAge() {
    int age = 30;  // Local variable
    System.out.println(age);
}
```

### Instance Variable

**Definition:** 
Variables that are declared within a class but outside any method.

**Scope:** 
Accessible by all methods in the class.

**Lifetime:**
Exist as long as the object exists.

**Example:**

```java
class Person {
    int age;  // Instance variable
}
```

### Class Variables (Static Variables)
**Definition:** 
Variables that are declared with the static keyword.

**Scope:**
Belong to the class rather than instances of the class.

**Lifetime:**
Exist as long as the class is loaded in memory.

**Example:**

```java
class Person {
    static int population;  // Static variable
}
```

### Global Variables
**Definition:**
Variables declared outside any class or method.

**Scope**
Accessible by all methods in all classes.

**Lifetime**
Exist as long as the program runs.

## Variable Naming Conventions:
Java has specific naming conventions for variables:

Variable names should start with a letter, underscore (_), or dollar sign ($).
Subsequent characters can be letters, numbers, underscores, or dollar signs.
Variable names are case-sensitive (age and Age are different).
Use camelCase for variable names: firstName, myAge.

_Valid Examples:_

```java
int age;
int $salary;
int _count;
```

_Invalid Examples:_

```java
int 1stNumber;  // Cannot start with a number
int my-age;     // Cannot use hyphen
```


## Data Types:
In Java, variables are classified into two types of data types:

**Primitive Data Types**
Reference/Object Data Types
Primitive Data Types
Primitive data types are built into Java and include:

byte, short, int, long – Integer types
float, double – Floating-point types
char – Character type
boolean – Boolean type (true or false)

_byte:_
Size: 1 byte (8 bits)
Range: -128 to 127

_short:_
Size: 2 bytes (16 bits)
Range: -32,768 to 32,767

_int:_
Size: 4 bytes (32 bits)
Range: -2,147,483,648 to 2,147,483,647

_long:_
Size: 8 bytes (64 bits)
Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

_float:_
Size: 4 bytes (32 bits)
Used for single-precision floating-point numbers.

_double:_
Size: 8 bytes (64 bits)
Used for double-precision floating-point numbers.

_char:_
Size: 2 bytes (16 bits)
Represents a single 16-bit Unicode character.

_boolean:_
Size: not precisely defined; typically 1 bit
Represents one of two values: true or false.

**Reference Data Types**
Reference types refer to objects. Examples include arrays, strings, and objects of classes.

_Classes_
Definition: 
A class is a blueprint for creating objects, defining properties (attributes) and methods (behaviors).

_Interfaces_
Definition: 
An interface is a reference type in Java that is similar to a class but can only contain abstract methods (methods without a body) and constants. Interfaces are used to achieve abstraction and multiple inheritance in Java.

_Arrays_
Definition: 
An array is a data structure that can hold a fixed number of values of a single type. The length of an array is established when the array is created.

_Collections_
Definition: 
Collections are classes that store groups of objects. Common collection types include List, Set, and Map. They provide various methods for manipulating groups of objects.

## Variable Scope
Scope defines the region of the program where the variable is accessible. There are three main scopes:

- Local Scope: Accessible only within the method/block where the variable is declared.

- Instance Scope: Accessible by all methods in the class if declared outside a method (instance variables).

- Class/Global Scope: Class variables (static variables) are accessible by all instances and methods in the class.

_Example of Different Scopes:_

```java
class Example {
    static int classVar = 100;   // Class variable
    int instanceVar = 200;       // Instance variable

    public void method() {
        int localVar = 300;      // Local variable
        System.out.println(localVar);
    }
}
```


- classVar: Global scope.
- instanceVar: Instance scope, accessible within the class but unique to each object.
- localVar: Local scope, accessible only within the method method().

## Conclusion
Variables are essential for storing and manipulating data in a Java program.
There are different types of variables (local, instance, class) with varying scopes and lifetimes.
Always follow proper naming conventions and choose the appropriate data type for your variables.
