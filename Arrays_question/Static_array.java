public class StaticArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a static array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Print array elements using a loop
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }

        // Accessing a specific element
        System.out.println("\nFirst element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
    }
}
