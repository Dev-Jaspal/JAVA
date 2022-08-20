
public class Student {

	private int studentId;
	private float creditHours;
	private float pointsEarned;
	private float gradePointAvg;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setCreditHours(float creditHours) {
		this.creditHours = creditHours;
	}

	public float getCreditHours() {
		return creditHours;
	}

	public void setPointEarned(float pointEarned) {
		this.pointsEarned = pointEarned;
	}

	public float getPointEarned() {
		return pointsEarned;
	}

	public Student(){
	}
	
	public Student(int _studnetId, float _creditHours, float _pointEarned)
	{
		this.studentId = _studnetId;
		this.creditHours = _creditHours;
		this.pointsEarned = _pointEarned;
	}

	public float getGradePointAvg() {

		this.gradePointAvg = pointsEarned / creditHours;
		return gradePointAvg;
	}

	public void display() {
		System.out.println("Student ID: " + this.studentId + "\nCredit hours earned: " + this.creditHours
				+ "\nPoints earned: " + this.pointsEarned + "\nGrade point average: " + this.gradePointAvg);
	}
}
