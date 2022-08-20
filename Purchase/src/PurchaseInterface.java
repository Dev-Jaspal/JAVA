import java.util.Scanner;

public class PurchaseInterface {
	
	public static void main(String... s) {
		Scanner sc = new Scanner(System.in);
	   System.out.print("Please enter invoice number >> ");
	   var invoice = sc.nextInt();
	   boolean exit = true;
	   while(!(invoice > 1000 && invoice < 8000))
	   {
		   System.out.print("Please enter invoice number >> ");
		   invoice = sc.nextInt();
	   }
	   
	   System.out.print("Please enter amount >> ");
	   var amt =  sc.nextDouble();
	   while(amt < 0)
	   {
		   System.out.print("Please enter amount >> ");
		   amt =  sc.nextDouble();
	   }
	   
	   PurchaseDetail detail = new PurchaseDetail();
	   detail.setAmt(amt);
	   detail.setInvoiceNum(invoice);
	   detail.display();
	   
	}

}
