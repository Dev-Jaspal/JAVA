
public class Car {
	private String model;
	private int year;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}
	public Car() {
		super();
	}
	
	
}
