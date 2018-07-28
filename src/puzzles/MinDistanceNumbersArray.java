package puzzles;

public class MinDistanceNumbersArray {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 3, 1, 8, 9, 5, 2, 1, 9, 6, 4, 7, 8, 2 };
		int number1 = 1, number2 = 4;
		int number1Position = 0;
		int number2Position = 0;
		int diff = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number1)
				number1Position = i;
			if (arr[i] == number2)
				number2Position = i;
			if (diff == 0 || diff > Math.abs(number2Position - number1Position)) {
				diff = Math.abs(number2Position - number1Position);
			}
		}
		System.out.println(diff);
	}
}
