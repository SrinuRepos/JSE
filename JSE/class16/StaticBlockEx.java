class Sample
	{
private static int count ;

static
{
	System.out.println(" From Sample :: static block");
	count = 10;
}

public Sample()
{
	
}

public static void display()
{
	System.out.println(" Count :: "+count);
}
	}


public class StaticBlockEx
	{
public static void main(String args[])
{	
	Sample.display();
}
	}