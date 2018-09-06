package puzzles;

import java.util.ArrayList;
import java.util.List;

public class MultiplyOldSchool {

	public static void main(String[] args) {
		MultiplyOldSchool multiply = new MultiplyOldSchool();
		multiply.multiply("569369", "789512");
	}

	public String multiply(String numberOne, String numberTwo) {
		List<String> products = new ArrayList<>();
		int mult = 0;
		int carry = 0;
		StringBuffer buffer = null;
		for (int j = (numberTwo.length() - 1); j >= 0; j--) {
			buffer = new StringBuffer();
			for (int i = (numberOne.length() - 1); i >= 0; i--) {
				mult = Integer.parseInt(numberTwo.charAt(j) + "") * Integer.parseInt(numberOne.charAt(i) + "");
				if (carry > 0) {
					mult += carry;
				}
				if (mult > 9) {
					carry = mult / 10;
					mult = mult % 10;
				} else {
					carry = 0;
				}
				buffer.append(mult);
			}
			if (carry > 0) {
				buffer.append(carry);
				carry = 0;
			}
			StringBuffer reverse = new StringBuffer(buffer.reverse().toString());
			for (int k = 0; k < products.size(); k++) {
				reverse.append("0");
			}
			products.add(reverse.toString());
		}
		String result = "0";
		SumOfVeryBigNumbers sumOldSchool = new SumOfVeryBigNumbers();
		for (int i = 0; i < products.size(); i++) {
			result = sumOldSchool.sum(result, products.get(i));
		}
		//System.out.println(result);

		return result;
	}

}
