/*Given an array A of N integers, find a combination of four elements in the array whose sum is equal to a given value X.

Input:
First line consists of T test cases. First line of every test case consists of an integer N, denoting the number of elements in an array. Second line consists of N spaced array elements. Third line of every test case X.

Output:
Single line output, print 1 if combination is found else 0.*/
package geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourElements {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] inputArray = new int[arraySize];
		sc.nextLine();
		for (int i = 0; i < arraySize; i++) {
			inputArray[i] = sc.nextInt();
		}
		int sumValue = sc.nextInt();
		sc.close();
		combos(inputArray, sumValue);
	}

	public static void combos(int[] inputArray, int sumValue) {
		int[] numbers = new int[4];
		int sum = 0;
		int combos = 0;
		int iteration = 0;
		boolean addCombo = false;
		for (int i = 0; i < inputArray.length; i++) {
			if ((sum + inputArray[i]) <= sumValue) {
				iteration++;
				sum+=inputArray[i];
				switch (iteration) {
				case 1:{
					if(numbers[0] != inputArray[i]) {
						numbers[0] = inputArray[i];
						addCombo = true;
					}
					break;
				}
				case 2:
					if(numbers[1] != inputArray[i]) {
						numbers[1] = inputArray[i];
						addCombo = true;
					}
					break;
				case 3:
					if(numbers[2] != inputArray[i]) {
						numbers[2] = inputArray[i];
						addCombo = true;
					}
					break;
				case 4:
					if(numbers[3] != inputArray[i]) {
						numbers[3] = inputArray[i];
						addCombo = true;
					}
					break;
				}
				if(sum==sumValue && iteration == 4 && addCombo) {
					combos++;
					iteration = 0;
					sum = 0;
					i=-1;
					addCombo = false;
				}
			}
			if(i == inputArray.length-1) {
				break;
			}
		}
		System.out.println(combos);
	}

}
