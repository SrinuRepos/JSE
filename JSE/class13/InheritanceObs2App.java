class Sample
	{
private String sampleName ="Srinu";

	}

class Test extends Sample
	{

public void getTestData()
{
System.out.println(" From Test : sampleName  "+sampleName );
}
	}

public class InheritanceObs2App
	{
public static void main(String args[])
{
Test obj = new Test();
obj.getTestData();
}
	}