package com.google.app;
import com.google.ex.Sample;

public class UnCheckedExpEx
	{
public static void main(String args[]) 
{
	Sample s = new Sample();
	s.div(10,5);
}
	}

/*
  As the div(int,int) of Sample class declared a Unchecked Exception so that main(...) method need not to handle it.
*/