package com.google.app;
import com.google.ex.Sample;


public class  AnnoymousInnerClassApp
	{
public static void main(String args[])
{

	Sample s = new Sample()
			{
			public void display()
			{
	System.out.println(" From Annonymous Inner class :: display()");
			}
			};
	s.display();
}
	}