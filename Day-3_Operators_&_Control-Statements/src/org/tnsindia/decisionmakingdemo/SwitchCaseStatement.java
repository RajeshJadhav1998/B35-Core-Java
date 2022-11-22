package org.tnsindia.decisionmakingdemo;

import java.util.Scanner;
//Switch case statement
public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		int a=10, b=20, choice;
		System.out.println("Select Your Choice No. For Addition : 1 , For Substraction : 2 , For Multiplication : 3 , For Division : 4 ");
		Scanner obj=new Scanner(System.in);
		choice=obj.nextInt();
		
		
		/*
		 Switch case is a multiple choice decision making selection statements. 
		 It is used when we want to select only one case out of multiple cases.
		 */ 
		switch(choice)
		{
		case 1 : System.out.println("Addition : "+(a+b));
		break;
		
		case 2 : System.out.println("Substraction : "+(a-b));
		break;
		
		case 3 : System.out.println("Multiplication : "+(a*b));
		break;
		
		case 4 : System.out.println("Division : "+(a/b));
		break;
		
		default : System.out.println("Invalid Choice Number...!");
		}
		
		obj.close();

	}

}
