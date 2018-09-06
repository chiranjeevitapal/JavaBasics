package puzzles;

public class Factorial {
	static int fact = 1;

	public static void main(String args[])

	{
		System.out.println(factorial(6));
	}

	private static int factorial(int number) {
		if (number == 1) {
			return fact;
		}
		fact = fact * number;
		return factorial(--number);
	}
}
