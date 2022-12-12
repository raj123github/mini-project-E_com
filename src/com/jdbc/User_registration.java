package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User_registration {
		
	PreparedStatement prs = null;
	Connection con = null;

	public void insertStudentData(String firstName, String lastName, String address, String mailid,long mobileNumber ) {
		try {
			ConnectionSample connectionTest=new ConnectionSample();
			 con=connectionTest.getConnectionDetails();
		prs=con.prepareStatement("insert into registrationtab(firstName, lastName, address, mailid, mobileNumber)values(?,?,?,?,?)");
		prs.setString(1,firstName);
		prs.setString(2,lastName);
		prs.setString(3,address);
		prs.setString(4,mailid);
		prs.setLong(5, mobileNumber);
		int i=prs.executeUpdate();
		System.out.println("Record is inserted successfully.." + i);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		}
			public static void main(String[] args) throws SQLException {
				User_login log=new User_login ();           
				log.login();
				Scanner sc = new Scanner(System.in);
				for(int i=0; i<3; i++) {
					System.out.print("Enter first name ");
					String firstName=sc.next();
					System.out.print("Enter last name ");
					String lastName=sc.next();
					System.out.print("Enter Address  ");
					String address=sc.next();
					System.out.print("Enter mailid ");
					String mailid=sc.next();
					System.out.print("Enter mobile no ");
					long mobileNumber=sc.nextLong();
					System.out.print("Registration succesfully done...");
					User_registration userInput = new User_registration();
					userInput.insertStudentData(firstName, lastName, address, mailid, mobileNumber);
					}
					sc.close();
					}
				}
			
