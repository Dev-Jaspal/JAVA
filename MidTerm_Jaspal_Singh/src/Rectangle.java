
public class Rectangle {
	
	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public Rectangle() {
		super();
		this.height = 0;
		this.width = 0;
	}
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public int getArea() {
		return height *width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
	
	
	
}
