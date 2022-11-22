package org.tnsindia.decisionmakingdemo;

import java.util.Scanner;

public class ifElseStatement {
// If Else Statements
	public static void main(String[] args) {
		 int n;
		 System.out.print("Enter any number : ");
		 Scanner obj= new Scanner(System.in);
		 n=obj.nextInt();
		 
		 //it is used to execute two statements either if statement or else statement for single condition
		 if(n>=0)
		 {
			 System.out.println("Your number is Positive...!");
		 }
		 else
		 {
			 System.out.println("Your number is Negative...!");
		 }
		 obj.close();
	}

}
