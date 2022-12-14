package org.tnsinida.arraysdemo;

import java.util.Arrays;

public class UsingArrayClass {
	//VariableArgument Allows methods to recive unspecified number of argument
	
	public static void display(int ...a)
	{
		//sort method is in arrays class which is used to sort the values
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		//function call
		display(72,18,72,75,88,89,99);
		
	}

}
