public class IncrementAndDecrementOperatorsEx
	{
public static void main(String args[])
{
	int count = 10;
	System.out.println(" \n\n PostIncrement ++");
	int a = count++; // a = 10
	System.out.println(" a = "+a);
	System.out.println(" count = "+count); //count = 11

	int p = 10;

	System.out.println(" \n\n PreIncrement ++");
	int b = ++p; // b = 11
	System.out.println(" b = "+b);
	System.out.println(" p = "+p); //p = 11

	System.out.println(" \n\n PostDecrement --");
	int q = 10;
	int c = q--; // c = 10
	System.out.println(" c = "+c);
	System.out.println(" q = "+q); //q = 9

	int r = 10;

	System.out.println(" \n\n PreDecrement --");
	int d = --r; // d = 9
	System.out.println(" d = "+d);
	System.out.println(" r = "+r); //r = 9
	
}
	}