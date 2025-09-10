import java.util.Arrays;

public class ArrayOfString {

    // Method to check if name exists (normal way)
    public static boolean findName(String[] arr, String name) {
        for (String s : arr) {
            if (s.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Array of names
        String[] names = { "Alice", "Bob", "Charlie", "Diana", "Eve" };

        // Test normal method
        System.out.println("Normal Method:");
        System.out.println("Find 'Bob': " + findName(names, "Bob"));
        System.out.println("Find 'Zara': " + findName(names, "Zara"));

        // Modern Twist: Using Streams
        System.out.println("\nUsing Streams:");
        System.out.println("Find 'Charlie': " +
                Arrays.stream(names).anyMatch("Charlie"::equals));
        System.out.println("Find 'Zara': " +
                Arrays.stream(names).anyMatch("Zara"::equals));
    }
}
