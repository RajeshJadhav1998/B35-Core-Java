package org.tnsindia.collectiondemo;

import java.util.LinkedHashSet;
//Demo on LinkedHash set
/* HashSet is an unordered but LinkedHashSet is an ordered*/
public class LinkHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String>obj=new LinkedHashSet<String>();
		obj.add("Chaitali");
		obj.add("USha");
		obj.add("Aditya");
		obj.add("Varad");
		
		System.out.println(obj);
		//to extract the elements from set
		for(String itr:obj)
		{
			System.out.print(itr+" ");
		}
	}

}
