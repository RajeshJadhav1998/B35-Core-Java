package org.tnsindia.bultinannotationdemo;

import java.util.ArrayList;

public class SuppressWarningDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//used to solve the compile time warning
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>();
		obj.add(72);
		obj.add("Rajesh");
		obj.add(75.143);
		System.out.println(obj); 

	}

}
