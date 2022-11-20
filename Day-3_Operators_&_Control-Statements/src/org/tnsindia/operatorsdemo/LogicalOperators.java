package org.tnsindia.operatorsdemo;

public class LogicalOperators {
//Logical Operators
	public static void main(String[] args) {
		System.out.println("Logical AND(&&) : ");
		System.out.println((10>5) && (20>10));//if both condition is true then your result is true in && operator
		System.out.println((10>5) && (20<10));//if one condition is false in && operator then your result is flase
		System.out.println((5>10)&&(10<20));//if both condition is false then your result is false in && operator
		
		System.out.println("Logical OR(||) : ");
		System.out.println((10>5) ||(20>10));//if both condition is true then your result is true in || Operator
		System.out.println((10>5) ||(20<10));//if Only one condition is true in || Operator then your result is true
		System.out.println((10<5) ||(20<10)); //if both condition is false then your result is false in || operator
		
		System.out.println("Logical NOT(!) : ");
		System.out.println(!(10>5)); //when our result is true then NOT(!)do that reslut false(works opposite)
		System.out.println(!(10<5));//when our result is False then NOT(!) Operator do that result true(Works opposite)
		
	}
}