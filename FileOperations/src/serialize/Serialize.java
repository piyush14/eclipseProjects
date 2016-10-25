package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize implements Serializable {
	public void addObject() throws IOException{
		File file = new File("abcd.txt");
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(new AccDetails(1, "TOM", new Date(10,10,2010)));
		out.flush();
		out.close();
	}
	
	public void getObject() throws ClassNotFoundException, IOException{
		File file = new File("abcd.txt");
		FileInputStream fin = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fin);
		AccDetails acc = (AccDetails)in.readObject();
		System.out.println("Account Details = " + acc);
	}
	
	public String toString(){
		return "this.Id";
	}
}
