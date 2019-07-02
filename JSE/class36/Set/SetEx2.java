package com.google.ex;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2
	{
public static void main(String args[])
{
	Set<Integer> set = new LinkedHashSet<Integer>();
	set.add(13);
	set.add(12);
	set.add(null);
	set.add(14);
	set.add(13);
	set.add(12);
	set.add(1);
	set.add(2);
	set.add(104);
	set.add(130);
	System.out.println(" Elements in Set =>"+set);

}
	}






