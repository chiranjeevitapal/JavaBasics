package puzzles;

public class XPowerY {
	String result = "1";
	MultiplyOldSchool multiply = new MultiplyOldSchool();
	public static void main(String[] args) {
		XPowerY xpy = new XPowerY();
		xpy.power("2", 1000);
		System.out.println(xpy.result);
	}

	public String power(String base, int pow) {
		if (pow == 0) {
			return result;
		}
		result = multiply.multiply(base, result);
		pow--;
		return power(base, pow);
	}
}
