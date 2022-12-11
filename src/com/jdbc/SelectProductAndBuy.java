package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectProductAndBuy {
	
		public static void main(String[] args) {
			 
			try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");

			//select query PreparedStatement
			PreparedStatement ps=con.prepareStatement("select * from furniture where product_name=?");
			ps.setString(1, "Chairs");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("product_name="+rs.getString(2));
	         }
			
			Scanner scan=new Scanner(System.in);
			System.out.println("If you want to buy this ??");
			String buy=scan.next();
				
	        String abc = buy;
			
			switch (abc) {
			case "No":
				System.out.println("No thanks");
				break;
			case "Yes":
				System.out.println("Added to cart");
				break;
			}
			con.close();
			ps.close();
			rs.close();

			}

			catch(Exception e) { e.printStackTrace();
			}
			}
			
			}

