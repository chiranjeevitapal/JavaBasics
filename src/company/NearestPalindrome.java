package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NearestPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<>();
		int number_of_inputs = scan.nextInt();
		for (int i = 0; i < number_of_inputs; i++) {
			inputList.add(scan.nextInt());
		}
		System.out.println(inputList);
		scan.close();
		inputList.forEach(number -> {
			if(number == 0 ) {
				System.out.println(++number);
			}
			if (number>0 &&number < 10) {
				System.out.println(number - 1);
			} else {
				determinePalindrome(number);
			}
		});
	}

	// 47897 //724832 /98741
	public static void determinePalindrome(int num) {
		if (checkIfPalindrome(num)) {
			if(num%10 == 0 || num%10 >5) {
				num+=10;
			}else {
				num-=10;
			}
		}
		String number = String.valueOf(num);
		int[] numArr = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			numArr[i] = Integer.parseInt(number.charAt(i) + "");
		}
		for (int i = 0, j = numArr.length - 1; j > i; i++, j--) {
			if (numArr[i] != numArr[j]) {
				numArr[j] = numArr[i];
			}
		}
		for (int n : numArr) {
			System.out.print(n);
		}
	}

	public static boolean checkIfPalindrome(int num) {
		StringBuffer number = new StringBuffer();
		number.append(String.valueOf(num));
		if (number.equals(number.reverse())) {
			return true;
		} else {
			return false;
		}
	}

}
