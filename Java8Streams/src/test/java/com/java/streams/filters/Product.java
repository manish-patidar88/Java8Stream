package com.java.streams.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>(); 
		list.add(new Product(1,"dell",50000));
		list.add(new Product(2,"lenavo",45000));
		list.add(new Product(3,"apple",100000));
		list.add(new Product(4,"acer",35000));
		list.add(new Product(5,"hp",65000));
		
		list.stream().filter(x->x.price>50000).forEach(x->System.out.print(x.name + " "));		
		List<Product> prodList = list.stream().filter(x->x.price>50000).collect(Collectors.toList());
		System.out.println("\n" + prodList);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductFilter [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
