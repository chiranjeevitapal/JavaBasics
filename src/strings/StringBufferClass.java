package strings;

public class StringBufferClass {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("hello ! ");
		System.out.println(sb.hashCode());
		sb.append("Chiranjeevi ");
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb.toString());
		
		
		
	}
}
