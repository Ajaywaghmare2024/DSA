package com.app.dsa;

public class MainAnswers {

	public static void main(String[] args) {
		LinkedList lst = new LinkedList();

		lst.insert(10);
		lst.insert(20);
		lst.insert(30);
	    lst.insert(40);
		lst.insert(50);
		lst.display();
		System.out.println("inserted elements");
		lst.insertAtPosition(25, 2);
		lst.insertAtPosition(60, 5);
		lst.display();

		System.out.println("remove elements");
		lst.removeByPosition(2);
		lst.removeByPosition(5);
		lst.display();

		System.out.println("middle elements");
		lst.getmidElements();
		// lst.display();

		System.out.println("Reverse the elements");
		lst.reverse();
		lst.display();

		System.out.println("Third Node");
		lst.thirdNode();

		System.out.println("remove nth elemnts");
		lst.NthNode(2);

		System.out.println("Add the Middle elements");
		//lst.insert(50);
		
		lst.insertMid(4);

	}

}
