package amazon;

public class PivotOfANumber {
	public static void main(String args[]) {
		String number = "92";
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
				String smallPivot = pivot.replace(pivot.charAt(0), pivot.charAt(1));
				String bigPivot = pivot.replace(pivot.charAt(1), pivot.charAt(0));
				if (Math.abs(Integer.parseInt(pivot) - Integer.parseInt(smallPivot)) < Math
						.abs(Integer.parseInt(pivot) - Integer.parseInt(bigPivot))) {
					pivot = smallPivot;
				} else {
					pivot = bigPivot;
				}
				StringBuffer buffer = new StringBuffer(rightPart);
				palindrome = leftPart + pivot + (buffer.reverse().toString());
			}

		} else {
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
