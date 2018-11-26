package linkedlist;

public class LinkedList {
	Node head;

	public void add(int value) {
		if (head == null) {
			head = new Node(value);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(value);
	}

	public void prepend(int value) {
		if (head == null) {
			head = new Node(value);
			return;
		}
		Node current = new Node(value);
		current.next = head;
		head = current;
	}

	public void delete(int value) {
		if (head == null) {
			return;
		}
		if(head.value == value) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.value == value) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
}
