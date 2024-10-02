package course.sort_course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(9);

        Collections.sort(numbers);

        System.out.println("Sorted lists: " + numbers);

    }

}
