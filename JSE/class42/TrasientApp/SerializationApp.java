package com.google.ex;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationApp
	{
public static void main(String args[])
{	
		try
	{
	
	Employee emp = new Employee(1232,"Kiran",500f);
	OutputStream out = new FileOutputStream("emp.txt");
	ObjectOutputStream objOut = new ObjectOutputStream(out);
	objOut.writeObject(emp);
	objOut.flush();
	objOut.close();
	out.close();
	System.out.println(" Serilization is done!! ");
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


