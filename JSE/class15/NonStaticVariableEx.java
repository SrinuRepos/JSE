class Sample
	{
private int count = 10; // Non - Static Variable

public Sample()
	{
count++;
	}

public int getCount()
{
	return count;
}

	}

public class NonStaticVariableEx
	{
public static void main(String args[])
{
	Sample s1 = new Sample();
	System.out.println(" S1 Count :: "+s1.getCount());
	Sample s2 = new Sample();
	System.out.println(" S2 Count :: "+s2.getCount());
	Sample s3 = new Sample();
	System.out.println(" S3 Count :: "+s3.getCount());
}
	}






