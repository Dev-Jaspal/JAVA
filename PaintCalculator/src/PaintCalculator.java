
import javax.swing.JOptionPane;

public class PaintCalculator {

	private static final double GALLON_PER_SQ_FEET = (double) 1 / 350;
	private static final double PRICE = 32;

	public static void main(String[] args) {

		double length, width, height;

		/*
		 * System.out.println("******** PAINT CALCULATOR********");
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.print("Please enter the length in feet>> "); length =
		 * input.nextDouble();
		 * 
		 * System.out.print("Please enter the width in feet>> "); width =
		 * input.nextDouble();
		 * 
		 * System.out.print("Please enter the height in feet>> "); height =
		 * input.nextDouble(); System.out.println("Paint required in gallon is " +
		 * paintNeeded); System.out.println("Price of the paint required is " +
		 * PaintCalculator.price(paintNeeded)); input.close();
		 * 
		 */

		length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length in feet"));
		width = Double.parseDouble(JOptionPane.showInputDialog("Please enter the width in feet"));
		height = Double.parseDouble(JOptionPane.showInputDialog("Please enter the height in feet"));
		double area = PaintCalculator.calculateArea(length, width, height);
		double paintNeeded = PaintCalculator.paintRequired(area);

		JOptionPane.showMessageDialog(null,
				"Paint required: " + paintNeeded + " gallon \nPaint price: $" + PaintCalculator.price(paintNeeded));

	}

	private static double calculateArea(double length, double width, double height) {
		double area;
		area = 2 * (length + width) * height;
		return area;
	}

	private static double paintRequired(double area) {
		return area * GALLON_PER_SQ_FEET;
	}

	private static double price(double paintInGallon) {
		return PRICE * paintInGallon;
	}

}
