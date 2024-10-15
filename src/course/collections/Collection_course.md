# Java Collections Course

## Table of Contents

- [1. Array](#1-array)
- [2. Collection (Interface)](#2-collection-interface)
- [3. List (Interface)](#3-list-interface)
  - [3.1. ArrayList](#31-arraylist)
  - [3.2. LinkedList](#32-linkedlist)
- [4. Set (Interface)](#4-set-interface)
  - [4.1. HashSet](#41-hashset)
  - [4.2. LinkedHashSet](#42-linkedhashset)
  - [4.3. TreeSet](#43-treeset)
- [5. Queue (Interface)](#5-queue-interface)
  - [5.1. LinkedList](#51-linkedlist-1)
  - [5.2. PriorityQueue](#52-priorityqueue)
- [6. Summary](#6-summary)

## 1. Array

**Definition:**
A fixed-size container that holds elements of the same data type.

**Size:**
The size is fixed and must be declared at the time of creation. Once initialized, the size cannot be changed.

**Performance:**
Arrays are highly efficient for accessing elements because they provide constant time access via an index (i.e., O(1)).

**Type:**
It can store primitives (e.g., int, char) and objects (e.g., String, Integer).

**Example:**

```java
int[] numbers = new int[5]; // Array of size 5
numbers[0] = 10;
```

**Key Characteristics:**

- Simple, low-level data structure.
- Cannot dynamically resize.
- Direct access to elements via index.
- Can store primitives and objects.

## 2. Collection (Interface)

Definition: The root interface of the Java Collections Framework. Collection defines a general structure for grouping objects into a single unit, but it does not provide direct implementation. It is extended by interfaces like List, Set, and Queue.

**Size:**
Dynamic in nature for its implementations.

**Type:**
Can hold objects, and some implementations restrict duplicates (Set), while others (like List) allow duplicates.

**Methods:**
Includes basic operations like add(), remove(), size(), clear(), and contains().

**Example:**

```java
Collection<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
```

**Key Characteristics:**

- General-purpose interface for storing groups of objects.
- No specific ordering or duplication restrictions defined (those are in subinterfaces like List or Set).
- Implemented by several concrete classes (ArrayList, HashSet, LinkedList).

## 3. List (Interface)

Definition: A part of the java.util package and an interface that defines an ordered collection (also known as a sequence). It is more flexible than an array, as it supports dynamic resizing.

**Size:**
Dynamic in implementations like ArrayList. The size can grow and shrink as elements are added or removed.

**Type:**
Can hold only objects (primitives need to be wrapped in their object equivalents, like int → Integer).

**Methods:**
Provides more operations compared to arrays, like add(), remove(), contains(), etc.

**Common Implementations:**
ArrayList, LinkedList, Vector.

**Example:**

```java
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
```

**Key Characteristics:**

- Dynamic size.
- Ordered (elements retain their insertion order).
- Part of the Java Collections Framework.

### 3.1. ArrayList

**Definition:**
A resizable array implementation of the List interface. It allows for dynamic arrays that can grow as needed.

**Performance:**
Access time is O(1). Additions at the end are amortized O(1), but inserting or removing elements elsewhere is O(n).

**Example:**

```java
ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Element 1");
arrayList.add("Element 2");
```

### 3.2. LinkedList

**Definition:**
A doubly-linked list implementation of the List interface. It allows for constant-time insertions or removals.

**Performance:**
Access time is O(n). Additions and removals are O(1) if the position is known.

**Example:**

```java
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("First");
linkedList.add("Second");
```

## 4. Set (Interface)

**Definition:**
A Set is a collection that does not allow duplicate elements. It is part of the Java Collections Framework and is implemented by various classes, including HashSet, LinkedHashSet, and TreeSet.

**Duplicates:**
No duplicates allowed.

**Ordering:**
Does not guarantee the order of elements (except for LinkedHashSet, which maintains insertion order, and TreeSet, which sorts elements).

**Nulls:**
Allows one null element (for HashSet and LinkedHashSet).

**Performance:**
Fast performance for add, remove, and contains operations (average O(1) for HashSet).

**Methods:**
Common methods include add(), remove(), contains(), and size().

**Example:**

```java
Set<String> fruits = new HashSet<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple"); // Duplicate, will not be added
System.out.println(fruits); // Output: [Apple, Banana] (order may vary)
```

**Key Characteristics:**

- No duplicate elements.
- Unordered (or sorted in TreeSet).
- Fast performance for operations.

### 4.1. HashSet

**Definition:**
An implementation of the Set interface that uses a hash table for storage.

**Performance:**
Average time complexity for add, remove, and contains is O(1).

**Example:**

```java
Set<String> hashSet = new HashSet<>();
hashSet.add("Orange");
hashSet.add("Grape");
```

### 4.2. LinkedHashSet

**Definition:**
A hash table and linked list implementation of the Set interface. It maintains the insertion order.

**Performance:** S
ame as HashSet, but with a cost of maintaining order.

**Example:**

```java
Set<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("One");
linkedHashSet.add("Two");
```

## 4.3. TreeSet

**Definition:**
A navigable set that uses a red-black tree structure. It sorts the elements.

**Performance:**
Average time complexity for basic operations is O(log n).

**Example:**

```java
Set<Integer> treeSet = new TreeSet<>();
treeSet.add(3);
treeSet.add(1);
treeSet.add(2);
```

### 5. Queue (Interface)

**Definition:**
A Queue is a collection designed for holding elements prior to processing. It typically follows the First-In-First-Out (FIFO) principle, meaning that elements are added to the end of the queue and removed from the front.

**Duplicates:**
Allows duplicate elements.

**Ordering:**
Maintains the order of insertion (FIFO).

**Nulls:**
Usually allows null elements (depends on the specific implementation).

**Performance:**
Operations like add, remove, and peek are generally O(1) for implementations like LinkedList and ArrayDeque.

**Methods:**
Common methods include offer(), poll(), peek(), and size().

**Example:**

```java
Queue<String> tasks = new LinkedList<>();
tasks.offer("Task 1");
tasks.offer("Task 2");
tasks.offer("Task 3");
System.out.println(tasks); // Output: [Task 1, Task 2, Task 3]

String task = tasks.poll(); // Removes and returns the head of the queue
System.out.println("Processing: " + task); // Output: Processing: Task 1
System.out.println(tasks); // Output: [Task 2, Task 3]
```

**Key Characteristics:**

- Ordered (FIFO).
- Can contain duplicates.
- Efficient for task processing.

### 5.1. LinkedList

**Definition:**
A doubly-linked list implementation that can be used as a Queue.

**Performance:**
O(1) for add, remove, and peek operations.

**Example:**

```java
Queue<String> linkedListQueue = new LinkedList<>();
linkedListQueue.offer("First");
linkedListQueue.offer("Second");
```

### 5.2. PriorityQueue

**Definition:**
A queue that orders its elements according to their natural ordering or a specified comparator.

**Performance:**
O(log n) for add and remove operations.

**Example:**

```java
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
priorityQueue.offer(10);
priorityQueue.offer(5);
priorityQueue.offer(20);
```

### 6. Summary of Java Data Structures

**Array:**
_Definition:_ Fixed-size container holding elements of the same type.
_Size:_ Declared at initialization, cannot change afterward.
_Performance:_ Fast, constant-time access (O(1)) using an index.
_Key Characteristics:_ Simple, static, and efficient but lacks dynamic resizing.
**Collection(Interface):**
_Definition:_ The root interface of the Java Collections Framework, defining general operations for grouping objects.
_Size:_ Dynamic in its implementations (e.g., List, Set, Queue).
_Key Characteristics:_ Provides a standard for various data structures (e.g., List, Set, Queue) but does not define a specific behavior for duplicates or order.
