package org.tnsinida.arraysdemo;

import java.util.Scanner;

public class ArrayUserInputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		//Array Declaration
		int arr[]=new int[size];
		System.out.println("Enter the values in the array ");
		
		//to enter the values in the array use for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+"th index :");
			arr[i]=s.nextInt();
		}
		System.out.print("Array elements are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		s.close();
	}

}
