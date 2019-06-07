class Sample
	{
public static void display()
{
	System.out.println(" From Sample => public void static display ()");
}
	}


class Demo extends Sample
	{
public static void display()
{
	System.out.println(" From Demo => public void static display ()");
}
	}

public class StaticMethodContbeOverridden
	{
public static void main(String args[])
{
	Sample s = new Demo();
	s.display();
}
	}