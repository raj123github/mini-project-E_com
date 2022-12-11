package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserGetTableInAcendingOrder {	
		public static void main(String[] args) {
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");

				//select query PreparedStatement
				PreparedStatement ps=con.prepareStatement("select * from furniture order by product_price");
				ResultSet rs=ps.executeQuery();
				
				//System.out.println("User get product list in ascending order based on product price");
				 
				while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));

				//System.out.println("product_name="+rs.getString(2));

				//System.out.println("product_price="+rs.getInt(3));
				}
				con.close();
				ps.close();
				rs.close();

				}

				catch(Exception e) { e.printStackTrace();
				}

		}
		

	}


