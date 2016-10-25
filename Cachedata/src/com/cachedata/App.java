package com.cachedata;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class App {
	private int ID;
	private String value;
	Date dateobj = new Date();
	//////////////////////
	private class Cache{
		
		private int ID;
		private String value;

		HashMap<Integer,Object> hm=new HashMap<Integer,Object>();
		
		public Cache(int ID, String value){
			this.ID = ID;
			this.value = value;
		}
		public void f(){
			
			hm.put(ID, new Wrapper(value));
			System.out.println(hm.toString());
		}
		
		public String toString(){
			return this.value;
			
		}
		
	}
	////////////////////////////
	
	public App(int ID,String value ) {
		this.ID = ID;	
		this.value = value;
	}
	public App() {
		
	}

	public void addData(int ID,String value){
		Cache c = new Cache(ID,value);
		c.f();
		
	}
	
	public void getData(){
		Cache c1;
	}
}



class Wrapper{
	String value;
	Date dateobj;
	Wrapper(String value){
		this.value = value;
		//this.dateobj = dateobj;
	}
	public String returnVal(){
	return this.value;
	}
	
}
