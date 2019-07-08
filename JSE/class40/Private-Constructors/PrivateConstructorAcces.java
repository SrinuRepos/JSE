package com.google.app;
import com.google.ex.Sample;
import java.lang.reflect.Constructor;

public class PrivateConstructorAcces
{
	public static void main(String args[])  throws Exception
	{
		Class c = Class.forName("com.google.ex.Sample");
		
	Constructor c1 = c.getDeclaredConstructor();	
	Constructor c2 = c.getDeclaredConstructor(String.class,Integer.class);	

		c1.setAccessible(true);
		c2.setAccessible(true);

		Sample s = (Sample)c1.newInstance();		
		s.getInfo();

		c2.newInstance("Hi",15);
	
	}
}
