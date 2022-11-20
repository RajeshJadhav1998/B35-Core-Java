package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class ArithmeticOperatorsDemo {
//Arithmetic Operators
	
	public static void main(String[] args) {
		int a,b;
		System.out.print("Enter two numbers : ");
		
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		System.out.println("Addition : "+(a+b));
		System.out.println("Substraction : "+(b-a));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+(b/a));
		System.out.println("Remainder : "+(b%a));
		
		obj.close();
		
	}

}
