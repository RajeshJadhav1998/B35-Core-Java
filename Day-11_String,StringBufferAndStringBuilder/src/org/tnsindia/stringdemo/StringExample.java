package org.tnsindia.stringdemo;

import java.util.Scanner;

//Demo on howt to create a string
public class StringExample {

	public static void main(String[] args) {
		//By using string literal
		/* String str1="welcome to TNS India Foundation";
		
		//By using new keyword
		String name=new String("Welcome to B35 Batch");
		
		System.out.println(str1);
		
		System.out.println(name); */
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first-set String");
		//by using string literal
		
		String str1=s.nextLine();
		
		//by using new keyword
		System.out.println("Enter the second-set String");
		
		String str2=new String(s.nextLine());
		
		System.out.println(str1);
		
		System.out.println(str2);
		
		System.out.println(str1==str2);
		
		s.close();

	}

}
