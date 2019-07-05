package com.google.ex;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.io.FileInputStream;

public class PropertiesEx
	{
public static void main(String args[]) throws Exception
{
	FileInputStream fin = new FileInputStream("db.properties");
	Properties props = new Properties();
	props.load(fin);

	System.out.println(" UserName : "+props.getProperty("username"));
	System.out.println(" Password : "+props.get("password"));

	System.out.println(" \n\n Case 1, Case2,Case3, Case4 same as before ex:");
	Set  set = props.keySet();
	for(Object k : set)
	{
	System.out.println( k + " : "+props.get(k));
	}

	System.out.println(" \n\n Case 5 : Reading key as a String");
	Set<String>  set2 = props.stringPropertyNames();
	for(String k : set2)
	{
	System.out.println( k + " : "+props.getProperty(k));
	}
}

	}








