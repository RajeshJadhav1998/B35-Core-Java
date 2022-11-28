package org.tnsindia.inheritance;

//child class for vehicle (sub class)
public class BMW extends Vehicle {
	private String name1;
	public void display1()
	{
		System.out.println("The car name is : "+name1);
	}
	
	//getters and setters
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	
	
}
