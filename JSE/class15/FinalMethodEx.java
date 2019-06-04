class Parent
	{
private String name = "Venkat";

public final String getName()
{
	return name;
}

	}

class Child extends Parent
	{
public String getName()
{
	return "Akash";
}
	}


public class FinalMethodEx
	{
public static void main(String args[])
{
	Parent p = new Child();
	System.out.println(" Name :: "+p.getName());

	
}
	}






