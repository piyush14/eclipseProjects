package readwrite;

import java.io.*;

public class ReadWrite {
	  byte[] buffer = new byte[1024];
		FileInputStream instream = null;

	public void Read() throws IOException{
		 File infile =new File("f1");
		 instream = new FileInputStream(infile);
 	    //instream.close();

	}
	
	
	public void write() throws IOException{
		FileOutputStream outstream = null;
		 File outfile =new File("f2.txt");
		 
 	    
 	    outstream = new FileOutputStream(outfile);

 	  

 	    int length;
 	   while ((length = instream.read(buffer)) > 0){
	    	outstream.write(buffer, 0, length);
    	    outstream.close();

	    }

	}
	
 

    	   
}
