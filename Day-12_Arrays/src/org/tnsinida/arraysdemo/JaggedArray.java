package org.tnsinida.arraysdemo;

import java.util.Scanner;
/* Jagged array in java is array of arrays such that member arrays can be of different sizes 
 * i.e., we can create a 2-D arrays but with variable number of columns in each row.
 * These type of arrays are also known as jagged arrays.
 
 */

public class JaggedArray {

	public static void main(String[] args) {
		//Declaring 2D array with 2 rows
		int arr[][]=new int[2][];
	 	//make this array as jagged array
		//first row has 2 columns
		arr[0]=new int[2];
		//second row has 1 column
		arr[1]=new int[1];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				//1st row - 2nd column, 2nd row - 1 column =3 elemnts
				System.out.println("Enter the elements of an array : ");
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Jagged array is : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		s.close();

	}

}
