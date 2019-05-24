/*
2
2  4
2  4  6
2  4  6  8
2  4  6  8  10
2  4  6  8  10  12
2  4  6  8  10  12  14
2  4  6  8  10  12  14  16

*/
public class PrintPatternsEx3
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
			if(i % 2 == 0)
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