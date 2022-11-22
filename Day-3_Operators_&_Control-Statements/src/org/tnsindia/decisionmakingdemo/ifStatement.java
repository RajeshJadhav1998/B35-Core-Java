package org.tnsindia.decisionmakingdemo;

import java.util.Scanner;

public class ifStatement {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age : ");
		Scanner obj=new Scanner(System.in);
		age=obj.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligible for vote...!");
		}
		System.out.println("Thank You...!");

	}

}
