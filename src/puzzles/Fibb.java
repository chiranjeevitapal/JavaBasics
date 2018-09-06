package puzzles;

public class Fibb {
	static int result = 0;

	public static void main(String args[]) {
		System.out.print("0,1,");
		fibb(30, 0, 1);
	}

	private static void fibb(int number, int first, int second) {
		if (result < number) {
			result = first + second;
			System.out.print(result + ",");
			first = second;
			second = result;
			fibb(number, first, second);
		}
	}
}
