package puzzles;

public class Power {
	public static void main(String args[]) {
		Power power = new Power();
		power.multiply("21", "21");
	}

	public String multiply(String number1, String number2) {
		int carry = 0;
		int mul = 0;
		int prevMul = 0;
		StringBuffer result = new StringBuffer();
		for (int j = number2.length() - 1; j >= 0; j--) {
			for (int i = number1.length() - 1; i >= 0; i--) {
				mul = Integer.parseInt(number2.charAt(j) + "") * Integer.parseInt(number1.charAt(i) + "");
				mul = mul + carry;
				if (mul > 9) {
					carry = mul / 10;
					mul = mul % 10;
				} else {
					carry = 0;
				}
				result.append(mul);
				for (int k = 0; k <= (number1.length() - 1) - i; k++) {
				}
			}
			prevMul = Integer.parseInt(result.reverse().toString());
		}
		if (carry > 0) {
			result.append(carry);
		}
		System.out.println(result.reverse().toString());
		return number2;
	}
}
