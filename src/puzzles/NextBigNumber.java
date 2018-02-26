package puzzles;

import java.util.Arrays;

public class NextBigNumber {

	public static void main(String args[]) {
		int[] number = new int[] { 9,5,8,4,3,2,1,6 };
		int[] tempNumber = number;
		String givenNumber = "";
		for (int digit : number) {
			givenNumber += digit;
		}
		int position = number.length - 1;
		int bigNumber = 0;
		while (position > 0) {
			if (number[position] > number[position - 1]) {
				int temp = number[position];
				number[position] = number[position - 1];
				number[position - 1] = temp;
			}
			String newNumber = "";
			for (int digit : number) {
				newNumber += digit;
			}
			if (Integer.parseInt(newNumber) > Integer.parseInt(givenNumber)) {
				String unsorted = newNumber.substring(0, position);
				String sorted = sorter(newNumber.substring(position));
				bigNumber = Integer.parseInt(unsorted + sorted);
				break;
			} else {
				number = tempNumber;
			}
			position--;
		}
		System.out.println(bigNumber);
	}

	public static String sorter(String number) {
		char[] num = number.toCharArray();
		Arrays.sort(num);
		return String.copyValueOf(num);
	}

}
