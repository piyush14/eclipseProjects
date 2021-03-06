package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCNew {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//copyTable();
		saveImage();
		getImage();
		//addBatch();
		
		

	}
	
	
	public static void copyTable() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		
		  Statement st = con.createStatement();
		  Statement st1 = con.createStatement();
		   // ResultSet rs = st.executeQuery("select * from dept");
		   // String sql = "INSERT INTO users("+ "name,"+ "active,"+ "login,"+ "password)"+ "VALUES(?,?,?,?)";
		    
		    int rows = st.executeUpdate("CREATE TABLE dept_copy2 AS SELECT ID, NAME  FROM DEPT");
		    System.out.println("rows : " + rows );
		    
			
			
			if(rows == 0){
				System.out.println("table capy not created");
			}
			else{
				System.out.println("Table copy created");
			}
		    ResultSet rs = st.executeQuery("select * from dept_copy2");
		    while(rs.next()){
				System.out.println(rs.getInt("ID")+rs.getString("NAME"));
			}

		    con.close();
		  
	}
	
	public static void  getImage() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		File imageFile = new File("photo2.jpg");
        InputStream fileInputStream = null;
        FileOutputStream fileOutputStream = new FileOutputStream(imageFile);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM STOREIMAGE");

        while (rs.next()) {
            fileInputStream = rs.getBinaryStream("Image");
        }

        int i = 0;
        do {
            i = fileInputStream.read();
            fileOutputStream.write(i);
        } while (i != -1);
        System.out.println("Image Downloaded");
	}
	
	public static void saveImage() throws ClassNotFoundException, SQLException, IOException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		PreparedStatement pstmt = 
				con.prepareStatement("INSERT INTO STOREIMAGE VALUES(?, ?)");
		pstmt.setInt(1,  1);
		File file = new File("D:/Chrysanthemum.jpg");
		FileInputStream fis = new FileInputStream(file);
		pstmt.setBinaryStream(2, fis, file.length());
		pstmt.executeUpdate();
		con.close();
	
	
	}
	
	public static void addBatch() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		  Statement st = con.createStatement();
		  st.addBatch("CREATE TABLE dept_copy3 AS SELECT ID, NAME  FROM DEPT");
		  //st.addBatch("select * from dept_copy3");
			int updations[] = st.executeBatch();
			
			ResultSet rs = st.executeQuery("select * from dept_copy3");
		    while(rs.next()){
				System.out.println(rs.getInt("ID")+rs.getString("NAME"));
			}


	}

}
