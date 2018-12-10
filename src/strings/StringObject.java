package strings;

public class StringObject {
	public static void main(String args[]) {
		byte[] byteArr = {67, 72, 73, 82, 85};
		String str = new String(byteArr);
		System.out.println(str);
	}

}
