package org.tnsindia.polymorphismdemo;

public class MethodOverloading {
	
	//method overloading
	//1. by having the diffrent types of arguments
	public void addition(int x, int y)
	{
		System.out.println("The addition of x and y is : "+(x+y));
	}
	public void addition(float x, int y)
	{
		System.out.println("The addition of x and y is : "+(x+y));
	}
}

