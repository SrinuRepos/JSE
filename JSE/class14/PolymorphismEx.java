class  Vechile
	{


public void run() 
{
	System.out.println(" Vechile is Running ");
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

public class PolymorphismEx
	{
public static void main(String args[])
{
	Vechile c = new Bike();
	c.run();

	  c = new Bus();
	  c.run();
}	

	} 

