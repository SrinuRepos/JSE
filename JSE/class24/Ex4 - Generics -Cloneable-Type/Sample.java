package com.google.ex;

public class Sample<T extends Cloneable>
	{
private T data;

public void setData(T data)
{
	this.data = data;
}

public T getData()
{
return data;
}
	}