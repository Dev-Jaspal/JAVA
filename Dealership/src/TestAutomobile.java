
public class TestAutomobile {

	public static void main(String[] args) {
		Automobile obj1 = new Automobile(100000, "Ford", "GT", "Black", 2013, 50);
		display(obj1);
		Automobile obj2 = new Automobile(100, "Ford", "GT", "Black", 2021, 70);
		display(obj2);

	}

	public static void display(Automobile obj) {
		System.out.println("Id: " + obj.getId());
		System.out.println("Make: " + obj.getMake());
		System.out.println("Model: " + obj.getModel());
		System.out.println("Color: " + obj.getColor());
		System.out.println("Year: " + obj.getYear());
		System.out.println("Milee per gallon: " + obj.getMilesPerGallon());
	}

}
