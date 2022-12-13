package org.tnsindia.stringbufferdemo;

public class StringBufferExample {

	public static void main(String[] args) {
StringBuffer s=new StringBuffer("Rajesh Jadhav");//length of Rajesh Jadhav is 12
		
		//capacity method returns the current capacity
		/*
		 The capacity is the number of charactersthat can be stored
		 (including already written characters), beyond whichan allocation will occur.
		 */
		System.out.println(s.capacity());//by default capacity is 16 + it will take lenght of input
		System.out.println(s.length());
		System.out.println(s.append("raj"));
		
		System.out.println(s.insert(2,"Wipro"));
		
		System.out.println(s.capacity());//by default capacity is 16 + it will take input	
		s.setCharAt(4, '3');
		System.out.println(s);
		
	}

}
