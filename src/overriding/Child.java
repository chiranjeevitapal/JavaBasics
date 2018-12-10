package overriding;

import java.util.LinkedList;


public class Child extends Parent {

	protected LinkedList<String> number() {
		return new LinkedList<>();
	}
}
