package com.datageeks;

public class MethodReferenceToSNontaticMethod {
	
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		Sample s = obj::display;
		s.print();
				
	}

}

class Demo2
{
	public  void display()
	{
		System.out.println(" Implementation From Demo  Non Static:: display() ");
	}
}
