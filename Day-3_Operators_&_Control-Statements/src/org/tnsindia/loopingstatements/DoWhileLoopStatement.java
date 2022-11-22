package org.tnsindia.loopingstatements;

public class DoWhileLoopStatement {
//Do while loop statement
	public static void main(String[] args) {
		 int x=1;
		 
		 /*
		  When you don't know the no. of iteration and
		  at least one time it will execute
		  */
		 do
		 {
			 System.out.println("The value of x is : "+x);
			 x++;
		 }
		 while(x<10);

	}

}
