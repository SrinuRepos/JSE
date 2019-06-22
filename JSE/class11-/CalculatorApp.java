class Calculator
	{
public void add()
{
	System.out.println("\n\n From method public void add() ");
	int a = 10;
	int b = 10;
	int c = a + b;
	System.out.println(" Sum is ::"+c);
}

public void mul(int a , int b)
{
System.out.println("\n\n From method public void mul(int a , int b) ");
	int c = a * b;
	System.out.println(" Mulitplication is ::"+c);
}

public int sub()
{
	System.out.println("\n\n From method public int sub() ");
	int a = 12;
	int b = 10;
	int c = a - b;
	return c;
}

public int div(int a , int b)
{
	System.out.println("\n\n From method public int div(int a , int b) ");
	int c = a / b;
	return c;
}
	}


public class CalculatorApp
	{
public static void main(String args[])
{
	Calculator c = new Calculator();
	c.add();
	c.mul(10,2);
	int p = c.sub();
	System.out.println("Print From Main (...)  sub = "+p);
	int q = c.div(4,2);
	System.out.println("Print From Main (...)  div = "+q);
}
	}











