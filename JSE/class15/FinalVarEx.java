class Sample
	{
private final int count = 10;


public void setCount(int count)
{
	this.count = count; // Compiler give an error final variable can not be updated
}

public int getCount()
{
	return count;
}

	}

public class FinalVarEx
	{
public static void main(String args[])
{
	Sample s = new Sample();
	
	System.out.println(" Count :: "+s.getCount());
}
	}






