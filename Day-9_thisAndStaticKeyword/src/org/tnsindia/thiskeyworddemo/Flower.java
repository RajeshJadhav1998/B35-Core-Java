package org.tnsindia.thiskeyworddemo;

public class Flower {
	
	//private data members
	private String name;
	
	
//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//default constructor
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//paremeterized constructor
	public Flower(String name) {
		this.name=name;
	}
	
	

	
}
