package com.queue;

public class Queue {
	private int size;
	private int rear, front;
	private int arr[];

	public Queue(int size) {
		super();
		this.size = size;
		this.rear = rear;
		this.front = front;
		this.arr = new int[size];
	}

	public boolean isEmpty() {
		return (rear == -1 && front == -1) || (front > rear);
	}

	public boolean isFull() {
		return rear == (size - 1);
	}
    
	public void insert(int data) {
		if(isFull()) {
			return;
		}
		arr[++rear]=data;
		if(front==-1) {
			front=0;
		}
		return;
	}
	
	public int remove() {
		if(isEmpty()) {
			return 0;
		}
		return arr[front++];
	}
	
	public  void display() {
		for(int i=front+1;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
}
