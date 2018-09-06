package puzzles;

public class Spiral {
	static int d1 = 9;
	static int d2 = 9;
	static int number = 1;

	public static void main(String args[]) {

		int depthIndex = calcDepth(d1, d2);

		int[][] input = new int[d1][d2];
		for (int i = 0; i < d1; i++) {
			for (int j = 0; j < d2; j++) {
				input[i][j] = number++;
			}
		}
		for (int i = 0; i < d1; i++) {
			for (int j = 0; j < d2; j++) {
				System.out.print(input[i][j] + "	");
			}
			System.out.println();
		}

		for (int i = 0; i < depthIndex; i++) {
			// System.out.println(" ## Top Layer ## ");
			topLayer(input, i);
			// System.out.println(" ## Right Layer ## ");
			rightLayer(input, i);
			// System.out.println(" ## Bottom Layer ## ");
			bottomLayer(input, i);
			// System.out.println(" ## Left Layer ## ");
			leftLayer(input, i);
		}
	}

	private static void topLayer(int[][] input, int depthIndex) {
		for (int i = depthIndex, j = depthIndex; j < d2 - depthIndex; j++) {
			System.out.print(input[i][j] + " ");
		}
		System.out.println();
	}

	private static void rightLayer(int[][] input, int depthIndex) {
		for (int i = depthIndex + 1, j = d2 - 1 - depthIndex; i < d1 - depthIndex; i++) {
			System.out.print(input[i][j] + " ");
		}
		System.out.println();
	}

	private static void bottomLayer(int[][] input, int depthIndex) {
		for (int i = d1 - 1 - depthIndex, j = d2 - 1 - depthIndex - 1; j >= depthIndex; j--) {
			System.out.print(input[i][j] + " ");
		}
		System.out.println();
	}

	private static void leftLayer(int[][] input, int depthIndex) {
		for (int i = d1 - 1 - depthIndex - 1, j = depthIndex; i > depthIndex; i--) {
			System.out.print(input[i][j] + " ");
		}
		System.out.println();
	}

	private static int calcDepth(int i, int j) {
		int touse = i > j ? j : i;
		if (touse % 2 == 0) {
			return touse / 2;
		} else {
			return (touse + 1) / 2;
		}
	}
}
