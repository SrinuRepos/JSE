class  Vechile
	{

	private Vechile()
	{
	}

public void run() 
{
	System.out.println(" Vechile is Running ");
}
	}


class  Bike extends Vechile
	{

public void run() 
{
	System.out.println("Method - OVerridding :: Bus is Running ");

}
	}

public class InheritancePrivateConstructorObservation
	{
public static void main(String args[])
{
	Bike b = new Bike();
	b.run();
}	

	} 

/*
This programs give an error please observe and correct it.
*/