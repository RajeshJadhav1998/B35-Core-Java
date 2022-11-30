package org.tnsindia.abstractdemo;
//driver class (main method)
public class ATMMachineExecutor {

	public static void main(String[] args) {
		ATMMachine a=new ATMMachineChild ();//you can use any one 
		//ATMMachineChild a=new ATMMachineChild ();
		a.withdraw();
		a.display();
	}

}
