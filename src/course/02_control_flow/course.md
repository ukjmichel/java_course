
# Module 2: Control Flow Statements

## Lesson 1: Decision-Making Statements

### 1. if, if-else, if-else-if

In Java, decision-making statements allow you to control the flow of execution based on certain conditions.

**Syntax for `if`:**
```java
if (condition) {
    // code to execute if condition is true
}
```

**Example:**
```java
int number = 10;
if (number > 5) {
    System.out.println("Number is greater than 5");
}
```

**Syntax for `if-else`:**
```java
if (condition) {
    // code to execute if condition is true
} else {
    // code to execute if condition is false
}
```

**Syntax for `if-else-if`:**
```java
if (condition1) {
    // code for condition1
} else if (condition2) {
    // code for condition2
} else {
    // default code if none of the conditions are true
}
```

**Example:**
```java
int number = 10;
if (number > 15) {
    System.out.println("Number is greater than 15");
} else if (number > 5) {
    System.out.println("Number is greater than 5 but less than or equal to 15");
} else {
    System.out.println("Number is less than or equal to 5");
}
```

### 2. switch Statement

The `switch` statement allows you to choose between multiple options based on the value of a variable.

**Syntax:**
```java
switch (variable) {
    case value1:
        // code to execute when variable equals value1
        break;
    case value2:
        // code to execute when variable equals value2
        break;
    default:
        // code to execute when none of the cases match
}
```

**Example:**
```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

## Lesson 2: Loops in Java

### 1. for, while, and do-while Loops

Loops are used to repeat a block of code multiple times.

**for Loop:**
```java
for (initialization; condition; update) {
    // code to be executed
}
```

**Example:**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**while Loop:**
```java
while (condition) {
    // code to be executed
}
```

**Example:**
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**do-while Loop:**
```java
do {
    // code to be executed
} while (condition);
```

**Example:**
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### 2. break and continue Statements

**break Statement:** Exits the loop early.

**continue Statement:** Skips the current iteration and moves to the next iteration of the loop.

**Example with `break`:**
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;  // exit the loop when i is 5
    }
    System.out.println(i);
}
```

**Example with `continue`:**
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;  // skip the current iteration when i is 3
    }
    System.out.println(i);
}
```

---

## Lesson 3: Arrays

### 1. Single-Dimensional Arrays

An array is a data structure that stores multiple values of the same data type.

**Syntax:**
```java
datatype[] arrayName = new datatype[size];
```

**Example:**
```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
// and so on
```

### 2. Multi-Dimensional Arrays

A two-dimensional array is like a matrix, with rows and columns.

**Syntax:**
```java
datatype[][] arrayName = new datatype[rows][columns];
```

**Example:**
```java
int[][] matrix = new int[2][2];
matrix[0][0] = 1;
matrix[0][1] = 2;
matrix[1][0] = 3;
matrix[1][1] = 4;
```

### 3. Array Methods

#### Sorting an Array:
You can sort arrays using `Arrays.sort()`.

**Example:**
```java
import java.util.Arrays;
int[] numbers = {5, 3, 8, 1, 2};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));  // Output: [1, 2, 3, 5, 8]
```

#### Searching in an Array:
You can search for an element in a sorted array using `Arrays.binarySearch()`.

**Example:**
```java
int[] numbers = {1, 2, 3, 5, 8};
int index = Arrays.binarySearch(numbers, 3);
System.out.println(index);  // Output: 2 (the index of element 3)
```

---

## Conclusion

This module introduced you to control flow statements in Java, covering decision-making, looping, and arrays. These are fundamental building blocks for writing programs with logical flow and repetitive operations.
