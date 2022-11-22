package org.tnsindia.loopingstatements;

public class NestedForLoopStatement {
// Nested for loop statement
	public static void main(String[] args) {
		int i,j;
		
		for(i=1; i<=5; i++ ) // for row
		{
			for(j=1; j<=5; j++ )// for column
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
