class Parent
	{
int count = 10;
public void display()
{
System.out.println(" From Parent :: display() method");
}
	}

class Child extends Parent
	{
public void print()
{
	System.out.println(" From Child print() :: count "+count);
}
	}

public class SingleLevelInheritance
	{
public static void main(String args[])
{
   Child c = new Child();
	c.print();
	c.display();	
}
	}