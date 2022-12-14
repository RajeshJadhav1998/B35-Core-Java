package org.tnsindia.exceptiondemo;

import java.util.Scanner;
//Demo on when finally block is not executed
public class FinallyBlockNotExecutedDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		try {
			int x=12;
			int y=s.nextInt();
			System.out.println("Inside try-catch"+x/y);
			//when you called below line any your try block does not contain
			//any exception, then finally block is not executed
			
			System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled "+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		s.close();

	}

}
