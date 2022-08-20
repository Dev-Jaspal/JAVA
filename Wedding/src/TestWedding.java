import java.time.LocalDate;

public class TestWedding {

	public static void main(String[] args) {

		Wedding wedObj1 = new Wedding(LocalDate.now(),
				new Couple(new Person("Smith", "Bell", LocalDate.of(1993, 02, 02)),
						new Person("Asly", "Roger", LocalDate.of(1993, 11, 02))),
				"XYZ location");

		Display(wedObj1);

		Wedding wedObj2 = new Wedding(LocalDate.now(),
				new Couple(new Person("John", "Bell", LocalDate.of(1993, 01, 02)),
						new Person("Jasmine", "Roger", LocalDate.of(1993, 12, 02))),
				"xoxo location");
		Display(wedObj2);

	}

	private static void Display(Wedding wedding) {

		System.out.println("***************Invitation*************************");
		System.out.println("Groom " + wedding.getGroomFullName() + " weds with Bride " + wedding.getBrideFullName()
				+ " on date: " + wedding.getWeddingDate() + " at Venu: " + wedding.getLocation());

		System.out.println("Groom age: " + wedding.getCoupleName().getGroom().getBirthDate() + " and Bride age: "
				+ wedding.getCoupleName().getGroom().getBirthDate());
		System.out.println();
		System.out.println();
	}

}
