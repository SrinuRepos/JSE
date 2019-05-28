class Sample
	{
int count = 10;
String name = "Srinu";

public void display()
{
System.out.println(" From display() method :: Sample");
}
	}

public class SampleApp
	{
public static void main(String args[])
{
	Sample s = new Sample();
	System.out.println(" COUNT ::"+s.count);
	System.out.println(" NAME  ::"+s.name);
	s.display();
	s.display();
	s.display();
}
	}