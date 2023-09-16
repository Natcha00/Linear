
    import java.util.*;

public class Matrixx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for 4x4 matrix: ");
        int[][] matrix4 = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix4[i][j] = sc.nextInt();
            }
        }
        
        int det_4x4 = determinant_4x4(matrix4);
        System.out.println("Determinant of the 4x4 matrix: " + det_4x4);
    }

    public static int determinant_4x4(int[][] matrix) {
        if (matrix.length != 4 || matrix[0].length != 4 || matrix[1].length != 4 || matrix[2].length != 4 || matrix[3].length != 4) {
            throw new IllegalArgumentException("Matrix must be a 4x4 matrix.");
        }

        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[0][2];
        int d = matrix[0][3];
        int e = matrix[1][0];
        int f = matrix[1][1];
        int g = matrix[1][2];
        int h = matrix[1][3];
        int i = matrix[2][0];
        int j = matrix[2][1];
        int k = matrix[2][2];
        int l = matrix[2][3];
        int m = matrix[3][0];
        int n = matrix[3][1];
        int o = matrix[3][2];
        int p = matrix[3][3];

        int determinant = a * (f * (k * p - l * o) - g * (j * p - l * n) + h * (j * o - k * n))
                - b * (e * (k * p - l * o) - g * (i * p - l * m) + h * (i * o - k * m))
                + c * (e * (j * p - l * n) - f * (i * p - l * m) + h * (i * n - j * m))
                - d * (e * (j * o - k * n) - f * (i * o - k * m) + g * (i * n - j * m));

        return determinant;
    }
}


