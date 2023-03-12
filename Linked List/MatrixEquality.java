import java.util.Scanner;

public class MatrixEquality {

    // function to check if two matrices are equal
    public static boolean checkMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input for first matrix
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] matrix1 = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // get input for second matrix
        int[][] matrix2 = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // print the matrices

        for (int[] row : matrix1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


        for (int[] row : matrix2) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // check if matrices are equal and print result
        if (checkMatricesEqual(matrix1, matrix2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
