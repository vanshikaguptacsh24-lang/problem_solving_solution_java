import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Step 1: Dynamic initialization
        int[] dynamicArray = new int[5];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i * i; // store square of index
        }

        // Step 2: Static initialization
        int[] staticArray = { 10, 20, 30, 40, 50 };

        // Step 3: Print both arrays
        System.out.println("Dynamic Array: " + Arrays.toString(dynamicArray));
        System.out.println("Static Array: " + Arrays.toString(staticArray));
    }
}
