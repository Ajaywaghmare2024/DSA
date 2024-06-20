package com.queue;

public class Queue {
	int size;
	int rear, front;
	int arr[];

	public Queue(int size) {
		this.size = size;
		arr = new int[size];
		rear = front = -1;
	}

	public boolean isEmpty() {
		return (rear == -1 && front == -1)||(front>rear);
	}

	public boolean isFull() {
		return rear == (size - 1);
	}
	public int insert(int data) {
		if(isFull()) return 0;
		arr[++rear]=data;
		if(front ==-1) {
			front=0;
		}
	
		return data;
	}
	public int  delete() {
		if(isEmpty()) return -1234;
		return arr[front++];
		
	}

}
