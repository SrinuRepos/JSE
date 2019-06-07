interface Sample
	{
 public abstract void display();

	}

interface Demo extends Sample
	{
 public abstract void print();
	}

class Test implements  Demo
{

	public void print()	
		{
	System.out.println(" From Test:: print() method ");
		}

	public void display()	
		{
	System.out.println(" From Test:: display() method ");
		}
}

public class InterfaceObservationsApp4
	{
public static void main(String[] args)
{
	Demo s = new Test();
	s.display();
	s.print();
}
	}