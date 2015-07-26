package puzzles;

import java.util.HashMap;
import java.util.Map;

public class CharCountInstring {
	public static void main(String args[]){
		String anyString = "chiranjeevi parthasarathi tapal ? > ))) ";
		Map<String,Integer> countMap = new HashMap<String,Integer>();
		String currentElem = "";
		String tempString = anyString;//Take a temp string that will be diminishing in each loop
		//Loop temp string which will diminish after each inner loop is completed
		while(tempString.length()!=0){
			anyString = tempString;//assign diminished string to actual string so that the new string is iterated.
			String prevElem = "";
			int count = 0;
			for(int i=0; i<anyString.length(); i++){
				String elem = anyString.substring(i, i+1);
				currentElem = elem;
				if(currentElem.equals(prevElem) || prevElem.equals("")){
					countMap.put(elem, ++count);
					prevElem = currentElem;
				}
			}
			tempString = tempString.replace(prevElem, "");
			System.out.println(tempString);
		}
		System.out.print(countMap);
	}
	
}
