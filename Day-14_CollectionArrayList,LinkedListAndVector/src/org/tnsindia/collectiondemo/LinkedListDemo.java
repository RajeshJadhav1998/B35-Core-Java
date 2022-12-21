 package org.tnsindia.collectiondemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	 public static void main(String[] args) {
		List<Character>obj=new LinkedList<Character>();
		
		obj.add('R');
		obj.add('A');
		obj.add('J');
		obj.add('E');
		
		List<Character>obj1=new LinkedList<>();
		System.out.println(obj1.isEmpty());
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains('E'));
		
		
		System.out.println("The collection elements are : "+obj);
		
		//Size of the List
		System.out.println("The total elements are : "+obj.size());
		
		System.out.println("element : "+obj.get(1));
		//ascending order
		Collections.sort(obj);
		System.out.println("The collection elemtnts are : "+obj);
		//descending order
		Collections.reverse(obj);
		System.out.println("The collection elements are : "+obj);
	}

}
