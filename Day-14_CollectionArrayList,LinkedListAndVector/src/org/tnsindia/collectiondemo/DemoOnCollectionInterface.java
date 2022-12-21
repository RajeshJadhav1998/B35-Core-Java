package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
//Demo on collection interface
public class DemoOnCollectionInterface {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Collection is an interface we can't instantiate it
		@SuppressWarnings("rawtypes")
		Collection obj=new ArrayList<>();
		obj.add("FullStack");
		obj.add(7218);
		obj.add('R');
		obj.add(72.7f);
		System.out.println("The collection elements are : "+obj);
		//to extract the elements from arraylist
		for(Object itr:obj)
		{
			System.out.print(itr+" ");
		}
	}

}
