package com.enumdemo;

public class Order {
	public int order_id;
	public String name;
	public String quality;
	public int price;
	
	
	public Order(int order_id,String name,String quality,int price){
		this.order_id = order_id;
		this.name = name;
		this.quality = quality;
		this.price = price;
		
	}
	
	 public String toString(){
		 return order_id + name + quality + price ;
	 }
	
}
