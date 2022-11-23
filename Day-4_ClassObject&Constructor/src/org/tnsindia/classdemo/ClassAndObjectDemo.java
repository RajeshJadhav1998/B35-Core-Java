package org.tnsindia.classdemo;

import java.util.Scanner;

//Driver class
public class ClassAndObjectDemo {

	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the speed of the Car : ");
		int speed=r.nextInt();
		
		//creation of object
		Raj obj=new Raj();
		
		//compile time input
		//obj.speed=45;
		obj.speed(speed);
		r.close();
	}

}
