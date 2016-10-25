package com.enumdemo;

 enum Status{
	 NEW(1),
	 REJECTED(2),
	 ACCEPTED(3),
	 COMPLETED(4);
	 int value;
	 
	 private Status(int value){
		 this.value = value;
	 }
	 
	
 };

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order [] o = new Order[2];
		
		o[0] = new Order(101, "fruit", "good", 500);
		o[1] = new Order(121, "juice", "good", 230);
		
		for(int  i=0 ;i<o.length;i++){
			System.out.println(o[0].toString());
		}

	}

}
