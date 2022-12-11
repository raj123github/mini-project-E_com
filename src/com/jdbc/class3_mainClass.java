package com.jdbc;

public class class3_mainClass extends PriceDetails {
		String productId="C01";
		String userName="Current";
		
		public void getAccountDetails() {
			
		}
		
	   public void getAccountInformation() {
			
		}
	   
	   public static void main(String[] args) {
		   PriceDetails pd=new PriceDetails();
		     pd.getProductDetails();
		     pd.getProductInformation();
		     System.out.println(pd.productName);
		     System.out.println(pd.actualPrice*qty);
	}

	}



