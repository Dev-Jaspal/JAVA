
public class Employee {
	
	private String EmpName;
	private double EmpSalary;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}
	public Employee(String empName, double empSalary) {
		super();
		EmpName = empName;
		EmpSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}
	
	

}
