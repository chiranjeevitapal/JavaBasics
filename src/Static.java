import java.util.Scanner;

public class Static {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		String scannedLine = scanner.nextLine();
		int lineNumber = 0;
		while(!scannedLine.equals("EOF")) {
			
			System.out.println(++lineNumber +" "+scannedLine);
			scannedLine = scanner.nextLine();
		}
		scanner.close();
	}
}
