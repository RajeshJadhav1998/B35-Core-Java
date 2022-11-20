package org.tnsindia.datatypes;

import java.util.*;

//Demo on user Input for Integer/float/char/string
public class IntegerUserInputDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Integer number : ");
		Scanner obj=new Scanner(System.in);
		int R=obj.nextInt();
		
		System.out.println("Enter the Float number : ");
		float J=obj.nextFloat();
		
		System.out.println("Enter the Char value : ");
		char Rj=obj.next().charAt(1);
		
		System.out.println("Enter the String value : ");
		String str=obj.nextLine();
		
		System.out.println("The Integer value is : "+R);
		System.out.println("The Decimal value is : "+J);
		System.out.println("The Char value is : "+Rj);
		System.out.println("The String value is :"+str);
		obj.close();
	}

}
