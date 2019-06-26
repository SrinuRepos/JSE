import java.lang.reflect.*;

class Sample
	{
int count ;
String name;


public Sample()
{
}

public Sample(int count)
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




public class JavaProfiler
	{
public static void main(String args[]) throws Exception
{
Class c = Class.forName(args[0]);

System.out.println(" Class Name :: => "+c.getName());


Field[] fieldArray =	c.getDeclaredFields();
System.out.println(" \n\n Instance Variables ");
	
	for(Field  f : fieldArray)
	{
	System.out.println(f);
	}

Constructor[] conArray =  c.getDeclaredConstructors();
System.out.println(" \n\n Constructors ");
	for(Constructor  con :conArray)
	{
	System.out.println(con);
	}

Method[] methodArray = c.getDeclaredMethods();

System.out.println(" \n\n Methods ");

	for(Method m : methodArray)
		{
	System.out.println(m);
		}
}
	}





















