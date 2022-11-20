package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class BitwiseOperator {
//Bitwise Operator
	public static void main(String[] args) {
		System.out.println("Enter Your Two Numbers : ");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		System.out.println("AND : "+(a&b));
		System.out.println("OR : "+(a|b));
		System.out.println("XOR : "+(a^b));
		System.out.println("Complement : "+(~a));
		System.out.println("Right Shift : "+(a>>2));
		System.out.println("Left Shift : "+(b<<2));
		
				
		obj.close();

	}

}
