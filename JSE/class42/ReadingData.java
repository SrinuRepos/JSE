package com.google.ex;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadingData
	{
public static void main(String args[]) throws Exception
{
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(reader);
	System.out.println(" Enter Name ");
	String name = br.readLine();

	System.out.println(" Enter Password ");
	String password = br.readLine();

	System.out.println( "\n\n Details are "+name + ": "+password);
	
	
}
	}
