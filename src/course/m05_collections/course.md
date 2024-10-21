# Module 5: Java Collections Framework

## Lesson 1: Overview of Collections

Java Collections Framework provides a set of interfaces and classes to store and manipulate groups of objects. The main interfaces are:

### 1.1 List
- A `List` is an ordered collection that allows duplicate elements.
- Common implementations: `ArrayList`, `LinkedList`, `Vector`.

### 1.2 Set
- A `Set` is an unordered collection that does not allow duplicate elements.
- Common implementations: `HashSet`, `LinkedHashSet`, `TreeSet`.

### 1.3 Map
- A `Map` is a collection that maps keys to values, where each key must be unique.
- Common implementations: `HashMap`, `TreeMap`, `LinkedHashMap`.

### 1.4 Queue
- A `Queue` is a collection used to hold multiple elements prior to processing. 
- Common implementations: `PriorityQueue`, `Deque`, `ArrayDeque`.

---

## Lesson 2: Working with Lists

### 2.1 ArrayList
- `ArrayList` is a resizable array that allows fast random access to elements.

#### Example:

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list);  // [Apple, Banana, Orange]
    }
}
```

### 2.2 LinkedList
LinkedList is a doubly linked list that allows fast insertion and deletion.

#### Example:
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.addFirst("Rabbit");
        System.out.println(list);  // [Rabbit, Dog, Cat]
    }
}
```

### 2.3 Vector
Vector is similar to ArrayList but is synchronized, meaning it is thread-safe.
#### Example:
```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");
        System.out.println(vector);  // [Red, Green, Blue]
    }
}
```

## Lesson 3: Working with Sets

### 3.1 HashSet
HashSet is a collection that does not allow duplicate elements and is unordered.
#### Example:
```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate, will be ignored
        System.out.println(set);  // [Banana, Apple] (order is not guaranteed)
    }
}
```

### 3.2 LinkedHashSet
LinkedHashSet maintains the order of insertion while preventing duplicates.
Example:
java
Copier le code
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        System.out.println(set);  // [One, Two, Three] (insertion order preserved)
    }
}
### 3.3 TreeSet
TreeSet is a sorted set that orders elements in ascending order.
#### Example:
```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(9);
        System.out.println(set);  // [2, 5, 9] (sorted in ascending order)
    }
}
```
## Lesson 4: Working with Maps
### 4.1 HashMap
HashMap stores key-value pairs and allows null keys and values.
**Example:**
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map);  // {1=One, 2=Two}
    }
}
```
4.2 TreeMap
TreeMap is a sorted map that orders keys in natural order (ascending).
Example:
java
Copier le code
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(1, "One");
        map.put(5, "Five");
        System.out.println(map);  // {1=One, 5=Five, 10=Ten} (sorted by key)
    }
}
4.3 LinkedHashMap
LinkedHashMap maintains the insertion order of key-value pairs.
Example:
java
Copier le code
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);  // {1=One, 2=Two, 3=Three} (insertion order preserved)
    }
}
## Lesson 5: Working with Queues
### 5.1 PriorityQueue
PriorityQueue orders its elements according to their natural ordering or by a comparator.
**Example:**
```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);
        System.out.println(queue);  // [5, 10, 20] (natural order)
    }
}
```
5.2 Deque (Double-Ended Queue)
Deque allows insertion and removal from both ends of the queue.
Example:
java
Copier le code
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println(deque);  // [First, Last]
    }
}
5.3 ArrayDeque
ArrayDeque is a resizable array-based implementation of the Deque interface.
Example:
java
Copier le code
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        System.out.println(deque);  // [A, B, C]
    }
}