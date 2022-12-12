package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class c {

			
			PreparedStatement prs = null;
			Connection con = null;

			public void insertProductDetails(int product_qty, String product_name, int product_price, int product_price_total ) {
				try {
					ConnectionSample connectionTest=new ConnectionSample();
					 con=connectionTest.getConnectionDetails();
					 prs=con.prepareStatement("insert into buyProductDetails(product_qty, product_name, product_price, product_price_total)values(?,?,?,?)");
						prs.setInt(1,product_qty);
						prs.setString(2,product_name);
						prs.setInt(3,product_price);
						int i=prs.executeUpdate();
						System.out.println("Record is inserted successfully.." + i);
						
					}catch(Exception e) {
						e.printStackTrace();
					}
			}
			public void getData() {
				Scanner scanner = new Scanner(System.in);
				for(int i=0; i<=3; i++) {

				System.out.println("Enter the product id>>");
				String productid = scanner.next();

				System.out.println("Enter the product name>>");
				String name = scanner.next();

				System.out.println("Enter the product qty >>");
				int qty = scanner.nextInt();
				
				System.out.println("Enter the product price>>");
				int price = scanner.nextInt();
				
				}
				
			}
				public static void main(String[] args) throws SQLException { 
					
					/*User_Login log=new User_Login ();           
					log.login();*/
					Scanner sc = new Scanner(System.in);
					System.out.print("How many products you have buy ");
					int product_qty=sc.nextInt();
					//for(int i=0; i<3; i++) {
						
						/*System.out.print(" which are those");
						String product_name=sc.next();
						System.out.print("Enter product price");
						int product_price=sc.nextInt();
						System.out.print("Enter product total ");
						int product_price_total=sc.nextInt();
						System.out.print("Registration succesfully done...");*/
						
						c userInput = new c();
					userInput.insertProductDetails(product_qty, product_name, product_price, product_price_total);
					
					sc.close();
					}
}
	

