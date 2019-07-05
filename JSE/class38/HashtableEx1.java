package com.google.ex;

import java.util.Map;
import java.util.Hashtable;
import java.util.Set;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

public class HashtableEx1
	{
public static void main(String args[])
{
	Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
	hashtable.put(1242,"Srinu");
	hashtable.put(1201,"Kiran");
	hashtable.put(1236,"Srinu");
	hashtable.put(1242,"Srinu Np");
	hashtable.put(1289,"Kiran");

	System.out.println(" \n\n Case1 :: Iterating elements using Enumeration");

	Enumeration<Integer> keys = hashtable.keys();
	while(keys.hasMoreElements())
	{
	Integer k = keys.nextElement();
	String v = hashtable.get(k);
	System.out.println(k + " : "+v);
	}
	
	
	System.out.println(" \n\n Case2 :: Iterating elements using Map.Entry");
	Set< Map.Entry<Integer,String> > set1 = hashtable.entrySet();

	for(Map.Entry   me:set1)
	{
		System.out.println(me.getKey()+" : "+me.getValue());
	}

	System.out.println(" \n\n Case3 :: Iterating elements using Set");
	Set< Integer > set2 = hashtable.keySet();

	for(Integer k:set2)
	{
		System.out.println(k+" : "+hashtable.get(k));
	}

	System.out.println(" \n\n Case4 :: Iterating elements using Iterator");
	Set< Integer> set3 = hashtable.keySet();

	Iterator<Integer> itr = set3.iterator();
	while(itr.hasNext())
	{
		Integer k = itr.next();
		System.out.println(k+" : "+hashtable.get(k));
	}
}

	}








