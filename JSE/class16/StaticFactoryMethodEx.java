class Sample
	{

private Sample()
{
	
}

public static Sample getSampleObject()
{
	System.out.println(" Demo on StaticFactory Method");
	Sample s = new Sample();
	return s;
} //Static Factory Method


public void getInfo()
{
	System.out.println(" From Sample getInfo()");
}
	}


public class StaticFactoryMethodEx
	{
public static void main(String args[])
{
		Sample s = Sample.getSampleObject();
		s.getInfo();
}
	}