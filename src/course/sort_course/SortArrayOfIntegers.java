package course.sort_course;

import java.util.Arrays;

public class SortArrayOfIntegers {

    public static void main(String[] args) {
        int[] numbers = { 5, 3, 8, 1, 6, 9, 7 };

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));

    }

}
