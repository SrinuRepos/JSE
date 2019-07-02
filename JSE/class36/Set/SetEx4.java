package com.google.ex;
import java.util.HashSet;
import java.util.Set;


class Sample 
	{
private Integer sampleId = null;
private String sampleName = null;

public Sample(Integer sampleId , String sampleName)
{
	this.sampleId = sampleId;
	this.sampleName = sampleName;
}
	//setters and getters

public int getSampleId()
{
return sampleId;
}

public String getSampleName()
{
return sampleName;
}

@Override
public String toString()
{
	return sampleId + " : "+sampleName;
}

@Override
public boolean equals(Object obj)
{
	System.out.println(" Search equals(Object) called");
	if(obj == null)
		return false;

	if( this == obj)
		return true;

	Sample s = (Sample) obj;

	return this.sampleId.equals(s.getSampleId()) ;
}

@Override
public int hashCode()
{
	System.out.println(" Search hashCode() called");
	return this.sampleId;
}


	}


public class SetEx4
	{
public static void main(String args[])
{
	Set<Sample> set = new HashSet<Sample>();
	Sample s1 = new Sample(1,"Srinu");
	Sample s2 = new Sample(12,"Kiran");
	Sample s3 = new Sample(16,"Akash");
	Sample s4 = new Sample(10,"Naresh");

	System.out.println("\n\n Adding 4 Elements ");
	set.add(s1);
	set.add(s2);
	set.add(s3);
	set.add(s4);
	System.out.println(" Elements in Set =>"+set);


	Sample s5 = new Sample(10,"Naresh");

	System.out.println("\n\n Searching Elements ");
	System.out.println(" Contains s5 =>"+set.contains(s5));

	System.out.println("\n\n Displaying hascode of s4 and s5 ");
	System.out.println(" s4 hasCode =>"+s4.hashCode());
	System.out.println(" s5 hasCode =>"+s5.hashCode());

}
	}






