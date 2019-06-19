package com.google.app;
import com.google.ex.Outer;
import com.google.ex.Outer.Inner;
import com.google.ex.Sample;
import com.google.ex.Demo;

public class  NesteadInterfaceApp
	{
public static void main(String args[])
{

Outer s = new Sample();
s.display();

Outer.Inner d = new Demo();
	d.getInfo();


}
	}