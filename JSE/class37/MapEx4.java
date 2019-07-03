package com.google.ex;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;

class Product  implements Comparable<Product>
	{
private Integer productId ;
private String model;
private Float productPrice;

public Product()
{
}

public Product(Integer productId , String model,Float productPrice)
	{
this.productId = productId;
this.model  = model;
this.productPrice = productPrice;
	}

//write setters

public Integer getProductId()
{
	return productId;
}

public String getModel()
{
	return model;
}

public Float getProductPrice()
	{
	return productPrice;
	}

@Override
public int compareTo(Product p)
{
	return this.model . compareTo(p.getModel());

}

@Override
public String toString()
{
	return productId + " : "+model+ " : "+productPrice;
}
	}

public class MapEx4
	{
public static void main(String args[])
{

	Product p1 = new Product(12,"G570",1500f);
	Product p2 = new Product(2,"EliteBook",2500f);
	Product p3 = new Product(13,"AppMacBook",50000f);
	

	Map<Product,String> map = new TreeMap<Product,String>();
	map.put(p1,"Lenovo");
	map.put(p2,"HP");
	map.put(p3,"Apple");
	

	Set<Product> set = map.keySet();
	for(Product k : set)
	{
	String v = map.get(k);
		System.out.println(k + " : "+v);
	}

	
}

	}








