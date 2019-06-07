abstract class Sample
	{
int count ;

public Sample()
{
	count = 10;
	System.out.println(" From abstract class Sample :: Constructor  => this = "+this);
}

public abstract int getCount();

	} 


class Demo extends Sample
	{

public Demo()
{
	super();// JVM adds it internally
	System.out.println(" From abstract class Demo :: Constructor => this ="+this);
}
public int getCount()
	{
return count;
	}

	}

public class AbstractObservationsApp2
	{
public static void main(String[] args)
{
	Sample s = new Demo();
	System.out.println(" Count :: "+s.getCount());

}
	}