package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSample {
	
	
	Connection connection=null;
	public Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		return connection;
		
	}

}

