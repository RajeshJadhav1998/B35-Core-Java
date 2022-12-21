package org.tnsindia.collectiondemo;

import java.util.HashSet;
import java.util.Set;
//Demo on set Interface
// To implement the set use Hashset/LinkedHashSet
public class HashSetDemo {

	public static void main(String[] args) {
		boolean arr[]=new boolean[5];
		//set is an unordered so when it prints the element it will print in any order
		Set<Integer>obj=new HashSet<>();
		arr[0]=obj.add(12);
		arr[1]=obj.add(95);
		arr[2]=obj.add(61);
		arr[3]=obj.add(44);
		arr[4]=obj.add(33);
		System.out.println(obj);
		//to extract the elements from set
		for(Integer itr:obj)
		{
			System.out.print(obj+" ");//5 times it will same array
		}
		

	}

}
