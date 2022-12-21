package org.tnsindia.collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
//demo on hashmap
//Hashmap prints the value in an unordered manner and LinkedHashmap prints an ordered wise
//TreeMap print the entries according to ascending orders of keys
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new TreeMap<>();
		//Map<Integer,String>obj=new HashMap<>();
		////Map<Integer,String>obj=new LinkedHashMap<>();
		obj.put(7218,"Chaitali");
		obj.put(7219,"Anu");
		obj.put(7220,"Usha");
		obj.put(7221,"Aditya");
		System.out.println(obj);
		
		obj.remove(7221);//it removes the entire for key 7221
		System.out.println(obj);
		//to extract the entry from a map
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
