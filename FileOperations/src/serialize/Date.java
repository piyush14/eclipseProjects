package serialize;

import java.io.Serializable;

public class Date implements Serializable{
	public int day;
	public int month;
	public int year;
	
	public Date(int day,int month,int year){
		this.day = day;
				this.month = month;
				this.year = year;
		
	}
}
