import java.util.Arrays;

public class ReverseArrayDemo {

    // Method 1: Reverse using loop (in-place)
    public static void reverseIterative(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Method 2: Reverse using recursion (in-place)
    public static void reverseRecursive(int[] arr, int left, int right) {
        if (left >= right) {
            return; // base case
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // recursive call
        reverseRecursive(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Print original
        System.out.println("Original array: " + Arrays.toString(arr));

        // Iterative reverse
        reverseIterative(arr);
        System.out.println("Reversed (Iterative): " + Arrays.toString(arr));

        // Reverse again using recursion (to restore original order)
        reverseRecursive(arr, 0, arr.length - 1);
        System.out.println("Reversed back (Recursive): " + Arrays.toString(arr));
    }
}
