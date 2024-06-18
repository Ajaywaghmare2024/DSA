package com.app.dsa;

public class LinkedList {
	private Node head;
	public int cnt;

	public LinkedList() {
		head = null;
	}

	// add method for inserting data
	public boolean insert(int data) {
		// create a new node
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			cnt++;
			return true;

		}
		// check for duplicate
		if (head.getData() == data) {
			return false;
		}

		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			if (temp.getData() == data) {
				return false;
			}
		}
		temp.setNext(newNode);
		cnt++;

		return true;
	}

	// Insert at the specific position

	public boolean insertAtPosition(int data, int pos) {
		if (pos <= 0 || (head == null && pos > 1)) {
			return false;
		}

		// create a node
		Node newNode = new Node(data);

		if (newNode == null) {
			return false;

		}
		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		// locate prev node
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

	// remove by the position
	public boolean removeByPosition(int pos) {
		if (head == null || pos <= 0) {
			return false;

		}
		if (pos == 1) {

			head = head.getNext();
			return true;
		}
		// get prev
		Node prev = head;
		for (int i = 0; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}

		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());
		cnt--;

		return true;

	}

	//// 2.How do you find the middle element of a singly linked list in one pass?
	public void getmidElements() {
		Node cur = head;
		int pos = cnt / 2;
		// odd
		if (pos % 2 == 0) {
			for (int i = 1; i <= pos; i++) {
				cur = cur.getNext();
			}
			System.out.println(cur.getData() + " ");
			return;
		}
		// even
		else {
			for (int i = 1; i <= pos; i++) {
				cur = cur.getNext();
			}
			
			System.out.println(cur.getNext().getData());
			System.out.println();
			return;
		}
	}

	// 3.How do you reverse a singly linked list without recursion?
	public void reverse() {
		if (head == null || head.getNext() == null) {
			return;
		}
		Node n1 = head;
		Node n2 = head.getNext();

		while (n2 != null) {
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}
		head.setNext(null);
		head = n1;
	}

	// // 8.How do you find the third node from the end in a singly linked list?
	public void thirdNode() {
		reverse();
		Node current = head;

		int pos = 3;
		for (int i = 1; i < pos; i++) {
			current = current.getNext();
		}
		System.out.println(current.getData());

	}

	// 9.How to remove Nth Node from the end of a linked list?

	public void NthNode(int pos) {
		reverse();
		removeByPosition(pos);
		display();
	}

     // 11.How to add an element at the middle of the linked list?
	public void insertMid(int data) {
		int pos = cnt / 2;
		insertAtPosition(data, pos + 1);
		display();
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
