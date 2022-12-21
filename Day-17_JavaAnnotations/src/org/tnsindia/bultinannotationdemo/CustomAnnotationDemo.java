package org.tnsindia.bultinannotationdemo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface MyCustom
{
	 
		 //abstract method
		 String print();
	 
}
class MyCustomAnnotation
{
	@MyCustom(print="C2TC-java")
	public void display()
	{
		System.out.println("Hey, Today is the Thursday...");
	}
}

//Driver class
public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, Exception {
		MyCustomAnnotation m=new MyCustomAnnotation();
		m.display();
		Method m1=m.getClass() .getMethod("diplay");
		MyCustom obj=m1.getAnnotation(MyCustom.class);
		System.out.println(obj.print());
	}

}
