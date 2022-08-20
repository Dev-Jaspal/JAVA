import java.util.Scanner;

public class CollegeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		CollegeEmployee[] regularEmp = new CollegeEmployee[1];
		Faculty[] fac = new Faculty[1];
		Student[] stud = new Student[1];

		System.out.println("Which type of data will be enter C,F,S or Q to quit");
		var input = sc.nextLine();
		int emp = 0;
		int member = 0;
		int stu = 0;
		while (!input.toUpperCase().equals("Q")) {
			if (input.toUpperCase().equals("C")) {
				if (emp == regularEmp.length) {
					System.err.println("Employee array is full can not enter more values!!!");
				} else {
					System.out.print("Please enter first name: ");
					var fName = sc.nextLine();
					System.out.print("Please enter last name: ");
					var lName = sc.nextLine();
					System.out.print("Please enter address: ");
					var address = sc.nextLine();
					System.out.print("Please enter zip code: ");
					var zip = sc.nextLine();
					System.out.print("Please enter phone: ");
					var phone = sc.nextLine();

					System.out.print("Please enter SSN: ");
					var ssn = sc.nextLine();
					System.out.print("Please enter department name: ");
					var dName = sc.nextLine();
					System.out.print("Please enter annual salary: ");
					var salary = sc.nextDouble();
					sc.nextLine();

					CollegeEmployee empObj = new CollegeEmployee();
					empObj.setFirstName(fName);
					empObj.setLastName(lName);
					empObj.setAddress(address);
					empObj.setZipCode(zip);
					empObj.setPhoneNum(phone);
					empObj.setDepartmentName(dName);
					empObj.setSsn(ssn);
					empObj.setAnnualSalary(salary);

					regularEmp[emp] = empObj;
					emp++;
				}

			}

			if (input.toUpperCase().equals("F")) {
				if (member == fac.length) {
					System.err.println("Faculty array is full can not enter more values!!!");
				} else {
					System.out.print("Please enter first name: ");
					var fName = sc.nextLine();
					System.out.print("Please enter last name: ");
					var lName = sc.nextLine();
					System.out.print("Please enter address: ");
					var address = sc.nextLine();
					System.out.print("Please enter zip code: ");
					var zip = sc.nextLine();
					System.out.print("Please enter phone: ");
					var phone = sc.nextLine();

					System.out.print("Please enter SSN: ");
					var ssn = sc.nextLine();
					System.out.print("Please enter department name: ");
					var dName = sc.nextLine();
					System.out.print("Please enter annual salary: ");
					var salary = sc.nextDouble();
					sc.nextLine();
					System.out.print("Please enter tenured: ");
					var tenured = sc.nextBoolean();
					sc.nextLine();
					
					Faculty facObj = new Faculty();
					facObj.setFirstName(fName);
					facObj.setLastName(lName);
					facObj.setAddress(address);
					facObj.setZipCode(zip);
					facObj.setPhoneNum(phone);
					facObj.setDepartmentName(dName);
					facObj.setSsn(ssn);
					facObj.setAnnualSalary(salary);
					facObj.setTenured(tenured);

					fac[member] = facObj;
					member++;
				}
			}

			if (input.toUpperCase().equals("S")) {
				if (stu == stud.length) {
					System.err.println("Student array is full can not enter more values!!!");
				} else {
					System.out.print("Please enter first name: ");
					var fName = sc.nextLine();
					System.out.print("Please enter last name: ");
					var lName = sc.nextLine();
					System.out.print("Please enter address: ");
					var address = sc.nextLine();
					System.out.print("Please enter zip code: ");
					var zip = sc.nextLine();
					System.out.print("Please enter phone: ");
					var phone = sc.nextLine();
					System.out.print("Please enter study of field: ");
					var study = sc.nextLine();
					System.out.print("Please enter grade: ");
					var grade = sc.nextLine();

					Student stuObj = new Student();
					stuObj.setFirstName(fName);
					stuObj.setLastName(lName);
					stuObj.setAddress(address);
					stuObj.setZipCode(zip);
					stuObj.setPhoneNum(phone);
					stuObj.setFieldOfStudy(study);
					stuObj.setGrade(grade);

					stud[stu] = stuObj;
					stu++;
				}
			}

			System.out.println("Which type of data will be enter C,F,S or Q to quit");
			input = sc.nextLine();
		}

		display(regularEmp, fac, stud);
	}

	public static void display(CollegeEmployee[] regularEmp, Faculty[] fac, Student[] stud) {
		if (isArrayEmpty(regularEmp)) {
			System.err.println("Employee db is empty");
		} else {

			for (var item : regularEmp) {
				item.display();
			}

		}

		if (isArrayEmpty(fac)) {
			System.err.println("Faculty db is empty");

		} else {

			for (var item : fac) {
				item.display();
			}
		}

		if (isArrayEmpty(stud)) {
			System.err.println("Student db is empty");
		} else {

			for (var item : stud) {
				item.display();
			}
		}
	}

	public static boolean isArrayEmpty(Object[] arr) {
		if (arr == null) {
			return true;
		} else if (arr.length == 0) {
			return true;
		} else {
			for (var item : arr) {
				if (item != null) {
					return false;
				}
			}
			return true;
		}
	}
}
