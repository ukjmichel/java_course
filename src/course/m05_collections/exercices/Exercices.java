import java.util.*;

public class Exercices {
    public static void main(String[] args) {
        // 1.1
        // interfaceFamiliarisation();
        // 1.2
        // uniqueElement();
        // 1.3
        // listPerformanceComparison();
        // 2.1
        // arrayListManipulation();
        // 2.2
        linkedListOperation();
    }

    // 1.1
    public static void interfaceFamiliarisation() {
        List<Integer> listOfInteger = new ArrayList<>(Arrays.asList(7, 28, 56, 89, 23));
        Set<String> setOfString = new HashSet<>(Arrays.asList("John", "Alice", "Bob"));
        Map<String, String> mapOfCapital = Map.of(
                "Paris", "France",
                "London", "England",
                "Berlin", "Germany");
        Queue<Integer> queueOfInteger = new PriorityQueue<>(Arrays.asList(25, 5, 10));

        System.out.println("List of integers: " + listOfInteger);
        System.out.println("Set of names: " + setOfString);
        System.out.println("Map of capitals: " + mapOfCapital);
        System.out.println("Queue of integers: " + queueOfInteger);
    }

    // 1.2
    public static void uniqueElement() {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        // Populate the lists
        for (int i = 0; i < 50; i += 5) {
            listA.add(i);
            listB.add(i + 25);
        }

        // Create a HashSet to store unique elements
        Set<Integer> hashSetAB = new HashSet<>();
        // Add all elements from both lists to the set
        hashSetAB.addAll(listA);
        hashSetAB.addAll(listB);

        // Create a TreeSet to sort unique elements
        TreeSet<Integer> treeSetAB = new TreeSet<>(hashSetAB); // Corrected to pass hashSetAB directly

        // Print the results
        System.out.println("List A: " + listA);
        System.out.println("List B: " + listB);
        System.out.println("Unique Elements HashSet: " + hashSetAB);
        System.out.println("Unique Elements TreeSet: " + treeSetAB);
    }

    // 1.3
    public static void listPerformanceComparison() { // Changed to static method to avoid unnecessary inner class
        int numberOfElements = 10000;

        // Initialize lists
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Measure and compare insertion performance
        System.out.println("Insertion Performance:");
        measureInsertionPerformance(arrayList, "ArrayList", numberOfElements);
        measureInsertionPerformance(linkedList, "LinkedList", numberOfElements);

        // Measure and compare random access performance
        System.out.println("\nRandom Access Performance:");
        measureAccessPerformance(arrayList, "ArrayList", numberOfElements);
        measureAccessPerformance(linkedList, "LinkedList", numberOfElements);

        // Measure and compare removal performance
        System.out.println("\nRemoval Performance:");
        measureRemovalPerformance(arrayList, "ArrayList", numberOfElements);
        measureRemovalPerformance(linkedList, "LinkedList", numberOfElements);
    }

    private static void measureInsertionPerformance(List<Integer> list, String listType, int numberOfElements) {
        // Insert elements at the beginning
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(0, i);
        }
        long endTime = System.nanoTime();
        System.out.println(listType + " - Time to insert at beginning: " + (endTime - startTime) / 1_000_000 + " ms");

        // Insert elements in the middle
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(list.size() / 2, i);
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Time to insert in middle: " + (endTime - startTime) / 1_000_000 + " ms");

        // Insert elements at the end
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Time to insert at end: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void measureAccessPerformance(List<Integer> list, String listType, int numberOfElements) {
        // Populate the list with elements
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }

        // Access elements at random positions
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.get(random.nextInt(numberOfElements));
        }
        long endTime = System.nanoTime();
        System.out.println(listType + " - Time for random access: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void measureRemovalPerformance(List<Integer> list, String listType, int numberOfElements) {
        // Populate the list with elements
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }

        // Remove elements from the beginning
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.remove(0);
        }
        long endTime = System.nanoTime();
        System.out.println(listType + " - Time to remove from beginning: " + (endTime - startTime) / 1_000_000 + " ms");

        // Repopulate list for further testing
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }

        // Remove elements from the middle
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.remove(list.size() / 2);
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Time to remove from middle: " + (endTime - startTime) / 1_000_000 + " ms");

        // Repopulate list for further testing
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }

        // Remove elements from the end
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.remove(list.size() - 1);
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Time to remove from end: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    // 2.1
    public static void arrayListManipulation() {
        // create a list of 5 fruits
        List<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Mango", "Pineapple"));
        System.out.println("list of fruits: " + fruits);
        System.out.println("number of fruits: " + fruits.size());
        // add 2 more fruits
        System.out.println("add 2 more fruits: ");
        fruits.add("Apricot");
        fruits.add("Orange");
        System.out.println("list of fruits: " + fruits);
        System.out.println("number of fruits: " + fruits.size());
        // remove 1 fruit
        System.out.println("remove 1 fruits: ");
        fruits.remove("Banana");
        System.out.println("list of fruits: " + fruits);
        System.out.println("number of fruits: " + fruits.size());
        // sort fruits in reverse order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("list of fruits: " + fruits);

    }

    // 2.2
    public static void linkedListOperation() {
        List<String> listOfName = new LinkedList<>(List.of("John", "Susan", "Peter"));
        System.out.println("list of names: " + listOfName);
        // Add elements
        listOfName.addFirst("Olive");
        listOfName.addLast("Camille");
        System.out.println("\nlist of names: " + listOfName);

        // Access elements
        String firstElement = listOfName.getFirst(); // Get the first element
        String lastElement = listOfName.getLast(); // Get the last element
        System.out.println("\nFirst element: " + firstElement);
        System.out.println("\nLast element: " + lastElement);

        // Iterate over elements
        System.out.println("\nIterating through the list:");
        for (String name : listOfName) {
            System.out.println(name);
        }

        // Using ListIterator to traverse in both directions
        ListIterator<String> iterator = listOfName.listIterator();
        System.out.println("\nUsing ListIterator:");
        while (iterator.hasNext()) {
            System.out.println("Next: " + iterator.next());
        }

        while (iterator.hasPrevious()) {
            System.out.println("Previous: " + iterator.previous());
        }

        // Clear the list
        listOfName.clear();
        System.out.println("\nAfter clearing the list: " + listOfName);
    }
}
