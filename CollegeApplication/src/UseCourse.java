import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// CollegeCourse course;
		System.out.print("Please enter department name: ");
		var department = sc.nextLine();
		System.out.print("Please enter course number: ");
		var courseNum = sc.nextInt();
		System.out.print("Please enter credit: ");
		var credit = sc.nextInt();

		if (department.equals("BIO") || department.equals("CHM") || department.equals("CIS")
				|| department.equals("PHY")) {
			new LabCourse(department, courseNum, credit).display();
		} else {
			new CollegeCourse(department, courseNum, credit).display();
		}
	}

}
