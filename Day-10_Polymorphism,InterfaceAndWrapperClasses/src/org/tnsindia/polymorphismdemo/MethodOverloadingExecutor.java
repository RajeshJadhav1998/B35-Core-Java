package org.tnsindia.polymorphismdemo;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		//This is object creation
		MethodOverloadigExample m=new MethodOverloadigExample();
		//method calling
		m.addition(20,15);
		m.addition(10,45,25);
		
		System.out.println();
		//object creation
		MethodOverloading m1=new MethodOverloading();
		//method calling
		m1.addition(07,80);
		m1.addition(20.05f,50);
	}

}
