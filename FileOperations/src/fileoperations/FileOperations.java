package fileoperations;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import account.AccountDetails;
import filedetails.FileDetails;
import randonaccess.Bank;
import readwrite.ReadWrite;
import sequence.SequenceDemo;
import serialize.AccDetails;
import serialize.Serialize;

public class FileOperations {
	public static int  NO_Of_RECORDS =0;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*ReadWrite rw = new ReadWrite();
		rw.Read();
		rw.write();
		*/
		
		/*
		File currentDir = new File("."); 
		FileDetails fd = new FileDetails();
		fd.showDetails(currentDir);
		*/
		/*
		AccountDetails ad = new AccountDetails();
		ad.addDetails();
		ad.showDetails();
		*/
		/*
		SequenceDemo sd = new SequenceDemo();
		sd.showContents();
		*/
		/*
		Serialize s = new Serialize();
		s.addObject();
		s.getObject();
		*/
		File file = new File("bank.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.seek(0);
		
		Bank b = new Bank();
		Bank.add(100,"piyush",1500.65);
		Bank.add(101,"piyush",1500.65);
		Bank.add(102,"piyush",1500.65);
		
		Bank.read();
		Bank.search(112);
		Bank.update(100,6666);
	}

}
