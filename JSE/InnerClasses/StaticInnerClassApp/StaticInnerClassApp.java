package com.google.app;
import com.google.ex.Outer;
import com.google.ex.Outer.Inner;

public class  StaticInnerClassApp
	{
public static void main(String args[])
{

	Outer.Inner in = new Outer.Inner();
	in.getInfo();

Outer.Inner.print(); // here print() is the static method so directly called


}
	}