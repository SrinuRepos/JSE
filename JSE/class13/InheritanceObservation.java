class Parent
	{
 int count = 10;
public Parent( )
{
System.out.println(" From Parent Constructor  this = "+this );
}


public void display()
{
System.out.println(" From Parent :: display() method");
}
	}

class Child extends Parent
	{
int count = 15;
public Child()
	{
	super();
System.out.println(" From Child Constructor this = "+this);

	}
public void print()
{
	System.out.println(" From Child print() ::");
	System.out.println(" Child count = "+count);// jvm adds this.count
	System.out.println(" Parent count = "+super.count);
}
	}

public class InheritanceObservation
	{
public static void main(String args[])
{
   Child c = new Child();
	c.print();
	c.display();	
}
	}