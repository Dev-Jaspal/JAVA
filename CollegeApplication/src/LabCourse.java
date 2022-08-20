
public class LabCourse extends CollegeCourse {


	public LabCourse(String department, int courseNumber, int credit) {
		super(department, courseNumber, credit);
		setFee(credit);
	}
    
	@Override
	public void setFee(double credit) {
		this.fee = (credit * 120) + 50;
	}
	
	@Override
	public void display() {
		System.err.println("Lab Course display method:");
		super.display();
	}

}
