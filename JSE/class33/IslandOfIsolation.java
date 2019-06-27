package com.google.ex;

class Test
{
	private Test obj ;
	
		
	public Test()
	{
		System.out.println(" From Test :: Construtor");
	}

	public  void setObj(Test obj)
		{
	this.obj = obj;
		}


	public void finalize()
	{
	System.out.println(" From Test :: finalize()");
	}
}


public class IslandOfIsolation
	{
public static void main(String args[])
{
	Test t1 = new Test();
	Test t2 = new Test();

	t1.setObj(t2);
	t2.setObj(t1);

	t1 = null;
	t2 = null;
	System.gc();
}
	}








	