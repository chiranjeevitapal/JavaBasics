package puzzles;

public class Triangle1 {

	public static void main(String[] args) {
		int k=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(++k+" ");
			}
			System.out.println();
		}

	}

}
