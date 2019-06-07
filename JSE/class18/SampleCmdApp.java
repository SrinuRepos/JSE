public class SampleCmdApp
	{
public static void main(String args[])
{
	if( args.length == 3)
	{
	int a = Integer.parseInt(args[0]);
	String b = args[1];
	float c = Float.parseFloat(args[2]);
	System.out.println(" int a = "+a);
	System.out.println(" String b = "+b);
	System.out.println(" Float c = "+c);
	}else
	{
	System.out.println(" Please Pass int,string,float values as arguments");
	}
}
	}