import java.util.Arrays;

public class ArraySortSearchDemo {
    public static void main(String[] args) {
        // Create array
        int[] arr = { 7, 2, 9, 4, 1 };

        // Sort the array
        Arrays.sort(arr);

        // Search for 4
        int index = Arrays.binarySearch(arr, 4);

        // Print results
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Index of 4: " + index);
    }
}
