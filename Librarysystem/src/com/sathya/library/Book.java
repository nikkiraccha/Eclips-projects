package com.sathya.library;

public class Book {
	int id;
	String name, author;
	double price;
	public Book (int id,String name,String author,double price)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public String toString()
	{
		return "id ="+id+"\n name="+name+"\n author="+author+"\n price="+price;
	}

}
