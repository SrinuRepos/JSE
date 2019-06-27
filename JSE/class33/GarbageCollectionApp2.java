package com.google.ex;

class Sample
{
	public Sample()
	{
	System.out.println(" From Sample Constructor :: Object has been created");
	}

	public void finalize()
	{
	
	System.out.println(" \n\n finalize() method can be used for clean up operations");
	}
}


public class GarbageCollectionApp2
	{
public static void main(String args[])
{
	Sample s = new Sample();
		
	s = new Sample();
	System.gc();

}
	}








	