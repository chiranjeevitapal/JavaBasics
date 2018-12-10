package geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClosestPalindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// String input
		int numberOfinputs = sc.nextInt();
		List<String> numbers = new ArrayList<>();
		for (int i = 0; i < numberOfinputs; i++) {
			numbers.add(sc.next());
		}

		sc.close();
		try {
			for (String number : numbers) {

				if (number.length() == 0) {
					number = "0";
				}
				if (number.length() == 1 || number.equals("10")) {
						number = (Long.parseLong(number) - 1) + "";
				}
				if (number.length() > 1) {
					StringBuffer checkAll9s = new StringBuffer();
					for (int i = 0; i < number.length(); i++) {
						checkAll9s.append("9");
					}
					if (checkAll9s.toString().equals(number)) {
						number = (Long.parseLong(number) + 2) + "";
					} else {

						int midIndex = number.length() / 2;
						if (number.length() % 2 == 0) {
							// even number of digits
							String pal1 = number.replace(number.substring(midIndex),
									new StringBuffer(number.substring(0, midIndex)).reverse().toString());
							String pal2 = number.substring(midIndex)
									.concat(new StringBuffer(number.substring(midIndex)).reverse().toString());
							if (Math.abs(Long.parseLong(pal1) - Long.parseLong(number)) > Math
									.abs(Long.parseLong(pal2) - Long.parseLong(number))) {
								number = pal2;
							} else {
								number = pal1;
							}
						} else {
							String actualInput = number;
							// odd number of digits
							String pal1 = number.replace(number.substring(midIndex + 1),
									new StringBuffer(number.substring(0, midIndex)).reverse().toString());
							String pal2 = number.substring(midIndex + 1).concat(number.charAt(midIndex) + "")
									.concat(new StringBuffer(number.substring(midIndex + 1)).reverse().toString());
							if (Math.abs(Long.parseLong(pal1) - Long.parseLong(number)) > Math
									.abs(Long.parseLong(pal2) - Long.parseLong(number))) {
								number = pal2;
							} else {
								number = pal1;
							}

							if (!(number.charAt(midIndex) + "").equals("0")) {
								String decrementMid = number.replace(number.charAt(midIndex) + "",
										(Integer.parseInt(number.charAt(midIndex) + "") - 1) + "");
								if (Math.abs(Long.parseLong(decrementMid) - Long.parseLong(actualInput)) < Math
										.abs(Long.parseLong(decrementMid) - Long.parseLong(number))) {
									number = decrementMid;
								}
							}
						}

					}
				}

				System.out.println(number);
			}
		} catch (Exception e) {
			// throw new NumberFormatException();
		}
	}
}
