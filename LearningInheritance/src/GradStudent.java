
public class GradStudent extends Student {

	private final int FEE = 120;
	private int creditEarned;

	public void setCreditEarned(int creditEarned) {
		this.creditEarned = creditEarned;
	}

	public int getCreditEarned() {
		return creditEarned;
	}

	/*
	 * public GradStudent() { //super(stuId, fName, lName, course, grade,
	 * stuAddress, collegeName); this.creditEarned = creditEarned; }
	 */

	private int calFee() {
		return FEE * getCreditEarned();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Student credit earned: " + getCreditEarned());
		System.out.println("Student fee: " + calFee());
	}

	@Override
	public void display(Student[] stud) {
		for (var student : stud) {
			System.out.println("Student name: " + student.getfName() + " " + student.getlName());
			System.out.println("Student Id: " + student.getStuId());
			System.out.println("Student course: " + student.getCourse());
			System.out.println("Student grade: " + student.getGrade());
			System.out.println("Student address: " + student.getStuAddress());
			System.out.println("Student college name: " + student.getCollegeName());
			System.out.println("Student credit earned: " + getCreditEarned());
			System.out.println("Student fee: " + calFee());
		}
	}

}
