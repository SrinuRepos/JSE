class Sample
	{
private int count ;
private static final Sample s;
static
{
	s = new Sample();
}

private Sample()
{
	count = 10;
	System.out.println(" Sample Object created :: From Constructor");
}

public static Sample getSampleObject()
	{
		return s;
	}

public int getCount()
{
	return count;
}
	}



public class SingleTonApp
	{
public static void main(String args[])
{
	Sample req1 = Sample.getSampleObject();
	System.out.println(" Req1 : count ::"+req1.getCount());

	Sample req2 = Sample.getSampleObject();
	System.out.println(" Req2 : count ::"+req2.getCount());

	Sample req3 = Sample.getSampleObject();
	System.out.println(" Req3 : count ::"+req3.getCount());


}
	}