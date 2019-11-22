package com.datageeks;

public class MethodReferenceToStaticMethod {
	
	public static void main(String[] args) {
		Sample s = Demo::display;
		s.print();
				
	}

}

class Demo
{
	public static void display()
	{
		System.out.println(" Implementation From Demo static method:: display() ");
	}
}
