public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // 3x3 2D array

        // Fill array with multiplication table values
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the 2D array in matrix form
        System.out.println("3x3 Multiplication Table:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t"); // tab for spacing
            }
            System.out.println(); // new line after each row
        }
    }
}
