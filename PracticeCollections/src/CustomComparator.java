import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		if(emp1.getEmpSalary()>emp2.getEmpSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
