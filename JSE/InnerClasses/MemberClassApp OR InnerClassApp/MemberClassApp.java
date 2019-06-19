package com.google.app;
import com.google.ex.Outer;
import com.google.ex.Outer.Inner;

public class  MemberClassApp
	{
public static void main(String args[])
{

	Outer obj = new Outer();
	obj .display();

	Outer.Inner in = obj.new Inner();
	in.getInfo();


}
	}