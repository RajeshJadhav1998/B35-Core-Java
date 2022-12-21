package org.tnsindia.collectiondemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("Rajesh");
		obj.push("Pandit");
		obj.push("Jadhav");
		obj.push("From Aurangabad");
		System.out.println(obj);
		obj.pop();
		
		System.out.println(obj);
		
		
	}

}
