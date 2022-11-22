package org.tnsindia.loopingstatements;

public class ForEachLoopStatement {
// For Each Loop statement
	public static void main(String[] args) {
	
		/* int a[]= {10, 20, 30, 40, 50};
		
		for(int b : a)
		{
			System.out.print(b+ " ");
		}
	*/
		
		char x[]= {'x', 'y', 'z'};
		for(int ascii : x) //we can print here ascii value of abcdefgh....z
		{
			System.out.println(ascii);
		}

	}

}
