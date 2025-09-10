import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        // Original array
        int[] original = { 1, 2, 3 };

        // Assigning (just copies the reference, not contents)
        int[] referenceCopy = original;

        // Modify the second array
        referenceCopy[0] = 99;

        // Both arrays point to the same memory
        System.out.println("After modifying referenceCopy:");
        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Reference copy: " + Arrays.toString(referenceCopy));

        // Now make a true copy using Arrays.copyOf()
        int[] realCopy = Arrays.copyOf(original, original.length);

        // Modify the real copy
        realCopy[1] = 77;

        System.out.println("\nAfter modifying realCopy:");
        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Real copy:     " + Arrays.toString(realCopy));
    }
}
