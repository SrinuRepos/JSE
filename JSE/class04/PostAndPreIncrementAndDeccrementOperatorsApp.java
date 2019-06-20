public class PostAndPreIncrementAndDeccrementOperatorsApp
	{
public static void main(String args[])
{
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
	
		
	System.out.println(" Post Increment a++ value "+ a++); //out put 10
	System.out.println(" As it it Post Increment value will be updated a = "+a);// value updated to 11


	System.out.println(" Pre Increment ++b value "+ ++b ); //out put 21
	System.out.println("As it it Pre Increment value won't be updated  b = "+b);// value updated to 21


	System.out.println(" Post Decrement c-- value "+ c--); //out put 30
	System.out.println(" As it it Post Decrement value will be updated  c = "+c);// value updated to 29


	System.out.println(" Pre Decrement --d value "+ --d ); //out put 39
	System.out.println(" As it it Pre Decrement value won't be updated d = "+d);// value updated to 39

}
	}








