package org.tnsindia.collectiondemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer>obj=new TreeSet<>();
		obj.add(72);
		obj.add(18);
		obj.add(75);
		obj.add(88);
		System.out.println(obj);
		//To extract the elements from set
		for(Integer itr:obj)
		{
			System.out.print(itr+" ");
		}
	
		
	}

}
