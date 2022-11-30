package org.tnsindia.abstractdemo;

public class EmployeePersonExcutor {

	public static void main(String[] args) {
		Person p1=new Employee("Rajesh","Male",23);
		Person p2=new Employee("Chaitali","Female",-4);
		
		//To return the data that we inserted
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();
	}

}
