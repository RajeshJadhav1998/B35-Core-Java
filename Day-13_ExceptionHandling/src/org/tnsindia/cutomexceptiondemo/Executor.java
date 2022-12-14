package org.tnsindia.cutomexceptiondemo;

import java.util.Scanner;
//Driver Class for custom exception
public class Executor {

	public static void main(String[] args) throws LoginCredentials {
		
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		//validating
		
			
			if(id!="Jadhavrajesh@gmail.com" && password!="Rajesh@123")
			{
				throw new LoginCredentials(id, password);
			}
			
			s.close();
	}

}
