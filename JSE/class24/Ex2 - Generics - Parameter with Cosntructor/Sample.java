package com.google.ex;

public class Sample<T>
	{
private T data;

public Sample(T data)
	{
this.data = data;
	}


public T getData()
{
return data;
}
	}