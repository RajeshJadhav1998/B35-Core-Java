package org.tnsindia.exceptiondemo;
//Demo on Array Index Of Bound Exception
public class ArrayIndexOfBoundExceptionDemo {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		int[] myIntArray=new int [] {1,2,3};
		
		try {
			print(myIntArray);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled"+e);
		}
		//if any statement is outside the try-catch block that is always executed
		System.out.println("Outside try-catch block");
		//Finally block is followed by the catch block
		//Finally block is always executed whether any exception occurred or not
		/*finally
		{
			System.out.println("Finally block is always executed");
		} */
		System.out.println("Outside try-catch block");
	}
	public static void print(int[] arr)
	{
		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed !");
		
	}

}
