package com.google.ex;

import java.util.Map;
import java.util.HashMap;
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
public int hashCode()
	{
return this.productId;
	}
@Override
public boolean equals(Object obj)
{
	if( this == obj)
		return true;
	Product p = (Product) obj;

	return this.productId.equals(p.getProductId());
}

@Override
public String toString()
{
	return productId + " : "+model+ " : "+productPrice;
}
	}

public class MapEx5
	{
public static void main(String args[])
{

	Product p1 = new Product(12,"G570",1500f);
	Product p2 = new Product(2,"EliteBook",2500f);
	Product p3 = new Product(13,"AppMacBook",50000f);
	Product p4 = new Product(12,"G570",1500f);
	

	Map<Product,String> map = new HashMap<Product,String>();
	map.put(p1,"Lenovo");
	map.put(p2,"HP");
	map.put(p3,"Apple");
	map.put(p4,"Lenovo CMP");	


	Set<Product> set = map.keySet();
	for(Product k : set)
	{
	String v = map.get(k);
		System.out.println(k + " : "+v);
	}

	
	Product p5 = new Product(12,"G570",1500f);
	System.out.println(" contains key p5 = > "+map.containsKey(p5));
}

	}








