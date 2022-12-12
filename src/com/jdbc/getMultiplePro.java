package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class getMultiplePro {
	static Connection connection=null;
    static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		getMultiplePro product=new getMultiplePro();
	//Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			System.out.println("How many product you want?");
			int choice=Integer.parseInt(scan.nextLine());
			
		    
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		public void  selectProduct()throws SQLException {
			System.out.println("Enter product name");
			String product=scan.nextLine();
			String sql="select*from furniture="+product;
			Statement statement=Connection.createStatement(); 
			ResultSet result=statement.executeQuery(sql);
               if(result.next())	{
            	             	 }
               else {
            	   System.out.println("no product found....");

               }
		}
		
		
		while(result.next()) {
			String name=result.getString("product_name");
			int quantity=result.getInt("product_qty");
			int price=result.getInt("product_price");
			System.out.println("product name is ="+name);
			System.out.println("product quntity is ="+quantity);
			System.out.println("product price is ="+price);

			}
		
	}

}
}

	
	/*String product_id;
	String product_name;
	String product_description;
	int product_qty;
	int product_price;

public void getProduct() {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the product id>>");
	String productid = scanner.next();

	System.out.println("Enter the product name>>");
	String name = scanner.next();

	System.out.println("Enter the product qty >>");
	int qty = scanner.nextInt();
	
	System.out.println("Enter the product price>>");
	int price = scanner.nextInt();
	
	getProduct(emplyee.firstName, emplyee.lastName, emplyee.city, emplyee.mobileNumber,
	Employee.country);
	}
	
	public void getProductInformation(String id , String name , int qty, int price) {

	System.out.println("Product details");
	System.out.println("product id: " + id);
	System.out.println("product name: " + name);
	System.out.println("product qty: " + qty);
	System.out.println("product price: " + price);
	System.out.println("Country: " + country);
	}
	
		getMultiplePro multipleproducts = new getMultiplePro();
	System.out.println("Enter the number of products>>");
	Scanner input = new Scanner(System.in);
	int count = input.nextInt();
	for (int i = 1; i <= count; i++) {
	System.out.println("Enter the product details>>");
	multipleproducts.getProduct(); 
	}
	}
	}
*/


