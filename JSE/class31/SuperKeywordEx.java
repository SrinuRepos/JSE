class Parent
	{
private int count ;

public Parent()
{
}

public Parent(int count)
{
	this.count = count;
}

public void setCount(int count)
	{
this.count = count;
	}

public int getCount()
{
	return count;
}
	}

class Child extends Parent 
	{
private int count ;

public Child()
{
}

public Child(int parentCount , int childCount)
{
	super(parentCount);

	this.count = childCount;
}

public void setCount(int count)
	{
this.count = count;
	}

public int getCount()
{
	return count;
}

public  void display()
{
	System.out.println(" Child Count :: "+this.getCount());
	System.out.println(" Parent Count :: "+super.getCount());
}
	}

public class SuperKeywordEx
	{
public static void main(String args[])
{
	Child c = new Child(12,28);
	c.display();
	
}
	}






