package org.tnsindia.exceptiondemo;
//Demo on Arithmetic Exception
import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Try block contains the exception code
		try {
			int x=14;
			System.out.println("Enter the value of y : ");
			int y=s.nextInt();
			int result=x/y;
			System.out.println(result);
		}
		
		//Catch block will handle the exception reainse by try block
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e);
		}
		s.close();
	}

}
