package maps;

import java.util.HashMap;
import java.util.Map;

import models.Message;

public class ObjectAsKey {
	public static void main(String args[]) {
		Map<Object, Integer> map = new HashMap<>();
		Message msg1 = new Message("Hello1");
		Message msg2 = new Message("Hello2");
		Message msg3 = new Message("Hello3");
		map.put(msg1, 1);
		map.put(msg2, 1);
		map.put(msg3, 3);
		System.out.println(map.get(msg2));
	}

}
