package com.itheima.entity;

public class Book {
	private String id;//图书编号
	private String name;//书名
	private double price;//图书价格
	private String author;//图书作者
	

	
	public Book(String id, String name, double price, String author) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", id=" + id + ", name=" + name
				+ ", price=" + price + "]";
	}
	
	

}
