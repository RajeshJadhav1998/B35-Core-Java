package org.tnsindia.exceptiondemo;

import java.util.Scanner;

public class ThrowKeywordDemo {
	
	public static void print(int age, int weight) 
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			//throw key is used to throw an exception explicitly
			throw new ArithmeticException("Not Eligible to donate the blood");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Your Age and then weight : ");
		
		Scanner s=new Scanner (System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		try
		{
			//calling the method
			print(age,weight);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		s.close();

	}

}
