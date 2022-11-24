package org.tnsindia.packagesexecutor;

import java.util.Scanner;

//importing the class of another package
//import org.tnsindia.packagesdemo.ATM;
import org.tnsindia.packagesdemo.*;

//this is Driver class
public class ATMExecutor {

	public static void main(String[] args) {
		
		Scanner R=new Scanner(System.in);
		System.out.println("Enter the card No. : ");
		String card_no=R.nextLine();
		ATM obj=new ATM();
		obj.display(card_no);
	}

}
