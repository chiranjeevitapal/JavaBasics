package puzzles;

public class SumOfVeryBigNumbers {
	public static void main(String args[]) {
		String firstNumber =	"578932213765435452564354767878698845342345467687658799095645645435";
		String secondNumber =	"24324546576547654857412121765416541546156526154654361543621846513";
		StringBuffer result = new StringBuffer();
		int carryOver = 0;
		if(firstNumber.length()>secondNumber.length()) {
			int diffLength = firstNumber.length() - secondNumber.length();
			String zeros="";
			for(int i=0; i<diffLength; i++) {
				zeros+="0";
			}
			secondNumber = zeros+secondNumber;
		}
		if(secondNumber.length()>firstNumber.length()) {
			int diffLength = secondNumber.length() - firstNumber.length();
			String zeros="";
			for(int i=0; i<diffLength; i++) {
				zeros+="0";
			}
			firstNumber = zeros+firstNumber;
		}
		for(int i=firstNumber.length()-1; i>=0; i--) {
			String sum = carryOver + (Integer.parseInt(firstNumber.charAt(i)+"")+Integer.parseInt(secondNumber.charAt(i)+""))+"";
			if(sum.length()==2) {
				carryOver = Integer.parseInt(sum.charAt(0)+"");
				sum = sum.charAt(1)+"";
			}else {
				carryOver = 0;
			}
			result.append(sum);
		}
		
		System.out.println(result.reverse());
	}
}
