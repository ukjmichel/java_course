import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

public class SortCustomObject {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 31));
        people.add(new Person("Susan", 28));
        people.add(new Person("Peter", 25));
        people.add(new Person("Adam", 42));
        people.add(new Person("Amy", 22));
        people.add(new Person("Cory", 28));
        people.add(new Person("Bluey", 25));
        people.add(new Person("Sora", 42));

        // Sorting by age (ascending)
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });
        System.out.println("Sorted by age:");
        for (Person p : people) {
            System.out.println(p);
        }

        // Sorting by name (alphabetical order)
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        System.out.println("\nSorted by name:");
        for (Person p : people) {
            System.out.println(p);
        }

        // Sorting by age first, then by name if ages are the same
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int ageCompare = Integer.compare(p1.age, p2.age);
                if (ageCompare == 0) {
                    // If ages are the same, compare by name
                    return p1.name.compareTo(p2.name);
                }
                return ageCompare;
            }
        });
        System.out.println("\nSorted by age, then by name:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
