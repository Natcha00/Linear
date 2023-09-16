public class Matrix {
    public static void main(String[] args) {
        // input
        int matrixA[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int matrixB[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int n = 4;
//xxxxxxxxxxxxxxxx
        Matrix mat = new Matrix();
        int result[][] = new int[matrixA.length][matrixA[0].length];
        result = matrixA; // [3][3]

        for (int i = 1; i < n; i++) {
            result = mat.multiplication(matrixA, result);
        }

        // print result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] multiplication(int[][] matrixA, int[][] matrixB) {
        // int matrixA[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // int matrixB[][] = matrixA;
        int result[][] = new int[matrixA.length][matrixA.length];
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                for (int ans = 0; ans < matrixA.length; ans++) {
                    result[row][col] += matrixA[row][ans] * matrixB[ans][col];

                }
            }

        }
        return result;

    }
}