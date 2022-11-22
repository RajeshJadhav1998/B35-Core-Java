package org.tnsindia.loopingstatements;

import java.util.Scanner;
//While Loop Statement
public class WhileLoopStatement {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter a number : ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		int i=1;
		
		//if you don't know the no. of iteration then use while loop
		while(i<=num)
		{
			System.out.println("Wellcome to java...!"+ i);
			i++;
		}
		obj.close();
	}

}
