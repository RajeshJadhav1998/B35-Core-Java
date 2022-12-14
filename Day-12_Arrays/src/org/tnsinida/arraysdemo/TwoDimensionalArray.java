package org.tnsinida.arraysdemo;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int [][]arr= {{72,18,},{89,99,},{94,21,}};//[3][2]
		System.out.println(arr[0][1]);//18
		System.out.println(arr[1][1]);//99
		System.out.println(arr[2][0]);//94
		
		System.out.println("Array elements are : ");
		//to print array elements
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
