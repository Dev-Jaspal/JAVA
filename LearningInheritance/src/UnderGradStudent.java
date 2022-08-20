
public class UnderGradStudent extends Student {

	private final int FEE = 80;
	private int creditEarned;

	public int getCreditEarned() {
		return creditEarned;
	}

	public void setCreditEarned(int creditEarned) {
		this.creditEarned = creditEarned;
	}

	/*
	 * public UnderGradStudent(int stuId, String fName, String lName, String course,
	 * String grade, String stuAddress, String collegeName) { super(stuId, fName,
	 * lName, course, grade, stuAddress, collegeName); // TODO Auto-generated
	 * constructor stub }
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
