package day2;

public class CircularLinkedList {
	private Node head;

	// create a const
	public CircularLinkedList() {
		head = null;
	}

	// insert the elments in nodes
	public boolean insert(int data) {
		// create a new node
		Node newNode = new Node(data);

		if (newNode == null) {

			return false;
		}
		if (head == null) {
			head = newNode;
			head.setNext(head);
			return true;
		}

		// store a head in last variale
		Node last = head;

		while (last.getNext() != head) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setNext(head);

		return true;

	}

	public boolean insertAtPos(int data, int pos) {
		if ((head == null && pos > 1) || pos <= 0) {
			return false;

		}
		// create a node
		Node newNode = new Node(data);

		if (pos == 1) {
			if (head == null) {
				head = newNode;
				head.setNext(head);
				return true;

			}

			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}

			newNode.setNext(head);
			head = newNode;
			last.setNext(newNode);
			return true;

		}
		Node prev = head;
		for (int i = 0; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == head) {
				return false;
			}
		}

		
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);

		return true;

	}

	// delete by value
	public boolean deleteByVal(int data) {
		if (head == null) {
			return false;
		}
		if (head.getData() == data) {
			if (head.getNext() == head) {
				head = null;
				return true;
			}
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			head = head.getNext();
			last.setNext(head);
			return true;

		}
		Node prev = head, del = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == head) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

	public boolean deleteByPosition(int pos) {
		if (head == null || pos <= 0) {
			return false;
		}
		if (pos == 1) {
			if (head.getNext() == head) {
				head = null;
				return true;
			}
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			head = head.getNext();
			last.setNext(head);
			return true;
		}
		Node prev = head;
		for (int i = 0; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev.getNext() == head) {
				return false;
			}
		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}

	public void display() {
		if (head == null) {
			return;
		}
		// traverse the list
		Node temp = head;
		do {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();

		} while ((temp != head));

		System.out.println();

	}
}
