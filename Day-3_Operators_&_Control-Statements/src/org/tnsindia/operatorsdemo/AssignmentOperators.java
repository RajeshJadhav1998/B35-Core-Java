package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class AssignmentOperators {
//Assignment Operators
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the value of a and b : ");
		
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		a*=b; //a=a*b;
		System.out.println("Multiplication of Compound Assignment Operator is : "+a);
		
		a+=a; //Compound Assignment Operator(a=a+a)
		System.out.println(a);
		
		a-=b; //Compound Assignment Operator(a=a-b)
		System.out.println(a);
		
		obj.close();
	}

}
