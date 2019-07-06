package com.google.ex;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Collection;

public class ConcurrentHashMapEx1
	{
public static void main(String args[])
{
	ConcurrentMap<Integer,String> map = new  ConcurrentHashMap<Integer,String>();
	map.put(1242,"Srinu");
	map.put(1201,"Kiran");
	map.put(1236,"Srinu");
	map.put(1242,"Srinu Np");
	map.put(1289,"Kiran");
	
	
	Set<Integer> set = map.keySet();
		
	System.out.println(" \n\n Iteration Elements of Map");
	for(Integer k : set)
	{
	String v = map.get(k);
	System.out.println(k + " : "+v);
	}

	System.out.println(" \nsize of map "+map.size());	
	System.out.println(" \nContains key 1242 => "+map.containsKey(1242));
	System.out.println(" \nContains Value Kiran => "+map.containsValue("Kiran"));

	System.out.println(" \n\n Before Remove Map "+map);
	map.remove(1242);
	System.out.println(" \n\n After Remove Map "+map);

	
	Collection<String> list = map.values();
	System.out.println(" \n\n Values : "+list);
}

	}








