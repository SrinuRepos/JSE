class  Vechile
	{


public void run() 
{
	System.out.println(" Vechile is Running ");
}

public void run(int hp)
{
	System.out.println("From Parent Vechicle :: Runs with HP = "+hp);
}
	}


class  Bike extends Vechile
	{
	
	public void run() 
		{
	System.out.println("From Child Bike :: Bike is Running ");
		}

	}



public class CompileAndRunTimePolymorphismEx
	{
public static void main(String args[])
{
	Vechile c = new Bike();
	c.run(); // Runtime Polymorphism
	c.run(150); // Compiletime - Polymorphism
		 
}	

	} 

