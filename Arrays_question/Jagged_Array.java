public class JaggedArrayExample {
    public static void main(String[] args) {
        // Step 1: Create jagged array with 3 rows
        int[][] jagged = new int[3][];
        jagged[0] = new int[2]; // Row 1 → 2 elements
        jagged[1] = new int[4]; // Row 2 → 4 elements
        jagged[2] = new int[3]; // Row 3 → 3 elements

        // Step 2: Fill with sequential numbers
        int count = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = count++;
            }
        }

        // Step 3: Print row by row
        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println(); // newline after each row
        }

    }
}
