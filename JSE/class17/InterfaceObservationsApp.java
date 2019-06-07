interface Sample
	{
 public static final int count = 10;
	
 public abstract void display();

	}

class Demo implements Sample
{

	public void display()	
		{
	System.out.println(" From Demo :: display() method ");
		}
}

public class InterfaceObservationsApp
	{
public static void main(String[] args)
{
	Sample s = new Demo();
	s.display();
System.out.println(" Count :: "+Sample.count);

}
	}