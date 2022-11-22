package org.tnsindia.decisionmakingdemo;

import java.util.Scanner;

public class NestedIfElseStatement {
// Nested if else statement
	public static void main(String[] args) {
		//int a=10, b=20, c=30;
		
		int a,b,c;
		System.out.print("Enter three numbers for cheking greater number : ");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		
		
		/*
		 Whenever we define if else block inside this if else block we define another if else block is called nested if else statement
		 */
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Greater value is : "+a);
			}
			else
			{
				System.out.println("Greater value is : "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("Greater value is : "+b);
			}
			else
			{
				System.out.println("Greater value is : "+c);
			}
		}
		obj.close();
	}

}
