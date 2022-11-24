package org.tnsindia.accessspecifiresdemo;

public class DefaultDemo {
	
	//This is default Data Member
	
	/*If any variable,method,constructor and class is a default
	 * then we can access this only inside the same package*/
	int speed;

	//This is Constructor
	DefaultDemo(int speed) {
		super();
		this.speed = speed;
	}
	
	//This is Method
	void display()
	{
		System.out.println("The speed is : "+speed);
	}

}
 