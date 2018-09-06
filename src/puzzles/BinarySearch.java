package puzzles;

public class BinarySearch {
	public static void main(String args[]) {
		int value = 9;
		int[] list = { 1, 3, 7, 8, 9, 10 };
		boolean found = false;
		found = pivot(list, value, 0, list.length-1);
		if (found)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}

	private static boolean pivot( int[] list, int value, int low, int high) {
		int pivotIndex = (high + low) / 2;
		if (list[pivotIndex] == value) {
			return true;
		}
	
		if(low>high) {
			return false;
		}

		if (value < list[pivotIndex]) {
			high = pivotIndex;

		} else {
			low = pivotIndex + 1;
			high = list.length-1;
		}

		return pivot(list, value, low, high);
	}
}
