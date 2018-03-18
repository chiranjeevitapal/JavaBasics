package company;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(100);
		list.append(443);
		list.append(666);
		list.append(554);
		list.append(988);
		list.append(738);
		list.prepend(563);
		list.delete(554);
		list.display();
	}

}
