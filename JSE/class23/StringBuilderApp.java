package com.google.app;


public class StringBuilderApp
	{
public static void main(String args[])
{
	StringBuilder sb = new StringBuilder("  Srinu ");
	System.out.println("\n\n Before Update sb  ="+sb);

	sb.append(" Welcome");
	System.out.println("\n\n After Update sb  ="+sb);

	

	System.out.println("\n insert(0, 1242) => "+ sb.insert(0,1242));

	System.out.println("\n\n Reverse   ="+sb.reverse());
	
	
}

	}