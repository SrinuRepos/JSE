public class ImplicitAndExplicitConversionEx
	{
public static void main(String args[])
{
	byte b = 125;
	int a = b; // Implicit Conversion

	int c = 25;
	byte d = (byte) c; // Explicit Conversion

	System.out.println( "int a = "+a);
	System.out.println( "byte d = "+d);
		
}
	}