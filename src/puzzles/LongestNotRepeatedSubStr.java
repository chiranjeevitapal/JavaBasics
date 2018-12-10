package puzzles;

public class LongestNotRepeatedSubStr {
	public static void main(String args[]) {
		//String input = "kjsedhfdslkfjdslkfwe49032498 olerlkwqrj32oi";
		String input = "qwertyuiopasdfghjklzxcvbnm";
		StringBuffer output = new StringBuffer();
		StringBuffer substr = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			if (substr.indexOf(input.charAt(i) + "") == -1) {
				substr.append(input.charAt(i) + "");
			} else {
				if (output.length() < substr.length()) {
					output = substr;
				}
				substr = new StringBuffer();
				substr.append(input.charAt(i) + "");
			}
			if ((i == input.length() - 1) && (output.length() < substr.length())) {
				output = substr;
			}
		}
		System.out.println(output.toString());
	}
}
