/*
1
1  2
1  2  3
1  2  3  4
1  2  3  4  5
*/

public class PrintPatternsEx1
	{
public static void main(String args[])
{
		int row = 1;
		while( row <= 5)
			{
			int col = 1;
				while( col <= row)
					{
					System.out.print(col+"  ");
					col++;
					}
			System.out.println();
			row++;
			}
}
	}