/*
	2
	2	3
	2	3	5
	2	3	5	7
	2	3	5	7	11
*/

public class PrintPrimePatternEx
	{
public static void main(String args[])
{
	int row = 1;
	int n = 15;
while( row <= n)
	{
int col = 1;
int p = 2;		
  while( col <= row)
	       {
	int i = 1;
	int count = 0;
	while( i <= p)
	       {
	if( p % i == 0)
	{
	count++;
	}
	i++;
	        }
	if(count == 2)
	{
	System.out.print(p+ "    ");
	col++;
	}
	p++;			  
					
	     }
	System.out.println();
	row++;
	}
	
}
	}







