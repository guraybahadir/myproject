package salesTaxes;

import java.util.Scanner;

public class Importduty {
	
	

	  float music_cd;
	  float bottleof_perfume;
	  float headache_pills;
	  float chocolate;
	  float boxofchocolate;
	  float total;
	  float tax;
	  float book_price;
	  
	  float a[]=new float[5];
	  
	
	
	
	public void Importdutytaxes(){
		
		 Scanner scn = new Scanner(System.in);
	
		 // The user will enter imported box of chocolates price and imported bottle of perfume price 
		 
		System.out.println("		İNPUT2		");
	  	System.out.println("imported box of chocolates at   :");
	  	
	  	boxofchocolate = scn.nextFloat();
	  	
	  	
	  	System.out.println("imported bottle of perfume at  :");
	  	 bottleof_perfume = scn.nextFloat();
	  	 a[0]=bottleof_perfume;
		 
		
		
	  	System.out.println("\n ");
		
		
		
		a[0]=bottleof_perfume*10/100;			//in this code calculate bottle of perfume first tax so basic sales tax  
		a[1]=a[0]+bottleof_perfume;         	//in this code  total bottle of perfume with tax
		a[2]=a[1]*5/100;  						//in this code calculate bottle of perfume second tax so iported tax 
		a[3]=a[2]+a[1];							// total imported bottle of perfume with basic sales tax and imported tax
		
		
		this.tax=a[2]+a[0];     				// call total taxes
		this.boxofchocolate=boxofchocolate*5/100+boxofchocolate;
		this.bottleof_perfume=a[3];									//call total imported bottle of perfume price and equal bottleof_perfume value
		this.total=bottleof_perfume+boxofchocolate;     		//  calculate total objects values except total taxes
		
		
			
			System.out.println("OUTPUT2"+"\n");
		System.out.println("imported box of chocolates  :"+boxofchocolate+"\n"+"imported bottle of perfume  :"+bottleof_perfume+"\n"+"tax		            :"+tax+"\n"+"total	    :"+"\t"+total);
			
		System.out.println("\n ");
		System.out.println("\n ");
		
		
		}
	
	
	
	
	
	
	
	

}
