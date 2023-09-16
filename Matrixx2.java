import java.util.*;

public class Matrixx2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total rows and columns: ");
        int row = s.nextInt();
        int column = s.nextInt();
        int matrixA[][] = new int[row][column];
        int matrixB[][] = new int[row][column];
        int result[][] = new int[row][column];
        int i, j;

        System.out.println("Enter matrixA:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                matrixA[j][i] = s.nextInt();
            }
        }
        System.out.println("matrixA transpose is ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Enter matrixB:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                matrixB[j][i] = s.nextInt();
            }
        }
        System.out.println("matrixB transpose is ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("matrixA transpose * matrixBtranspose ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                int res, sum = 0;
                for (int k = 0; k < column; k++) {
                    res = matrixB[i][k] * matrixA[k][j];
                    sum = sum + res;
                    result[i][j] = sum;

                }

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
