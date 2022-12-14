package org.tnsinida.arraysdemo;
//Demo On VariableArguments

//VariableArguments Allows methods to receive unspecified number of argument
public class VariableArguments {
//String ...s is variable -argument and it contain o-n values
	public static void print(int a,int b,String ...s)
	{
		System.out.println(a+" "+b);
		//to print variableArguments
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
		
	}
	
	public static void main(String[] args) {
		//function call
		print(12,25,"Rajesh","Jadhav","Java","HTML");
		
		
	}

}
