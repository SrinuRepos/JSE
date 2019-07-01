package com.google.ex;
import com.google.bean.Product;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	
	Comparator<Product> idComp = new Comparator<Product>()
				{
			public int compare(Product p1 , Product p2)
			{
		return p1.getProductId() . compareTo(p2.getProductId());
			}
				};

	Comparator<Product> nameComp = new Comparator<Product>()
				{
			public int compare(Product p1 , Product p2)
			{
		return p1.getProductName() . compareTo(p2.getProductName());
			}
				};

System.out.println("\n\n Before Sorting ");
	for(Product p : list)
		{
	System.out.println(p);
		}

	System.out.println("\n\n Sorting by Id ");
	Collections.sort(list,idComp);

		for(Product p : list)
		{
	System.out.println(p);
		}

	System.out.println("\n\n Sorting by Name ");
	Collections.sort(list,nameComp);

		for(Product p : list)
		{
	System.out.println(p);
		}
}

		
	}



