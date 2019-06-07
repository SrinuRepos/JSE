interface Sample
	{
 public abstract void display();

	}

interface Demo
	{
 public abstract void display();
	}

class Test implements Sample,Demo
{

	public void display()	
		{
	System.out.println(" From Demo :: display() method ");
		}
}

public class InterfaceObservationsApp3
	{
public static void main(String[] args)
{
	Demo s = new Test();
	s.display();
	
}
	}