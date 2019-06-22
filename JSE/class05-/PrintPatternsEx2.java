/*
	2
	2	4
	2	4	6
	2	4	6	8
	2	4	6	8	10
		
*/

public class PrintPatternsEx2
	{
public static void main(String args[])
	{
	int n = 5;
	int row = 1;
		while( row <= n)
			{
			   int col = 1;
				while( col <= row)
				{
				System.out.print(2*col+" ");
				col++;
				}
				System.out.println();
				row++;
			}
	}
	}







