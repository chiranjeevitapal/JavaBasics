package Lists;

public class LinkedList {
	Node head;

	public void append(int data) {
		if (head == null) {// This is the first node
			head = new Node(data);
			return;
		}
		Node current = head; // always start from the head
		while (current.next != null) { // iterate the list till the next node is null
			current = current.next;
		}
		// out of the loop once next node is null
		// now add a new node from the current node
		current.next = new Node(data);
	}

	public void prepend(int data) {
		Node current = new Node(data);
		if (head == null) {
			current = head;
		} else {
			current.next = head;
			head = current;
		}
	}

	public void delete(int data) {
		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				if (current.next.next == null) { // if the last element is to be deleted
					current.next = null;
				} else {
					current.next = current.next.next;
				}
			}
			if (current.next != null) {
				current = current.next;
			}
		}
	}

	public void reverse() {
		Node current = head;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void show() {
		Node current = head;
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
			if (current.next == null) {
				System.out.println(current.data);
			}
		}
	}
}
