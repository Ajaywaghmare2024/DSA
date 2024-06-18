package day2;


public class CircularMain {

	public static void main(String[] args) {
		CircularLinkedList cll=new CircularLinkedList();
		
		
		
		
		cll.insert(10);
		cll.insert(20);
		cll.insert(30);
		cll.insert(40);
		cll.insert(50);
		
		
		
		cll.display();
		
		cll.insertAtPos(70, 1);
		cll.insertAtPos(100, 6);
		cll.insertAtPos(80, 4);
		
		cll.display();
		
		cll.deleteByVal(80);
		cll.deleteByVal(10);
		cll.deleteByVal(100);
		
		cll.display();
		
		
		
		
		
	}

}
