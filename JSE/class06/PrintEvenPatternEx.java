/*
	2
	2	4
	2	4	6
	2	4	6	8
	2	4	6	8 	10
*/

public class PrintEvenPatternEx
	{
public static void main(String args[])
{
	int row = 1;
	int n = 5;
		while( row <= n)
			{
		int col = 1;
		int i = 1;

			while( col <= row)
				{

				  if(i%2 == 0)
						{
					System.out.print(i+"   ");
					col++;
						}
					i++;
				
				}
			System.out.println();
			row++;
			}
	
}
	}







