package looping;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyClass {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("chiru");
		list.add("parthu");
		list.add("sarathi");
		list.add("sasi");
		list.add("rohit");

		for (ListIterator<String> itr = list.listIterator(); itr.hasNext();) {
			String value = itr.next();
			if (value.equals("sasi")) {
				itr.remove();
				itr.add("tapal");
			}
		}

		list.forEach((elem) -> {
			System.out.println(elem);
		});
	}
}
