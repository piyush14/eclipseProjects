package dateofbirth;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		
		HashMap<Date, String> emp = new HashMap<>();
		emp.put(new Date(1,1,2000), "ABC");
		emp.put(new Date(2,4,2010), "ABC");
		emp.put(new Date(1,1,2015), "PPP");

		emp.put(new Date(10,11,2011), "PQR");

		System.out.println(emp.get(new Date(1,1,2000)));
	}
	
}

class Date{
	public int date;
	public int month;
	public int year;
	
	public Date(int date,int month,int year){
		this.date = date;
		this.month = month;
		this.year = year;
	}
	@Override
	public int hashCode(){
		return date+month;
		
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.date == ((Date) obj).date && this.month == ((Date) obj).month) {
			return true;
		}
		return false;
	}
	

	
}
