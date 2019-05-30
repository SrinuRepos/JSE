class Sample
	{
public void print()
	{
System.out.println(" Method Overloading Demo ");
	}
public void print(int count)
{
	System.out.println(count);
}

public void print(String name)
{
	System.out.println(name);
}

public void print(int count,String name)
{
	System.out.println(count+ " :: "+name);
}
	}

public class MethodOverloadingEx
	{
public static void main(String args[])
{
	Sample s = new Sample();
	s.print();
	s.print(1242);
	s.print("Srinu");
	s.print(1243,"Naresh");
}
	}



