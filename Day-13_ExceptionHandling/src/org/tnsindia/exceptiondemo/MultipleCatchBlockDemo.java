package org.tnsindia.exceptiondemo;
//Demo on multiple catch block
public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		try {
		//By default it takes 0 as we have not pass any argument to args
		int a=args.length;
		System.out.println("The length of a is : "+a);
		int b=12/a;
		System.out.println(b);
		int arr[]= {72,18,75};
		System.out.println(arr[3]);
		}
		
	/*	catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled "+e);
		}  */
		
		//child catch block
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		//default exception -parent catch block
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}

}
