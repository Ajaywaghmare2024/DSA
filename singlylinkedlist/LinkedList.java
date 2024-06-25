package com.singlylinkedlist;

public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
		head = null;
	}

	// insert data
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;

		}
		if (head == null) {
			head = newNode;
			return true;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}

	public boolean insertAtPosition(int data, int pos) {
		if ((head == null && pos > 1) || pos <= 0) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 0; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	// delete by value
	public boolean deleteByVal(int val) {
		if (head == null) {
			return false;
		}

		if (head.getData() == val) {
			head = head.getNext();
			return true;
		}
		Node del = head, prev = head;
		while (del.getData() != val) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}

		}
		prev.setNext(del.getNext());
		return true;
	}

	// delete by pos
	public boolean deleteByPos(int pos) {
		if (head == null && pos <= 0) {
			return false;
		}
		if (pos == 1) {
			head = head.getNext();
			return true;
		}
		Node del = head, prev = head;
		for (int i = 1; i < pos; i++) {
			prev = del;
			del = del.getNext();
		}
		prev.setNext(del.getNext());
		return true;

	}

	// maximum
	public int maxNum() {
		Node temp = head;
		int max = head.getData();
		while (temp != null) {
			if (temp.getData() > max) {
				max = temp.getData();
			}
			temp = temp.getNext();
		}

		return max;
	}

	public int minNum() {
		Node temp = head;
		int min = head.getData();
		while (temp != null) {
			if (temp.getData() < min) {
				min = temp.getData();
			}
			temp = temp.getNext();
		}
		return min;
	}

	public boolean reverseList(Node temp) {
		if (temp == null) {
			return false;
		}
		reverseList(temp.getNext());
		System.out.print(temp.getData() + " ");

		return true;

	}

	/// count
	public int count(Node head) {
		if (head == null) {
			return 0;
		}

		return 1 + count(head.getNext());
	}

	// serch by value
	public boolean searchByVal(int data) {
		int count = 1;
		Node temp = head;
		while (temp != null && temp.getData() != data) {
			temp = temp.getNext();
			count++;
		}
		System.out.println("value found at=" + count);
		return true;

	}

	// sorting
	public void ascendingSort() {
		if (head == null) {
			return;
		}
		int num = 0;
		Node temp = head, trav = head;

		while (temp != null) {
			   while(trav!=null) {
				if (trav.getData() < temp.getData()) {
					num = trav.getData();
					trav.setData(temp.getData());
					temp.setData(num);
				}
				trav = trav.getNext();

			}
			temp = temp.getNext();
			trav = temp;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

}
