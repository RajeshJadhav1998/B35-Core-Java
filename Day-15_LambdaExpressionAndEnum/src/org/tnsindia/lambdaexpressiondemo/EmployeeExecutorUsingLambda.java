package org.tnsindia.lambdaexpressiondemo;
//Driver Class
public class EmployeeExecutorUsingLambda {

	public static void main(String[] args) {
		/* implementing the functional interface- Employee using
		Lambda expression-with No parameter */
		/* Employee obj=()->{
			System.out.println("Lambda expression-No paramter");
		};
		obj.display(); */
		
		/* implementing the functional interface- Employee using
		Lambda expression-with two parameter */
		/* Employee obj=(int a, int b)->{
			
			 int result=(a>b)?a:b;
			 System.out.println("The maximum number is: "+result);
			return result;
			 
		};
		obj.max(72,75); */
		
		//Lambda expression without return type
		Employee obj=(a,b)->(a>b)?a:b;
		System.out.println("The maximum number is: "+obj.max(72,75));
	
	}

}
