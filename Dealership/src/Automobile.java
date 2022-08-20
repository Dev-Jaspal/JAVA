
public class Automobile {
	private int id;
	private String make;
	private String model;
	private String color;
	private int year;
	private double milesPerGallon;

	public void setId(int id) {
		if (id > 0 && id < 9999) {
			this.id = id;
		} else {
			this.id = 0;
		}

	}

	public int getId() {
		return id;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setYear(int year) {
		if (year > 2005 && year < 2019) {
			this.year = year;
		} else {
			this.year = 0;
		}

	}

	public int getYear() {
		return year;
	}

	public void setMilesPerGallon(double milesPerGallon) {
		if (milesPerGallon > 10 && milesPerGallon < 60) {
			this.milesPerGallon = milesPerGallon;
		} else {
			this.milesPerGallon = 0;
		}

	}

	public double getMilesPerGallon() {
		return milesPerGallon;
	}

	public Automobile(int id, String make, String model, String color, int year, double milesPerGallon) {
		setId(id);
		setMilesPerGallon(milesPerGallon);
		setYear(year);
		setColor(color);
		setModel(model);
		setMake(make);
	}

}
