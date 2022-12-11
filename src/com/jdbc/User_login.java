package com.jdbc;

import java.util.Scanner;

public class User_login {
	public void login() {                                          //method
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user name=");
		String username=scan.next();
		System.out.println("Enter last name=");
		String usersurname=scan.next();
		/*System.out.println("If you are not registerd");
		//String ActualPassword= "pass@123";
		String register=scan.next();*/
		if("Ram".contains(username) && "mehra".contains(usersurname)) {
			System.out.println("User is register already.....");
			System.exit(0);                                         //terminate the jvm if if else block is fulfilled
		}else {
			System.out.println("User not yet register....");
		
		}
		
		System.out.println("First register yourself...");
	
	}


}

