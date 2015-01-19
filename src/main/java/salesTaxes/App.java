package salesTaxes;

import salesTaxes.BasicANDImported;
import salesTaxes.BasicSalesTax;
import salesTaxes.Importduty;


public class App 
{
    public static void main( String[] args )
    {


		
		//in this code I called BasicSalesTax class 
		BasicSalesTax bst=new BasicSalesTax();
		bst.BasicSalesTaxes();
		
		//in this code I called Importdut class 
		Importduty Imp =new Importduty();
		Imp.Importdutytaxes();
		
		//in this code I called BasicANDImported class 
		BasicANDImported bs=new BasicANDImported();
		bs.BasicANDImported();
    }
}
