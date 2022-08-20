
public class LabCourse extends CollegeCourse {

	private double fee;

	public LabCourse(String department, int courseNumber, int credit) {
		super(department, courseNumber, credit);
		this.fee = credit * 170;
	}

	@Override
	public void display() {
		System.err.println("Lab Course display method:");
		super.display();
	}

}
