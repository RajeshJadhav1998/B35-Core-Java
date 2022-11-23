package org.tnsindia.contructordemo;

public class Construct {

	public int salary;
	public String name;
	//default constructor
	Construct()
	{
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	public Construct(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
		
	}
	//method
	public void print()
	{
		System.out.println("The Salary of "+name+" is : "+salary);
	}
	
}
