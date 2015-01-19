package salesTaxes;

import java.util.Scanner;


public class BasicSalesTax {
	
	
	
// Define all   objects

	  float music_cd;
	  float bottleof_perfume;
	  float headache_pills;
	  float chocolate;
	  float boxofchocolate;
	  float total;
	  float tax;
	  float book_price;
	  
	  float a[]=new float[5];
	  
	
	  
	 
		  
		
		  // in this claas , ı will calculate Basic sales taxes 
		 
	  public void BasicSalesTaxes(){
		  
		  // initial objects
		  float music_cd=0.0f;
		  float chocolate=0.0f;
		  float total=0.0f;
		  float tax=0.0f;
		  float book_price=0.0f;
		  
		//the users enter objects values(book price ,music dc price and chocolate price  ) 
		  
		  Scanner s = new Scanner(System.in);
		  System.out.println("		İNPUT1		");
		  	System.out.println("book         at  :");    
			 book_price = s.nextFloat();
			 
			 System.out.println("music cd:    at :");
			 music_cd = s.nextFloat();
			
			 System.out.println("chocolate:    at :");
			 chocolate = s.nextFloat();
			 
		
			 
			 
		
			 tax=music_cd*10/100;   // calculate tax for music cd and we onlly take tax on music cd 
		music_cd=music_cd*10/100+music_cd; // calculate music cd with tax
		total=book_price+music_cd+chocolate; // calculate total 
		
		
		System.out.println("		OUTPUT1		");
		System.out.println("book price  :"+book_price);
		System.out.println("music cd    :"+music_cd);
		
		System.out.println("chocolate   :"+chocolate);
		System.out.println("Sales Taxes :"+tax);
		System.out.println("total       :"+total);

		
		System.out.println("\n");
		
	
		}
}