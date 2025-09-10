public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int num = 1;

        // Fill the matrix with 1–9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = num++;
            }
        }

        // Print matrix
        System.out.println("3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate diagonal sums
        int primarySum = 0, secondarySum = 0;
        for (int i = 0; i < 3; i++) {
            primarySum += matrix[i][i]; // (0,0), (1,1), (2,2)
            secondarySum += matrix[i][2 - i]; // (0,2), (1,1), (2,0)
        }

        // Print results
        System.out.println("Primary diagonal sum = " + primarySum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
    }
}
