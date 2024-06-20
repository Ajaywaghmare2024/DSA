package com.stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>(3);
      s.push("Ram");
      s.push("Waghmare");
      s.push("Ajay");
      
      System.out.println(s.pop());
      System.out.println(s.peek());
      System.out.println(s.pop());
      System.out.println(s.peek());
      
	}

}
