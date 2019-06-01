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

class GrandChild extends Child
	{
public void getData()
{
	System.out.println(" From GrandChild getData() :: count "+count);
}
	}

public class MultiLevelInheritance
	{
public static void main(String args[])
{
GrandChild gc = new GrandChild();
	gc.display();
	gc.print();		
	gc.getData();
}
	}