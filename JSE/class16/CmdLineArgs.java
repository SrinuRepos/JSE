public class CmdLineArgs 
	{
public static void main(String[] args)
{
	
	if(args.length == 0)
	{
	System.out.println("\n\n Please provide command line arguments");
	}else
	{
	System.out.println("\n\n Command line arguments are");
		int i = 0;
		while( i < args.length)
		{
		System.out.println(args[i]);
		i++;
		}
	}

}
	}