class Parent
	{
int count = 10;
public void display()
{
System.out.println(" From Parent :: display() method");
}
	}

class Child1 extends Parent
	{
public void print()
{
	System.out.println(" From Child1 print() :: count "+count);
}
	}

class Child2 extends Parent
	{
public void getData()
{
	System.out.println(" From Child2 getData() :: count "+count);
}
	}

public class HirarchicallInheritance
	{
public static void main(String args[])
{
 	Child1 c1 = new Child1();
	Child2 c2 = new Child2();

	System.out.println(" \n\n Child1 Info ");
	c1.display();
	c1.print();

	System.out.println(" \n\n Child2 Info ");
	c2.display();
	c2.getData();

}
	}