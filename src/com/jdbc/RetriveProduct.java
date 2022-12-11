package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetriveProduct {

		public static void main(String[] args) {
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Root");

				//select query PreparedStatement
				PreparedStatement ps=con.prepareStatement("select * from furniture");
				ResultSet rs=ps.executeQuery();
				Scanner scan=new Scanner(System.in);
				System.out.println("How many product you want");
				String furniture=scan.next();
				System.out.println("Enter the product name");
				for(int i=0;i<=10;i++) {
					
					String product=scan.next();
					
				}
				while(rs.next()) {
					//System.out.println("product_id="+rs.getString(1));

					System.out.println("product_name="+rs.getString(2));

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


