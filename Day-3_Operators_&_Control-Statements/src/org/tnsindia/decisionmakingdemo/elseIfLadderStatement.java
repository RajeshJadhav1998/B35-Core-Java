package org.tnsindia.decisionmakingdemo;

import java.util.Scanner;

public class elseIfLadderStatement {
//If Else-if ladder statement
	public static void main(String[] args) {
		int marks;
		System.out.print("Enter any marks : ");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		
		/* it is used when we have only one if block, multiple else-if blocks and 
		 last only one else block. */
		if(marks>90)
		{
			System.out.println("Topper in your Class...!");
		}
		else if(marks<90 && marks>=80)
		{
			System.out.println("Second in your Class...!");
		}
		else if(marks<80 && marks>=70)
		{
			System.out.println("Third in your Class...!");
		}
		else
		{
			System.out.println("your marks is Average...!");
		}
		obj.close();
	}

}
