package com.google.ex;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class MapEx1
	{
public static void main(String args[])
{
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(1242,"Srinu");
	map.put(1201,"Kiran");
	map.put( null,"Unknown");
	map.put(1236,"Srinu");
	map.put(1242,"Srinu Np");
	map.put(1289,"Kiran");
	map.put(1204,null);
	
	Set< Map.Entry<Integer,String> > set = map.entrySet();

	for(Map.Entry   me:set)
	{
		System.out.println(me.getKey()+" : "+me.getValue());
	}
}

	}








