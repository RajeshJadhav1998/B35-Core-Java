package org.tnsindia.collectiondemo;

import java.util.Arrays;
//Driver Class
public class ComparatorDemo {

	public static void main(String[] args) {
		Employee emp[]=new Employee[2];
		
		emp[0]=new Employee();
		emp[0].setAge(24);
		emp[0].setName("Rajesh");
		
		emp[0]=new Employee();
		emp[0].setAge(25);
		emp[0].setName("Saurabh");
		
		//Sorting the age
		Arrays.sort(emp,new AgeComparator());
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee "+(i+1)+"Name: "+emp[i].getName());
		}
	
	}

}
