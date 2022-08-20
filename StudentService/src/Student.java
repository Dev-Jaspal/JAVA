
public class Student extends Person {

	private String fieldOfStudy;
	private String grade;
	
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public void display()
	{
		System.out.println("Student Data: ");
		super.display();
		System.out.println(" " + fieldOfStudy + " " + grade);
	}
}
