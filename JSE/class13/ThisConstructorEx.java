class Sample
	{
private int count ;
private String name;

public Sample()
{
	this(10,"Srinu");
}

public Sample(int count , String name)
{
	this.count = count;
	this.name = name;
}

public void display()
{
	System.out.println(" Count :: "+count);// JVM adds this.count
	System.out.println(" Name  :: "+name);// JVM adds this.name
}
	}

public class ThisConstructorEx
	{
public static void main(String args[])
	{
Sample s = new Sample();
s.display();
	}
	}