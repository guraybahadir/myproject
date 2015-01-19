package salesTaxes;

import java.util.Scanner;


public class BasicANDImported {
	
	Importduty gry =new Importduty();
	// Define all objects
	float music_cd;
	  float bottleof_perfume;
	  float headache_pills;
	  float chocolate;
	  float boxofchocolate;
	  
	  float total;
	  float tax;
	  float book_price;
	  float imp_bottleof_perfume;
	  
	  float a[]=new float[10];
	  

	public void BasicANDImported(){
		
		
		Scanner scn = new Scanner(System.in);
		
		 // Firstly users enter values bottle of perfume price ,bottle of perfume(imported) price ,headache pill price and chocolates (imported) price 
		
		System.out.println("		İNPUT3		");
	  	
		System.out.println("imported bottle of perfume at       :");
		imp_bottleof_perfume = scn.nextFloat();
	  	 a[0]=imp_bottleof_perfume;
	  	 
	  
	  	System.out.println(" bottle of perfume at   		    :");
	  	bottleof_perfume = scn.nextFloat();
	  	
	  	System.out.println(" packet of headache pills: 		   :");
		headache_pills=scn.nextFloat();;
		
		System.out.println("  imported box of chocolates at	   :");
	  	boxofchocolate = scn.nextFloat();
		
		a[0]=imp_bottleof_perfume*10/100;	// calculate bottle of perfume on basic sales tax 
		a[1]=a[0]+imp_bottleof_perfume;     // total value bottle of perfume with basic sales tax    	  
		a[2]=a[1]*5/100;    				 // calculate bottle perfume imported tax after basic sales tax 
		a[3]=a[2]+a[1]; 						 // calculate imported bottle of parfume value with all taxes 
		a[4]=a[0]+a[2]; 					 //total texes of imported bottle of parfume (basic sales tax + imported tax)
		a[5]=bottleof_perfume*10/100;   	// in this code calculate onlly bottle of perfume on basic sales tax (not imported bottle of perfume )
		a[6]=boxofchocolate*5/100;   	 //  we must use imported taxes  on box of chocolate because chocolate include food class
		tax=a[4]+a[5]+a[6];				// calculate total taxes (imported perfume with basic sales tax and imported sales taxes )+(bottle of perfume with basic sales taxes)+(chocolate  with imported sales tax)
		
		
		this.imp_bottleof_perfume=a[3]; 							// imported bottle of perfume is equl to a[3] array , I calculated on a[3] array
		boxofchocolate=a[6]+boxofchocolate;  						 //calculate box of chocolate with imported taxes , remeber ı calculated chocolates only imported taxes
		bottleof_perfume=a[5]+bottleof_perfume;							// calculate bottle of perfume with basic sales tax
		
	
		total=a[3]+bottleof_perfume+headache_pills+boxofchocolate+tax; 		// total value objects with their taxes 
		System.out.println("		OUTPUT3		");
		System.out.println("imported bottle of perfume       "+imp_bottleof_perfume);
		System.out.println("bottle of perfume                "+bottleof_perfume);
		System.out.println("packet of headache pills         "+headache_pills);
		System.out.println("box of chocolate                 "+boxofchocolate);
		System.out.println("taxes                            "+tax);
		System.out.println("total                            "+total);
		
	}

	}

	
	
	

		
		
		
		
		
	

