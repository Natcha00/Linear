public class GFA {

	private static double[][] problem1 = {
			// x = 1, y = 2, z = 3
			{ 2, 3, -4, 19 }, // 1x + 2y + 3z = 14
			{ 4, 7, 1, 43 }, // 1x - 1y + 1z = 2
			{ 6, 11, 2, 67 } // 4x - 2y + 1z = 3
	};

	public static void solve(double[][] c, int row) {
		int cols = c.length + 1;
		double factor = c[row][row];
		for (int col = 0; col < cols; col++)
			c[row][col] /= factor;

		for (int row2 = 0; row2 < c.length; row2++)
			if (row2 != row) {
				factor = -c[row2][row];
				for (int col = 0; col < cols; col++)
					c[row2][col] += factor * c[row][col];
			}
	}

	public static void solve(double[][] c) {
		for (int row = 0; row < c.length; row++)
			solve(c, row);
	}

	public static void print(double[][] c) {
		int cols = c.length + 1;
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < cols; col++)
				System.out.printf("%5.1f ", c[row][col]);
			System.out.println();
		}
		System.out.println();
	}

	public static void printSolution(double[][] c) {
		int cols = c.length + 1;
		char variable = (char) ((c.length > 3) ? ('z' - (c.length - 1)) : 'x');
		System.out.println("Solution:\n");
		for (int row = 0; row < c.length; row++)
			System.out.printf("  %c = %1.1f\n", (char) variable++, c[row][cols - 1]);
		System.out.println();
	}

	public static void doProblem(double[][] problem, String description) {
		System.out.println("Original Equations:");
		print(problem);
		solve(problem);
		printSolution(problem);
	}

	public static void main(String[] args) {
		doProblem(problem1, "Problem 1 (from class)");

	}
}