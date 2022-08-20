
public class CollegeCourse {
	
	private String department;
	private int courseNumber;
	private int credit;
	protected double fee;

	public void setFee(double credit) {
		this.fee = credit * 120;
	}

	public CollegeCourse(String department, int courseNumber, int credit) {
		this.department = department;
		this.courseNumber = courseNumber;
		this.credit = credit;
		setFee(credit);
	}
	
	public void display()
	{
	   System.out.println("Departmen name: " + department);
	   System.out.println("Course number: " + courseNumber);
	   System.out.println("Credit: " + credit);
	   System.out.println("Fee: " + fee);
	}
}
