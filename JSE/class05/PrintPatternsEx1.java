/*
	1
	1	2
	1	2	3
	1	2	3	4
	1	2	3	4	5
		
*/

public class PrintPatternsEx1
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
				System.out.print(col+" ");
				col++;
				}
				System.out.println();
				row++;
			}
	}
	}







