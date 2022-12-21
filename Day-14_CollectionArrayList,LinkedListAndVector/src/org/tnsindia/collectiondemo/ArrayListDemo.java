package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		/* int arr[]=new int[5];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		arr[3]=15;
		arr[4]=16;
		//arr[5]=17;
		System.out.println(arr[4]); */
		
		
		List<Character>obj=new ArrayList<>(3);
		
		obj.add('R');
		obj.add('A');
		obj.add('J');
		obj.add('E');
		
		System.out.println("The collection elements are : "+obj);
		
		//Size of the List
		System.out.println("The total elements are : "+obj.size());
		
		System.out.println("element : "+obj.get(1));
		
		
	}

}
