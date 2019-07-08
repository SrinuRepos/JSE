package com.google.app;
import com.google.ex.Sample;
import java.lang.reflect.Method;

public class PrivateMethodAcces
{
	public static void main(String args[])  throws Exception
	{
		Class c = Class.forName("com.google.ex.Sample");
		Sample s = (Sample) c.newInstance();

		Method m1 = c.getDeclaredMethod("print");
		Method m2 = c.getDeclaredMethod("print",String.class);
		Method m3 = c.getDeclaredMethod("getCount");

		m1.setAccessible(true);
		m2.setAccessible(true);
		m3.setAccessible(true);

		m1.invoke(s);
		m2.invoke(s," Naresh");
		int count =  (int) m3.invoke(s);
		System.out.println(" count "+count);
	
	}
}
