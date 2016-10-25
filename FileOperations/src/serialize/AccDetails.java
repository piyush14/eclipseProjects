package serialize;

import java.io.Serializable;

public class AccDetails implements Serializable {
	public int Id;
	public String name;
	Date date;
	
	public AccDetails(int Id,String name,Date date) {
		this.Id = Id;
		this.name = name;
		this.date = date;
	}
}
