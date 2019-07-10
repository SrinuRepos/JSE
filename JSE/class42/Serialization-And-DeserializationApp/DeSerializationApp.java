package com.google.ex;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeSerializationApp
	{
public static void main(String args[]) 
{	
		try
	{
	
	
	InputStream fin = new FileInputStream("emp.txt");
	ObjectInputStream objIn = new ObjectInputStream(fin);
	
	Employee emp = (Employee) objIn.readObject();
	objIn.close();
	fin.close();
	System.out.println(" DeSerilization is done!! "+emp);
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
	catch(Exception exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


