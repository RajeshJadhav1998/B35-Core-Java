package org.tnsindia.operatorsdemo;

import java.util.Scanner;
//Ternary Operator
public class TernaryOperator {

	public static void main(String[] args) {
		int a,b, Result;
		System.out.println("Enter Your Two Numbers : ");
		
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		Result=(a>b)?a:b; //you can take True and False also( a>b ? "True" : "False";)
		
		System.out.println("The result is : "+Result);
		
		obj.close();

	}

}
