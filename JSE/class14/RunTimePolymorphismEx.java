class  Vechile
	{


public void run() 
{
	System.out.println(" Vechile is Running ");
}

	}


class  Bike extends Vechile
	{
	
	public void run() 
		{
	System.out.println(" Bike is Running ");
		}

	}



public class RunTimePolymorphismEx
	{
public static void main(String args[])
{
	Vechile c = new Bike();
	c.run();
		 
}	

	} 

