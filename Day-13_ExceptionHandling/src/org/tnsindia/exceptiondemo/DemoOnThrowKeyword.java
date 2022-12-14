package org.tnsindia.exceptiondemo;
//demo on throw keywo
public class DemoOnThrowKeyword {
	
	//private data member
	private String contents;
	
	
	//getter and setters
	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}

	//method
	public void display(String contents)
	{
		this.contents=contents;
		if(contents.isEmpty())
		{
			throw new NullPointerException("Content is Empty");
		}
		else
		{
			System.out.println("Contents are : "+contents);
		}
	}
}
