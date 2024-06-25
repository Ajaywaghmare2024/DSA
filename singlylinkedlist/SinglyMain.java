package com.singlylinkedlist;

import java.util.Scanner;

public class SinglyMain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			LinkedList ll = new LinkedList();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Insert data\n2.Display All Node\n3.InsertAtPosition\n"
						+ "4.Delete by val At First\n5.Delete by position\n6.Max Number\n"
						+ "7.MinNumber\n8.Revere the list\n9.duplicate\n10.count the number\n"
						+ "11.searchByvalu\n12.sorting\n0.Exit");

				System.out.println("Enter the choice:");
				switch (sc.nextInt()) {
				case 1:
					// insert Data
					System.out.println("Enter Data");
					ll.insert(sc.nextInt());
					System.out.println();

					break;

				case 2:
					// display
					ll.display();
					System.out.println();
					break;
				case 3:
					// insertAtPosition
					System.out.println("Enter the data and position:");
					ll.insertAtPosition(sc.nextInt(), sc.nextInt());
					System.out.println();
					break;

				case 4:
					// delete by val
					System.out.println("Enter the deleteFrist value");
					ll.deleteByVal(sc.nextInt());
					System.out.println();
					break;
				case 5:
					// delete by position
					System.out.println("Enter the position:");
					ll.deleteByPos(sc.nextInt());
					System.out.println();
					break;
				case 6:
					// max
					int maxNo = ll.maxNum();
					System.out.println("the Max No="+maxNo);
					break;
				case 7:
					// min
					int minNo=ll.minNum();
					System.out.println("the min No="+minNo);
					break;
				case 8:
					// reverse the list
					System.out.println("reverse the List:");
					ll.reverseList(ll.getHead());
					System.out.println();
					break;
				case 9:
					System.out.println("Enter the duplicate num");
					int num=sc.nextInt();
					while(ll.deleteByVal(num));
		           break;
				case 10:
					System.out.println("count the number="+ll.count(ll.getHead()));
					break;
				case 11:
					System.out.println("Enter the val:");
					 ll.searchByVal(sc.nextInt());
					break;
				case 12:
					System.out.println("Sorting ===");
					ll.ascendingSort();
					System.out.println();
					break;
					

				case 0:
					exit = true;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
