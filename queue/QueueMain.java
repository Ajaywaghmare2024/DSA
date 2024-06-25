package com.queue;

import java.util.Queue;
import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//Queue q=new Queue(4);
			Queue<Integer>que=null;
			boolean exit=false;
			while(!exit) {
				System.out.println("1.insert data\n2.Display\n3.Delete\n4.Exit");
				System.out.println("Enter the choice:");
				switch (sc.nextInt()) {
				case 1:
					// insert data
					System.out.println("Insert data");
					que.offer(sc.nextInt());
					System.out.println();
					break;
				case 2:
					// display the data
					
					break;
				
					
					

				default:
					break;
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
