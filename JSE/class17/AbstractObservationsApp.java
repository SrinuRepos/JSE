abstract class Sample
	{
public void display()
{
	System.out.println(" From Sample display ()");
}

public abstract void print();


	} // An abstract  class can contain fully implemeted , fully unimplement or both methods.


abstract class Demo extends Sample
	{
	}// The first concreate class which is inheriting abstract class should provide defination for all the abstract methods otherwise we should declare class as abstract.

class Test extends Demo
	{
public void print()
{
	System.out.println(" From Test :: print() Method");
}
	}

public class AbstractObservationsApp
	{
public static void main(String[] args)
{
	Sample s = new Test();
	s.print();
	s.display();
}
	}