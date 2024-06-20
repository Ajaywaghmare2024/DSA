package com.binarysearchtree;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean insert(int data) {
		// craete a newNode
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;

		}
		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;

		while(true) {
			if (data == temp.getData()) {
				return false;

			}
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
				System.out.print(temp.getData()+" ");
					return true;
				}
				temp = temp.getLeft();

			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
				System.out.print(temp.getData()+" ");
					return true;
				}
				temp=temp.getRight();

			}

		}
	
	}


	// preorder
	public void preOrder() {
		System.out.println();
		System.out.println("preorder:");

		Node temp = root;
        // create a empty stack 
		Stack<Node>stack=new Stack<>();
		while(temp!=null || !stack.empty()) {
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				stack.push(temp);
				temp=temp.getLeft();
			}
		temp=stack.pop().getRight();
			
		}
		System.out.println();
		
	}
	public void inOrder() {
		System.out.println("Inorder");
		Node temp=root;
		// crrate a stack
		Stack <Node> stack=new Stack<>();
		while(temp!=null || !stack.empty()) {
			while(temp!=null) {
				stack.push(temp);
				temp=temp.getLeft();
			}
			temp=stack.pop();
			System.out.print(temp.getData()+" ");
			temp=temp.getRight();
		}
		System.out.println();
		
		
	}
	
	 public void postOrder() {
		 System.out.println("PostOrder");
		 class Pair{
			 Node node;
			 char flag;
			 
			 public Pair(Node node,char flag) {
				this.node=node;
				this.flag=flag;
			}
		 }
		 Stack<Pair>stack=new Stack<>();
		 Node temp=root;
		 while(temp!=null || !stack.empty()) {
			 while(temp!=null) {
				 stack.push(new Pair(temp,'L'));
				 temp=temp.getLeft();
			 }
			 Pair pair=stack.pop();
			 if(pair.flag=='L') {
				 temp=pair.node.getRight();
				 pair.flag='R';
				 stack.push(pair);
			 }
			 else {
				 System.out.print(pair.node.getData()+" ");
			 }
		 }
		 System.out.println();
	 }

}
