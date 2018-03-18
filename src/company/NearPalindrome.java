package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NearPalindrome {
	 static String pal = "";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<>();
		int number_of_inputs = scan.nextInt();
		for (int i = 0; i < number_of_inputs; i++) {
			inputList.add(scan.nextInt());
		}
		System.out.println(inputList);
		scan.close();
		nearestPalindrome(inputList);
	}
	public static String nearestPalindrome(List<Integer> inputList) {
		
		inputList.forEach(number -> {
			int prevPal = previousPalindrome(number);
			int nextPal = nextPalindrome(number);
			if(Math.abs(number - prevPal) < Math.abs(number - nextPal)) {
				System.out.println(prevPal);
				pal = prevPal+"";
			}else {
				System.out.println(nextPal);
				pal = nextPal+"";
			}
		});
		
		return pal;
	}

	public static int previousPalindrome(int number) {
		int prevNumber = number-1;
		while(prevNumber >0) {
			int prevNumberReverse = numberReverse(prevNumber);
			if(prevNumber == prevNumberReverse) break;
			prevNumber--;
		}
		return prevNumber;
	}
	
	public static int nextPalindrome(int number) {
		int nextNumber = number+1;
		while(nextNumber >0) {
			int nextNumberReverse = numberReverse(nextNumber);
			if(nextNumber == nextNumberReverse) break;
			nextNumber++;
		}
		return nextNumber;
	}

	public static int numberReverse(int number) {
		int reverse = 0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		return reverse;
	}

}
