package com.google.ex;
import com.google.bean.Product;
import java.util.List;
import java.util.ArrayList;

public class ProductListApp
	{
public static void main(String args[])
{
	Product p1 = new Product(1,"Lenovo",1500f);
	Product p2 = new Product(2,"HP",2500f);
	Product p3 = new Product(3,"Apple",50000f);
	List<Product> list = new ArrayList<Product>();
	list.add(p1);
	list.add(p2);
	list.add(p3);

	for(Product  p:list)
	{
	System.out.println(p.getProductId()+ " : "+p.getProductName()+" : "+p.getProductPrice());
	}

	Product p4 = new Product(1,"Lenovo",1500f);

	boolean flag = list.contains(p4);
	System.out.println(" p4 contains => "+ flag);
	System.out.println(" p1 hashcode => "+p1.hashCode());
	System.out.println(" p4 hashcode => "+p4.hashCode());

}
	}



