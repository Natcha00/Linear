import java.util.Scanner;

public class Test2 {
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

        return matrix[0][0] * (matrix[1][1] * matrix[2][2] * matrix[3][3] - matrix[1][2] * matrix[2][3] * matrix[3][1]
                             - matrix[1][3] * matrix[2][1] * matrix[3][2] + matrix[1][1] * matrix[2][3] * matrix[3][2]
                             + matrix[1][2] * matrix[2][1] * matrix[3][3] - matrix[1][1] * matrix[2][2] * matrix[3][3])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] * matrix[3][3] - matrix[1][2] * matrix[2][3] * matrix[3][0]
                             - matrix[1][3] * matrix[2][0] * matrix[3][2] + matrix[1][0] * matrix[2][3] * matrix[3][2]
                             + matrix[1][2] * matrix[2][0] * matrix[3][3] - matrix[1][0] * matrix[2][2] * matrix[3][3])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] * matrix[3][3] - matrix[1][1] * matrix[2][3] * matrix[3][0]
                             - matrix[1][3] * matrix[2][0] * matrix[3][1] + matrix[1][0] * matrix[2][3] * matrix[3][1]
                             + matrix[1][1] * matrix[2][0] * matrix[3][3] - matrix[1][0] * matrix[2][1] * matrix[3][3])
             - matrix[0][3] * (matrix[1][0] * matrix[2][1] * matrix[3][2] - matrix[1][1] * matrix[2][2] * matrix[3][0]
                             - matrix[1][2] * matrix[2][0] * matrix[3][1] + matrix[1][0] * matrix[2][2] * matrix[3][1]
                             + matrix[1][1] * matrix[2][0] * matrix[3][2] - matrix[1][0] * matrix[2][1] * matrix[3][2]);
    }
}
