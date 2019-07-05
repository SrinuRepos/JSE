package com.google.ex;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

public class PropertiesEx1
	{
public static void main(String args[])
{
	Properties props = new Properties();
	props.put("1242","Srinu");
	props.put("1201","Kiran");
	props.put("1236","Srinu");
	props.put("1242","Srinu Np");
	props.put("1289","Kiran");

	System.out.println(" \n\n Case1 :: Iterating elements using Enumeration");

	Enumeration keys = props.keys();
	while(keys.hasMoreElements())
	{
	String k = (String) keys.nextElement();
	String v = (String) props.get(k);
	System.out.println(k + " : "+v);
	}
	
	
	System.out.println(" \n\n Case2 :: Iterating elements using Map.Entry");
	Set<Map.Entry<Object,Object>> set1 = props.entrySet();

	for(Map.Entry<Object,Object>   me:set1)
	{
		System.out.println(me.getKey()+" : "+me.getValue());
	}

	System.out.println(" \n\n Case3 :: Iterating elements using Set");
	Set set2 = props.keySet();

	for(Object k:set2)
	{
		System.out.println(k+" : "+props.get(k));
	}

	System.out.println(" \n\n Case4 :: Iterating elements using Iterator");
	Set set3 = props.keySet();

	Iterator itr = set3.iterator();
	while(itr.hasNext())
	{
		String k = (String) itr.next();
		System.out.println(k+" : "+props.get(k));
	}
}

	}








