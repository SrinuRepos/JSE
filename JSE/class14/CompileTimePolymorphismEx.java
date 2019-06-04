class  Vechile
	{


public void run() 
{
	System.out.println(" Vechile is Running ");
}

public void run(int hp)
{
	System.out.println(" Vechile runs with HP = "+hp);
}
	}


class  Bike extends Vechile
	{
	public Bike()
		{
	System.out.println(" \n\n From Bike Cosntructor");
		}
	}

class  Bus extends Vechile
	{
	public Bus()
		{
	System.out.println(" \n\n From Bus Cosntructor");
		}
	}

public class CompileTimePolymorphismEx
	{
public static void main(String args[])
{
	Vechile c = new Bike();
	c.run();
	c.run(150);  // Calling to these overloaded methods is deciding at compile time

	  c = new Bus();
	  c.run();
	  c.run(300); // Calling to these overloaded methods is deciding at compile time
}	

	} 

