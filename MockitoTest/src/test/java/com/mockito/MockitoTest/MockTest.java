package com.mockito.MockitoTest;

import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)

public class MockTest {

//	private Employee e;
//	private static DatabaseOpr db;
//	private Statement stmt;
//	private ResultSet rs;
//	private static Connection con;

	@Before
	public void setup() throws Exception {
		Connection mockConnection = PowerMockito.mock(Connection.class);
        Statement mockStatement = PowerMockito.mock(Statement.class);
        ResultSet mockResultSet = PowerMockito.mock(ResultSet.class);

        PowerMockito.mockStatic(DriverManager.class);
        when(DriverManager.getConnection(anyString(), anyString(), anyString()))
                .thenReturn(mockConnection);
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeQuery(anyString())).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(Boolean.TRUE, Boolean.FALSE);
	}

	@Test
	public void testEmp() throws Exception {
		 DatabaseOpr databaseOpr = new DatabaseOpr();
	        try {
	            List<Employee> empList = databaseOpr.getAllEmployees();
	            System.out.println("----------"+empList.size());
	            Assert.assertEquals(0, empList.size());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
}
