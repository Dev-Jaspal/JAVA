
public class CollegeEmployee extends Person {

	private String ssn;
	private String departmentName;
	private double annualSalary;

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public void display()
	{
		System.out.println("College employee Data: ");
		super.display();
		System.out.println(" " + ssn + " " + departmentName + " " + annualSalary);
	}
}

