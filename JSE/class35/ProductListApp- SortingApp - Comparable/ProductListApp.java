package com.google.ex;
import com.google.bean.Product;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ProductListApp
	{
public static void main(String args[])
{
	Product p1 = new Product(12,"Lenovo",1500f);
	Product p2 = new Product(2,"HP",2500f);
	Product p3 = new Product(13,"Apple",50000f);
	List<Product> list = new ArrayList<Product>();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	System.out.println(" \n\nBefore Sort ");
	for(Product  p:list)
	{
	System.out.println(p); //JVM calls p.toString()
	}

	System.out.println(" \n\nAfter Sort ");

	Collections.sort(list);
	
	for(Product  p:list)
	{
	System.out.println(p); //JVM calls p.toString()
	}
}
	}



