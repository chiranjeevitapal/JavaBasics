package puzzles;

public class NumberReverse {
	static int rev = 0;
	public static void main(String[] args) {
		int number = 8975103;
		revNumber(number);
		System.out.println(rev);
	}
	public static void revNumber(int number) {
		int rem = number % 10;
		rev = rev * 10 + rem;
		number = number/10;
		if(number != 0 ) {
			revNumber(number);
		}
	}

}
