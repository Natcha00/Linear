import java.util.*;

public class Matrix3 {
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

        int det = 0;
        for (int i = 0; i < 4; i++) {
            det += matrix[0][i] * cofactor(matrix, 0, i);
        }
        
        return det;
    }
    
    public static int cofactor(int[][] matrix, int row, int col) {
        int[][] submatrix = new int[3][3];
        int subRow = 0, subCol;
        
        for (int i = 0; i < 4; i++) {
            if (i == row) {
                continue;
            }
            
            subCol = 0;
            for (int j = 0; j < 4; j++) {
                if (j == col) {
                    continue;
                }
                submatrix[subRow][subCol] = matrix[i][j];
                subCol++;
            }
            
            subRow++;
        }
        
        return matrixSign(row, col) * determinant_3x3(submatrix);
    }
    
    public static int matrixSign(int row, int col) {
        return (row + col) % 2 == 0 ? 1 : -1;
    }
    
    public static int determinant_3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
}
