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
	System.out.println("Method - OVerridding :: Bus is Running ");

}// All Overriding rules should be followed here

public void run(int count)
{
	System.out.println("Method - OVerLoading :: From Bike count = "+count);
}
	}

public class MethodOverrdingEx
	{
public static void main(String args[])
{
	Bike b = new Bike();
	b.run();
	b.run(10);
}

	}