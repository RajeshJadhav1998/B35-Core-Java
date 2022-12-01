package org.tnsindia.finalkeyworddemo;

/* final method is inherited but can't override*/
public class FinalMethodWithChild extends FinalMethodWithParent {

	public String PAN_no;
	public long aadhar_no;
	
	/*If we use final keyword with method then method override is not 
	 possible
	 */
	
	
	//method overriding
	/*public void print()
	{
		System.out.println("PAN no. is : "+PAN_no);
	}*/
	
	//method overloading
	public void print(String PAN_No)
	{
		System.out.println("PAN no. is : "+PAN_no);
	}
}
