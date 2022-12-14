package org.tnsinida.arraysdemo;

public class ArrayDemo {

	public static void main(String[] args) {
		//multiple ways to declare and initialize the array
		int[] arr= {11,15,20,25,53};
		
		//The value inside the arr1 is char but the type is int so it will convert into ASCII value
		int  []arr4= {'J','a','d','h','a','v'};
		char []arr1= {'R','a','j','e','s','h'};
		float arr2[]= {1.1f,1.2f,1.3f,1.4f,1.5f,1.6f};
		int arr3[]=new int[5];
		arr3[0]=45;
		arr3[1]=54;
		arr3[2]=92;
		arr3[3]=85;
		arr3[4]=67;
		
		
		System.out.println("The array elements are: "+arr[4]);
		System.out.println("The array elements are: "+arr1[2]);
		System.out.println("The array elements are: "+arr2[3]);
		//to print all the array elements using enhanced(foreach) for loop
		for(int itr:arr3)
		{
			System.out.println(itr);
		}
		System.out.println();
		//to print all the array elements using enhanced for loop
		for(char i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+ " ");
			
		}
		System.out.println("The array elements are: "+arr3[1]);
		
		System.out.println("The ASCII value is : "+arr4[3]);
	}

}
