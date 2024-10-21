# Lesson 1: Overview of Collections
## Exercise 1: Interface Familiarization
_Goal:_ Understand the different collection interfaces (List, Set, Map, Queue).
_Task:_ Create a class that demonstrates each of the following:
A List that stores at least 5 different integers.
A Set that stores 3 different names (e.g., "John", "Alice", "Bob").
A Map that maps 3 country names to their capitals.
A Queue that stores 3 numbers and retrieves them one by one.
**Example:**
Use ArrayList for List, HashSet for Set, HashMap for Map, and PriorityQueue for Queue.

## Exercise 1.2: Unique Elements in a List
_Goal:_ Use a Set to filter unique elements.
_Task:_ Write a method that accepts a List of integers (with duplicates) and returns a Set containing only the unique elements. Test the method with various inputs.

## Exercise 1.3: Iterate and Print Collections
_Goal:_ Understand iteration through different collection types.
_Task:_ Create a List, Set, Map, and Queue with at least 3 elements each. Write separate for loops to iterate over and print the contents of each collection.

# Lesson 2: Working with Lists
## Exercise 2.1: ArrayList Manipulation
_Goal:_ Learn how to add, remove, and access elements in an ArrayList.
_Task:_ Create an ArrayList of 5 favorite fruits. Add 2 more fruits to the list, remove 1, and print the list in reverse order.
**Example:**

```java
ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Mango", "Pineapple"));
```
Exercise 2.2: LinkedList Operations
Goal: Understand how LinkedList works.
Task: Create a LinkedList that stores the names of 3 family members. Add one person to the beginning and another to the end. Remove the second element and display the final list.
## Exercise 2.3: Compare ArrayList and LinkedList Performance
_Goal:_ Compare the performance of ArrayList and LinkedList for different operations.
_Task:_ Write a program that measures the time taken to:
Insert 10,000 elements at the beginning, middle, and end of an ArrayList and LinkedList.
Access elements at random positions in both lists.
Remove elements from the lists.
Compare the results and explain the differences.

## Exercise 2.4: Find Maximum Element in List
_Goal:_ Learn to manipulate elements in a List.
_Task:_ Write a method that accepts a List of integers and returns the largest element in the list. Test the method with several examples.

# Lesson 3: Working with Sets
Exercise 3.1: Remove Duplicates with HashSet
Goal: Learn how HashSet removes duplicates.
Task: Create a List of integers with some duplicate numbers, then convert it into a HashSet to remove duplicates. Print the HashSet.
Exercise 3.2: TreeSet Sorting
Goal: See how TreeSet orders elements.
Task: Create a TreeSet with the numbers 15, 3, 8, 5, and 20. Print the elements in the TreeSet to show they are sorted.
## Exercise 3.3: Set Operations (Union, Intersection, Difference)
_Goal:_ Learn to perform common set operations.
_Task:_ Create two HashSet objects:
Perform and print the union of both sets (all elements).
Perform and print the intersection (common elements).
Perform and print the difference (elements in the first set that are not in the second).

**Example:**

java
Copier le code
Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4));
Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6));
Exercise 3.4: Word Frequency Counter
Goal: Use a Set to count unique words.
Task: Write a program that reads a paragraph of text, splits it into words, and stores each word in a HashSet. Count and print how many unique words there are.
# Lesson 4: Working with Maps
Exercise 4.1: Phonebook with HashMap
Goal: Learn how to use HashMap to store key-value pairs.
Task: Create a HashMap that maps names to phone numbers (at least 3 entries). Retrieve and print the phone number for one of the entries.
Exercise 4.2: TreeMap Sorting by Keys
Goal: Understand how TreeMap sorts entries by keys.
Task: Create a TreeMap to store student names and their corresponding grades. Add at least 4 students, and print the map to see it sorted by the names.
Exercise 4.3: Count Character Occurrences in a String
Goal: Use Map to count occurrences of each character in a string.
Task: Write a method that accepts a string and returns a Map with characters as keys and their counts as values.
Example:

java
Copier le code
countCharacters("hello world")
// Output: {h=1, e=1, l=3, o=2, w=1, r=1, d=1}
Exercise 4.4: Convert Map to List of Keys or Values
Goal: Convert a Map to a List.
Task: Create a HashMap of employee IDs (integer) and names (string). Write methods to:
Return a List of all keys (employee IDs).
Return a List of all values (employee names).
Exercise 4.5: Create an Employee Directory
Goal: Use Map for managing more complex data.
Task: Create an Employee class with fields for ID, name, and department. Use a Map to store employee ID as the key and the Employee object as the value. Implement methods to:
Add a new employee.
Remove an employee by ID.
Find and print an employee’s details by ID.
# Lesson 5: Working with Queues
Exercise 5.1: PriorityQueue Simulation
Goal: Learn how PriorityQueue orders elements.
Task: Create a PriorityQueue of integers. Add the numbers 30, 10, 50, 20, and 40. Print and remove the elements one by one to show how PriorityQueue orders them.
Exercise 5.2: Deque Operations
Goal: Understand how to use Deque for double-ended queue operations.
Task: Create a Deque and add 3 strings to it. Remove one from the front and one from the end. Display the remaining element.
Exercise 5.3: Task Scheduling Simulation
Goal: Simulate a task scheduling system using a PriorityQueue.
Task: Create a Task class with properties like name and priority (an integer). Use a PriorityQueue to store tasks in order of priority. Add tasks with different priorities and process them in order (highest priority first).
Exercise 5.4: Deque as a Stack and Queue
Goal: Use Deque as both a stack and a queue.
Task: Write a program that demonstrates how a Deque can be used as:
A stack (LIFO) by using addFirst() and removeFirst().
A queue (FIFO) by using addLast() and removeFirst().
Exercise 5.5: Recent History Feature with ArrayDeque
Goal: Simulate browser history with ArrayDeque.
Task: Create a BrowserHistory class that simulates storing visited URLs in an ArrayDeque. Implement methods to:
Add a new URL to the history.
Go back to the previous page (pop from the deque).
Print the last 5 visited pages.
# Bonus Challenges
Exercise 6.1: Manage a Library with Collections
Goal: Practice multiple collection types.
Task: Create a simple library management system:
Use a List to store books.
Use a Set to store unique genres.
Use a Map to store book titles as keys and authors as values.
Allow users to add books, remove books, and search by genre or author.
Bonus Exercise 6.2: Reverse a Sentence Using Deque
Goal: Practice using Deque to reverse words in a sentence.
Task: Write a method that accepts a sentence as input and uses a Deque to reverse the order of the words.
Example:

java
Copier le code
Input: "Java Collections Framework is powerful"
Output: "powerful is Framework Collections Java"
Bonus Exercise 6.3: Frequency of Elements in a List using Map
Goal: Use Map to count the frequency of elements in a List.
Task: Given a List of integers, count how many times each number appears using a HashMap. Print the result as number=frequency.
Example:

java
Copier le code
Input: [4, 2, 4, 3, 3, 3, 2, 1]
Output: {4=2, 2=2, 3=3, 1=1}
Bonus Exercise 6.4: Find the Longest Word in a Set
Goal: Use a Set to find the longest word in a collection.
Task: Write a program that accepts a Set of words and returns the longest word in the set.