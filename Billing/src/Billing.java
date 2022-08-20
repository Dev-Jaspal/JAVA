
public class Billing {

	private static final float TAX = 0.08f;
	public static void main(String... args)
	{
		System.out.println("Total price is "+ computeBill(20) );
		System.out.println("Total price is "+ computeBill(20, 2));
		System.out.println("Total price is "+ computeBill(20, 2, 5));
	}
	
	private static float computeBill(float price) {
		 return price * (1 + TAX);
	}
	
	private static float computeBill(float price, int quantity) {
		 return quantity * price * (1 + TAX);
	}
	
	private static float computeBill(float price, int quantity, float couponValue) {
		  float totalPrice = (quantity * price) - couponValue;
		  return totalPrice * (1 + TAX);
	}
}
