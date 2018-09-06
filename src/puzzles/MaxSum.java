package puzzles;
import java.util.Scanner;

class MaxSum {
	// Driver program to test above functions
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int inputs[] = new int[num];
		for(int i=0; i<num; i++) {
			inputs[i] = s.nextInt();
		}
		int arr[] = new int[] { 7, 3, 8, 11, 1 };
		System.out.println(findMaxSum(inputs, inputs.length));
		s.close();
	}

	/*
	 * Function to return max sum such that no two elements are adjacent
	 */
	static int findMaxSum(int arr[], int n) {
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < n; i++) {
			/* current max excluding i */
			excl_new = (incl > excl) ? incl : excl;

			/* current max including i */
			incl = excl + arr[i];
			excl = excl_new;
		}

		/* return max of incl and excl */
		return ((incl > excl) ? incl : excl);
	}

}