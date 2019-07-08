package com.google.app;
import com.google.ex.Sample;
import java.lang.reflect.Field;

public class PrivateMemberAcces
{
	public static void main(String args[])  throws Exception
	{
		Class c = Class.forName("com.google.ex.Sample");
		Sample s = (Sample) c.newInstance();
		System.out.println(" Before update Count From Sample : "+s);

		Field f = c.getDeclaredField("count");
		f.setAccessible(true);
		System.out.println( " Accessing through Reflection API Field Count "+ f.getInt(s));

		f.setInt(s,12);

		System.out.println(" After update Count From Sample : "+s);
		
		System.out.println( " After Update Accessing through Reflection API Field Count "+ f.getInt(s));
	}
}
