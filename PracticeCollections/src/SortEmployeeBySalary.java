import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortEmployeeBySalary {

	public static void main(String[] args) {
		
		ArrayList<Employee> arrList = new ArrayList<>();
		
		arrList.add(new Employee("Jaspal", 3000));
		arrList.add(new Employee("Jasmine", 6000));
		arrList.add(new Employee("Rose", 2000));
		arrList.add(new Employee("John", 3200));
		System.out.println(arrList);
		Collections.sort(arrList, new CustomComparator());
		System.out.println("After Sorting.....");
		for (Employee employee : arrList) {
			
			System.out.println("Name: " + employee.getEmpName() +  " Salary: "+ employee.getEmpSalary() );
		}

	}

}
