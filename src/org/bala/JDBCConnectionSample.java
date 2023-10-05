package org.bala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnectionSample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","DeepakB@la3");
		
		String query="select * from Employees";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next()) {
			String string = executeQuery.getString("salary");
			System.out.println(string);
		}
		
	}
	
	

}
