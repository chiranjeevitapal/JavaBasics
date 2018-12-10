package Lists;

public class LinkedListExecuter {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(14);
		list.append(456);
		list.append(1229);
		list.append(8870);

		list.prepend(18);

		list.delete(14);

		list.show();

		list.reverse();
		System.out.println("###### Reverse");
		list.show();
	}

}
