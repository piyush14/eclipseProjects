package account;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AccountDetails {
	public int acc_id;
	public String  name;
	public double balance;
	
	public void addDetails() throws IOException{
		File file = new File("abc.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(23);
		dos.writeUTF("Tom");
		dos.writeDouble(12000.85);
		
		dos.writeInt(29);
		dos.writeUTF("Jerry");
		dos.writeDouble(8960.5);
		
		dos.writeInt(43);
		dos.writeUTF("Cat");
		dos.writeDouble(4587.85);
		
		dos.close();
		fos.close();
	}
	public void showDetails() throws IOException{
		File file = new File("abc.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		
		int id = dis.readInt();
		String name = dis.readUTF();
		double salary = dis.readDouble();
		System.out.println("ID : "+ id+"Name :"+name +" "+"BAL :"+ salary);
		
		 id = dis.readInt();
		 name = dis.readUTF();
		 salary = dis.readDouble();
		System.out.println("ID : "+ id+"Name :"+name +" "+"BAL :"+ salary);
		
		 id = dis.readInt();
		 name = dis.readUTF();
		 salary = dis.readDouble();
		System.out.println("ID : "+ id+"Name :"+name +" "+"BAL :"+ salary);
		dis.close();
		fis.close();
	}
}
