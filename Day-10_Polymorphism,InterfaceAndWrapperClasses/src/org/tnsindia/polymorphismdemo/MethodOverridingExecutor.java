package org.tnsindia.polymorphismdemo;

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MethodOverridingChild m=new MethodOverridingChild();
		MethodOverridingExample m1=new MethodOverridingChild();
		System.out.println(m.mul(15,10));//this method is child class method
		System.out.println(m1.mul(13,35));//Parent class method
	}  

}
