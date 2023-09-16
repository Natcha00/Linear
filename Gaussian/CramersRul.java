public class CramersRul {
    public static void main(String[] args) {
        double[][] coefficients = {
                { 2, 3, -4 },
                { 4, 7, 1 },
                { 6, 11, 2 }
        };

        double[] constants = { 19.0, 43.0, 67.0 };

        double determinant = calculateDeterminant(coefficients);

        if (determinant == 0) {
            System.out.println("The system has no unique solution.");
        } else {

            double[] solutions = new double[3];
            for (int i = 0; i < 3; i++) {
                double[][] modifiedMatrix = replaceColumn(coefficients, i, constants);
                solutions[i] = calculateDeterminant(modifiedMatrix) / determinant;
                System.out.printf("x%d = %.2f%n", i + 1, solutions[i]);
            }
        }
    }

    public static double calculateDeterminant(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] replaceColumn(double[][] matrix, int columnIndex, double[] vector) {
        double[][] result = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == columnIndex) {
                    result[i][j] = vector[i];
                } else {
                    result[i][j] = matrix[i][j];
                }
            }
        }
        return result;
    }
}
