package org.tnsindia.encapsulationdemo;

import org.tnsindia.accessspecifiresdemo.PublicDemo;

public class HDFCExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		
		//Setters method is used for a to set a value
		h.setAmount(721872);
		
		//Getters method is used to return a value
		System.out.println("The Amount is : "+h.getAmount());
		
		//Driver code for PublicDemo class
		//if any data member is declared as public we can access anywhere
		PublicDemo p=new PublicDemo();
		p.print(5010.98);
	}

}
