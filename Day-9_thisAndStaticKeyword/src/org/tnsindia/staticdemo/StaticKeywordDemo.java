package org.tnsindia.staticdemo;
//Demo on static variable
public class StaticKeywordDemo {

	//static variable
	static int a=56;
	float b;
	
	//static method
	public static void accept()
	{
		System.out.println("Wellcome to java full stack Program");
	}
	
	//static block is used to initialize static data members
	static
	{
		a=12;
		//we cant use non static variable inside static block
		//b=19;
	}
}
