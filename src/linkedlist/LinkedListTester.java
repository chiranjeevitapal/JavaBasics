package linkedlist;

public class LinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		ll.prepend(100);
		ll.prepend(200);
		
		ll.delete(50);
		ll.print();
		System.out.println("##### Reverse");
		ll.reverse();
		
		ll.print();
	}

}
