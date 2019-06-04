class Sample
	{
public static int count = 10;
private static String name = "Srinu";

public static void display()
{
	System.out.println(" From Static method : display()");
	System.out.println(name);
}
	}


public class StaticMethodEx
	{
public static void main(String args[])
{
	System.out.println(" Count "+Sample.count);
	Sample.display();
}
	}