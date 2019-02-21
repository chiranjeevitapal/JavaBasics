package thread;

class Fibb {
	public int solution(int N) {
		String f = Integer.toString(fib(N));
		if(f.length() > 6){
			return Integer.parseInt(f.substring(f.length() - 6));
		} else{
			return Integer.parseInt(f);
		}
		
	}

	private static int fib(int n) {
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	public static void main(String args[]){
		Fibb fibb = new Fibb();
		System.out.println(fibb.solution(36));
	}

}
