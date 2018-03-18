package company;

public class MaxSumOfNonConsequitiveNumber {
	public static void main(String args[]) {
		int[] arr = new int[] {7,3,5,8,9};
		
		int excl = 0;
        int incl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = incl;
            incl = Math.max(excl + arr[i], incl);
            excl = temp;
        }
        System.out.println(incl);
	}
}
