package com.queue;

public class CircularQueue {
	int arr[];
	int size;
	int rear, front;

	public CircularQueue(int size) {
		this.size = size;
		rear = front = -1;
		arr = new int[size];

	}

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return (front == -1 && rear == (size - 1)) 
				|| ((rear + 1) % size == front);
	}
	
	public boolean insert(int data) {
		if(isFull()) return false;
		rear=(rear+1)%size;
		arr[rear]=data;
		return true;
	}
	
	public int delete() {
		if(isEmpty()) return 1234;
		front=(front+1)%size;
		return arr[front];
		
	}

}
