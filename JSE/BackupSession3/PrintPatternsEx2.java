/*

1
1  3
1  3  5
1  3  5  7
1  3  5  7  9
1  3  5  7  9  11
1  3  5  7  9  11  13
1  3  5  7  9  11  13  15

*/

public class PrintPatternsEx2
	{
public static void main(String args[])
{
	int row = 1;
while( row <= 8)
	{
	 int col = 1;
	 int i = 1;
	while( col <= row)
		{
			if(i % 2 == 1)
				{
				System.out.print(i+"  ");
				col++;
				}
				i++;	
		}
	System.out.println();
	row++;
		}
}
	}