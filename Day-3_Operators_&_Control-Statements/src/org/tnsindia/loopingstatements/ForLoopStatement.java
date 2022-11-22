package org.tnsindia.loopingstatements;

import java.util.Scanner;
//For loop statement
public class ForLoopStatement {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter a number for Where do you want natural number : ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		
		//when you know how many times the loop will execute then use for loop
		for(int i=1; i<=num; i++)
		{
			System.out.println(i+ " ");
		}
	}

}
