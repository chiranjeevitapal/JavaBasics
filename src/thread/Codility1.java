package thread;

public class Codility1 {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int pointer = 0;
		int count = 0;
		if(A == null || A.length == 0){
			return 0;
		}
		while (A != null) {
			try {
				pointer = A[pointer];
				count++;
			} catch (ArrayIndexOutOfBoundsException ex) {
				break;
			}
		}
		System.out.println(count);
		System.out.println(String.format("id = %08.2f", 423.147));
		return count;
	}

	public static void main(String args[]) {
		Codility1 c = new Codility1();
		c.solution(new int[] { 1, 4, -1, 3, 2 });

	}
}
