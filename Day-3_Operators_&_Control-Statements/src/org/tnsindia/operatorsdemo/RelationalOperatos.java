package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class RelationalOperatos {
//Relational Operators
	public static void main(String[] args) {
		int a,b;
		
		System.out.print("Enter your two numbers : ");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		System.out.println("True/False : "+(a>b));
		System.out.println("True/False : "+(a<b));
		System.out.println("True/False : "+(a>=b));
		System.out.println("True/False : "+(a<=b));
		System.out.println("True/False : "+(a==b));
		System.out.println("True/False : "+(a!=b));
		
		obj.close();
		

	}

}
