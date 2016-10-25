package randonaccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import fileoperations.FileOperations;

public class Bank {
	//RandomAccessFile file;
	
	
	
	public static void add(int accNo,String name,double bal) throws IOException{
		File file = new File("bank.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		
		raf.seek(raf.length());
		System.out.println("ID : "+ accNo + " NAME : "+ name + " SALARY : "+bal);

//		System.out.println("Enter Acc no : ");
//		System.out.println("Enter Name : ");
//		System.out.println("Enter Bal : ");
//		
		
		raf.writeInt(accNo);
		raf.writeUTF(name);
		raf.writeDouble(bal);
		

		
		
		
		raf.close();
	}
	
	public static void read() throws IOException{
		
		File file = new File("bank.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.seek(0);
		while(raf.getFilePointer()<raf.length()){
			int id = raf.readInt();
			String name = raf.readUTF();
			double salary = raf.readDouble();
		
			System.out.println("ID : "+ id + " NAME : "+ name + " SALARY : "+salary);
		
		
		}
		raf.close();
	}
	
	public static void search(int accno) throws IOException{

		File file = new File("bank.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		while(raf.getFilePointer()<raf.length()){
			if(accno == raf.readInt()){
				System.out.println("FOUND");
			}
		}
		raf.close();
	}
	public static void update(int accno,double bal) throws IOException{
		File file = new File("bank.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		while(raf.getFilePointer()<raf.length()){
			long ptr = raf.getFilePointer();
			if(accno == ptr){
				//raf.writeDouble(bal);
				raf.writeDouble(bal);
			}
		}
		raf.close();

		System.out.println("UPDATED");
		Bank.read();
	}
}
	
	