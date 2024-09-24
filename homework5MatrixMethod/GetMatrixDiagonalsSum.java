package homework5MatrixMethod;

public class GetMatrixDiagonalsSum {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}
        };

        int sumOfDiagonals = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i == (matrix.length- 1) - i) {
                sumOfDiagonals += matrix[i][i];
                continue;
            }
            sumOfDiagonals += matrix[i][i] + matrix[i][(matrix.length- 1 ) - i];
        }

        System.out.println("Sum of matrix diagonals: " + sumOfDiagonals);
    }
}
