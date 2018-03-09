package amazon;

import java.util.ArrayList;
import java.util.List;

public class PivotOfANumber {
	public static void main(String args[]) {
		String number = "101123";
		String pivot = "";
		String leftPart = "";
		String rightPart = "";
		String palindrome = "";
		if (number.length() % 2 == 0) {
			pivot = number.charAt(number.length() / 2 - 1) + "" + number.charAt(number.length() / 2) + "";
			leftPart = number.substring(0, number.length() / 2 - 1);
			rightPart = number.substring(number.length() / 2 + 1);
			rightPart = leftPart;
			if (checkIfPalindrome(number)) {
				if (Integer.parseInt(pivot) == 0) {
					palindrome = (Integer.parseInt(number) - 2) + "";
				} else {
					palindrome = (Integer.parseInt(number) - 10) + "";
				}
			} else {
				List<Integer> pivotPal = new ArrayList<>();
				for (int i = Integer.parseInt(pivot) - 10; i < Integer.parseInt(pivot) + 10; i++) {
					if (checkIfPalindrome(i + "")) {
						pivotPal.add(i);
					}
				}
				int prevDiff = 100;
				for (int elem : pivotPal) {
					if ( Math.abs(Integer.parseInt(pivot) - elem) < prevDiff) {
						prevDiff =  Math.abs(Integer.parseInt(pivot) - elem);
						pivot = elem + "";
					}
				}
				StringBuffer buffer = new StringBuffer(rightPart);
				palindrome = leftPart + pivot + (buffer.reverse().toString());
			}

		} else

		{
			pivot = number.charAt(number.length() / 2) + "";
			leftPart = number.substring(0, number.length() / 2);
			rightPart = number.substring(number.length() / 2 + 1);
			rightPart = leftPart;
			if (checkIfPalindrome(number)) {
				if (Integer.parseInt(pivot) == 0) {
					palindrome = (Integer.parseInt(number) - 2) + "";
				} else {
					palindrome = (Integer.parseInt(number) - 10) + "";
				}
			} else {
				StringBuffer buffer = new StringBuffer(rightPart);
				palindrome = leftPart + pivot + (buffer.reverse().toString());
			}

		}
		System.out.println(pivot);
		System.out.println(leftPart);
		System.out.println(rightPart);
		System.out.println(palindrome);
	}

	public static boolean checkIfPalindrome(String num) {
		StringBuffer reverse = new StringBuffer(num).reverse();
		if (num.equals(reverse.toString())) {
			return true;
		} else {
			return false;
		}
	}
}
