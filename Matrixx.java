import java.util.*;

public class Matrixx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total rows and columns: ");
        int row = s.nextInt();
        int column = s.nextInt();
        int matrixA[][] = new int[row][column];
        int matrixB[][] = new int[row][column];
        int result[][] = new int[row][column];
        
        System.out.println("Enter matrixA:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixA[i][j] = s.nextInt();
                
            }
        }
        
        System.out.println("Enter matrixB:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixB[i][j] = s.nextInt();
                
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int res, sum = 0;
                for (int k = 0; k < column; k++) {
                    res = matrixA[j][k] * matrixB[k][i];
                    sum = sum + res;
                    result[i][j] = sum;

                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
