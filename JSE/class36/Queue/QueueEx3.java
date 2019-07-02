package com.google.ex;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

class Sample implements Comparable<Sample>
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
public int compareTo(Sample s)
{
	return this.sampleName.compareTo(s.getSampleName());
}

@Override
public boolean equals(Object obj)
{
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
	return this.sampleId;
}
	}

public class QueueEx3
	{
public static void main(String args[])
{
	Sample s1 = new Sample(1,"Srinu");
	Sample s2 = new Sample(12,"Kiran");
	Sample s3 = new Sample(16,"Akash");
	Sample s4 = new Sample(10,"Naresh");

	Queue<Sample> queue = new PriorityQueue<Sample>();
	queue.offer(s1);
	queue.offer(s2);
	queue.offer(s3);
	queue.offer(s4);
	
	System.out.println(" Elements in Queue => "+queue);

	Sample s5 = new Sample(10,"Naresh");

	System.out.println(" contains s5 => "+queue.contains(s5));
	System.out.println(" s4 hashCode => "+s4.hashCode());
	System.out.println(" s5 hashCode => "+s5.hashCode());

		queue.poll();
	System.out.println(" after 1st remove Elements in Queue => "+queue);
	
		queue.poll();
	System.out.println(" after 2nd remove Elements in Queue => "+queue);


	
	
}
	}






