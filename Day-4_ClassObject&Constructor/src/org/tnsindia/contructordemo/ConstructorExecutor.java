package org.tnsindia.contructordemo;
//driver class
public class ConstructorExecutor {

	public static void main(String[] args) {
		
		//object creation
		Construct r=new Construct(); 
		Construct r1=new Construct(25000,"Rajesh");
		Construct r2=new Construct(30000,"Jadhav");
		r1.print();
		r2.print();
	}

}
