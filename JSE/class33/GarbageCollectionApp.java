package com.google.ex;

class Sample
{
	public Sample()
	{
	System.out.println(" From Sample Constructor :: Object has been created");
	}

	public void finalize()
	{
	System.out.println(" \n\n Finalize method :: Object is about to removed ::");
	System.out.println(" finalize() method can be used for clean up operations");
	}
}


public class GarbageCollectionApp
	{
public static void main(String args[])
{
	Sample s = new Sample();
	s  = null;
	System.gc();

}
	}








	