package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		
		PreparedStatement pstmt = con.prepareStatement("update DEPT set NAME = ? where ID = ? ");
		pstmt.setString(1,"RnD");
		pstmt.setInt(2,3);
		int result = pstmt.executeUpdate();

		
		
		PreparedStatement pstmt_select = con.prepareStatement("select * from dept");

		ResultSet rs = pstmt_select.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getInt("ID")+rs.getString("NAME"));
		}
//		
//		int updates = stmt.executeUpdate("update DEPT set NAME =' REASERCH AND DEVELOPMENT ' where ID = 3");
//		System.out.println("updated..!!!!");
		
		//rs.close();
		pstmt_select.close();
		con.close();
		
		
		
		
		
		
		
		
	}

}
