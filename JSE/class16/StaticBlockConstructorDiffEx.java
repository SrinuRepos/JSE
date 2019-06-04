class Sample
	{

static
{
	System.out.println(" From Sample :: static block");
	
}

public Sample()
{
	System.out.println(" From Sample :: Constructor ");
}

	}


public class StaticBlockConstructorDiffEx
	{
public static void main(String args[])
{	
	new Sample();
	new Sample();
	new Sample();
}
	}