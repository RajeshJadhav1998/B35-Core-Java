package org.tnsindia.superkeyworddemo;
//Child Class
public class Leopard extends Animal{

	public String name="Leopard";
	
	Leopard()
	{
		//by default it will call to parent class constructor
		//super();
		System.out.println("Child constructor");
	}
	
	public void accept()
	{
		System.out.println("Child class with "+name);
		
		//super keyword for parent class members
		System.out.println(super.name);
		//super keyword for parent class method
		super.accept();
	}
}