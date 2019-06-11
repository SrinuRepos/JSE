package com.google.app;
import com.google.ex.Sample;

public class CheckedExpEx
	{
public static void main(String args[]) 
{
	try
	{
	Class c = Class.forName(args[0]);
	Sample s = (Sample) c.newInstance();
	s.getInfo();
	}catch(ArrayIndexOutOfBoundsException exp)
	{
	System.out.println(" \n\n Please pass class name as CommandLine Argument");
	}catch(ClassNotFoundException exp)
	{
	System.out.println("  \n\n  Invalid class name => Please pass class name with package ");
	}catch(InstantiationException exp)
	{
	System.out.println("  \n\n  Default Constructor Not Found in Loaded class ");
	}
	catch(IllegalAccessException exp)
	{
	System.out.println("  \n\n  Please make Default Constructor Public ");
	}
}
	}