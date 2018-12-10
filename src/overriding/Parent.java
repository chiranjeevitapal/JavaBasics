package overriding;

import java.util.ArrayList;
import java.util.List;

public abstract class Parent {
	protected List<String> number() {
		return new ArrayList<>();
	}
}
