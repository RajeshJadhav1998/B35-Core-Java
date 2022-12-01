package org.tnsindia.thiskeyworddemo;
//5.to invoke current class constructor
public class Color {
	
	public String name;
	
	//Default constructor
	Color()
	{
		this("Pink");//invoking parameterrized constructor
		System.out.println("Default Constructor");
	}
	//parameterrized constructor
	Color(String name)
	{
		System.out.println("The Color is :"+name);
	}

}
