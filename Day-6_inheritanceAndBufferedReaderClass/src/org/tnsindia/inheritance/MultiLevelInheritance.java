package org.tnsindia.inheritance;

import java.util.Scanner;
//driver class(main method
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the vehicle name : ");
		String veh_name=s.nextLine();
		Tyre t= new Tyre();
		t.setName(veh_name);
		t.display();
		
		System.out.println("Enter the vehicle brand name : ");
		String brand=s.nextLine();
		t.setName1(brand);
		t.display1();
		
		System.out.println("Enter the tyre name : ");
		String t_name=s.nextLine();
		t.setTyre_name(t_name);
		t.display3();
		
		s.close();
	}


}
