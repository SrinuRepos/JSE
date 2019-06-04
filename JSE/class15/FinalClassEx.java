final class Parent
	{
private String name = "Venkat";

public String getName()
{
	return name;
}

	}

class Child extends Parent
	{

	}


public class FinalClassEx
	{
public static void main(String args[])
{
	Parent p = new Child();
	System.out.println(" Name :: "+p.getName());

	
}
	}






