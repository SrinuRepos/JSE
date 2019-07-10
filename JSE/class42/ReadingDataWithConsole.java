package com.google.ex;
import java.io.Console;
import java.io.IOException;

public class ReadingDataWithConsole
	{
public static void main(String args[]) throws Exception
{
	Console con = System.console();
	System.out.println(" Enter Name");
	String name = con.readLine();

	System.out.println(" Enter Password");
	char[] arr = con.readPassword();
	
	System.out.println(" Details are");
	System.out.println(" name : "+name);
	System.out.print("password : ");
	
	for(int i = 0 ; i < arr.length; i++)
	{
	System.out.print(arr[i]);
	}
	
	
}
	}
