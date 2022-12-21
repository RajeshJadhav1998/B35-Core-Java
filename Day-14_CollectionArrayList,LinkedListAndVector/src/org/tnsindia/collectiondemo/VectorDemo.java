package org.tnsindia.collectiondemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(12);
		v.add(1,56);
		v.add(2,93);
		
		System.out.println(v);
		
		for(Integer itr:v)
		{
			System.out.print(itr+",");
		}
		
	}

}
