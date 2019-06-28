class Sample
{
	static
	{
	System.out.println(" Sample static :: class Loaded");
	}

	public Sample()
	{
	System.out.println(" From Sample Constructor :: Object created");
	}

	public void getInfo()
	{
	System.out.println(" From getInfo() of Sample");
	}

}


public class ClassLoadingApp
	{
public static void main(String args[]) throws Exception
{
	if(args.length == 1)
	{
	Class  c = Class.forName(args[0]);
	Sample obj =(Sample)c.newInstance();
	obj.getInfo();
	}else
	{
	System.out.println(" Please Pass Sample class Name");
	}
}
	}








