package org.tnsindia.inheritance;

import java.util.Scanner;
//Driver Class for Single Inheritance(Main Method)
public class SingleInheritance {

	public static void main(String[] args) {
		
		System.out.println("Enter the name of the Animal : ");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		
		System.out.println("Enter the breed of the Animal : ");
		String breed1=s.nextLine();
		
		Dog d=new Dog();
		d.name=name1;
		d.breed=breed1;
		d.display();
		d.print();
		
		s.close();
	}

}
