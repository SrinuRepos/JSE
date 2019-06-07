interface Sample
	{
 public static final int count = 10;
	
 public abstract void display();

public static void print()
	{
	System.out.println(" From interface Sample :: print()");
	}

	}

class Demo implements Sample
{

	public void display()	
		{
	System.out.println(" From Demo :: display() method ");
		}
}

public class InterfaceObservationsApp2
	{
public static void main(String[] args)
{
	Sample s = new Demo();
	s.display();
	Sample.print();
System.out.println(" Count :: "+Sample.count);

}
	}