package com.google.bean;

public class Product  implements Comparable<Product>
	{
private Integer productId ;
private String productName;
private Float productPrice;

public Product()
{
}

public Product(Integer productId , String productName,Float productPrice)
	{
this.productId = productId;
this.productName  = productName;
this.productPrice = productPrice;
	}

//write setters

public Integer getProductId()
{
	return productId;
}

public String getProductName()
{
	return productName;
}

public Float getProductPrice()
	{
	return productPrice;
	}

@Override
public int compareTo(Product p)
{
	return this.productId . compareTo(p.getProductId());
	

/*
The above logic same as below code
if(this.productId == p.getProductId())
		{
	return 0;
		}
	else if(this.productId < p.getProductId())
		{
	return -1;
		}
	else
	{
	return 1;
	}
	*/
}

@Override
public String toString()
{
	return productId + " : "+productName+ " : "+productPrice;
}
	}








