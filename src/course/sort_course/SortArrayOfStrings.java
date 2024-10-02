package course.sort_course;

import java.util.Arrays;

public class SortArrayOfStrings {

    public static void main(String[] args) {
        String[] words = { "banana", "apple", "strawberry", "kiwi", "orange" };

        Arrays.sort(words);

        System.out.println("Sorted array: " + Arrays.toString(words));

    }

}
