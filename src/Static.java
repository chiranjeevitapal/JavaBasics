
public class Static {

	public static int count;

	public final int mycount;
	
	Static(){
		mycount = 20;
	}
	static {
		count = 10;
	}

	void increment() {
		count++;
	}

	public static final void main(String args[]) {
		Static count1 = new Static();
		Static count2 = new Static();
		Static count3 = new Static();

		count1.increment();
		System.out.println(count);
		count2.increment();
		System.out.println(count);
		count3.increment();
		System.out.println(count);
		count ++;
	}
}
