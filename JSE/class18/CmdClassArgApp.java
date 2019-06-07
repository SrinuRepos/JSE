class Sample
	{
static
{
System.out.println(" From static block :: Sample class is loaded");
}

public Sample()
{
System.out.println(" From constructor block :: Sample object is created");
}

public void getInfo()
{
	System.out.println(" From Sample :: getInfo()");
}
	}


public class CmdClassArgApp
	{
public static void main(String args[]) throws Exception
{
	if(args.length == 1)
	{
		Class c = Class.forName(args[0]);
		Sample s = (Sample) c.newInstance();
		s.getInfo();
	}else
	{
	System.out.println(" Please pass class name as command line argument");
	}
}
	}












