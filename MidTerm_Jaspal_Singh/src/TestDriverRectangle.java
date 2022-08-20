import java.util.LinkedList;
import java.util.Random;

public class TestDriverRectangle {

	
	
	public static void main(String[] args) {
		final int SIZE = 5;
		LinkedList<Rectangle> rectangleList = new LinkedList<Rectangle>();
		fillRectangleList(rectangleList, SIZE);
		displayTotalArea(rectangleList);
	}
	
	public static void fillRectangleList(LinkedList<Rectangle> rectangleList, int size)
	{
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			int height = random.nextInt(10)+1;
			int width = random.nextInt(10)+1;
			rectangleList.add(new Rectangle(height,width));
		}
	}
	
	
	public static void displayTotalArea(LinkedList<Rectangle> rectangleList) {
		int count = 1;
		int totalArea = 0;
		for (Rectangle rectangle : rectangleList) {
			System.out.println("Rectangle Object: " + count + ", "+ rectangle + ", Area is: " +  rectangle.getArea() + " cm\u00B2");
		    count++;
			totalArea += rectangle.getArea();
		}
		System.out.println("-------------------------------------------");
		System.out.println("\nTotal Area is: " + totalArea + " cm\u00B2");
		System.out.println("-------------------------------------------");
	}
}
