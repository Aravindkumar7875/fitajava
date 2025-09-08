package com.ak.collectionarraylistsorting;

public class BookInfo implements Comparable<BookInfo> {

	private Integer id;
	private String name;
	private Double price;
	private String publishername;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPublishername() {
		return publishername;
	}
	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}
	public BookInfo(Integer id, String name, Double price, String publishername) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.publishername = publishername;
	}
	
	//To string method used to convert object into string value
	@Override
	public String toString() {
		return "BookInfo [id=" + id + ", name=" + name + ", price=" + price + ", publishername=" + publishername + "]";
	}
	

	@Override
	public int compareTo(BookInfo o) {

		return this.id - o.id;
	}
	
	//method over
	//compare to method is part of comparable Interface


	
}
