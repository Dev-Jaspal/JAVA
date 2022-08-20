import java.util.Scanner;

public class DemoStudent {
	final static int MAX = 2;
	final static String QUIT = "Q";
	public static void main(String[] args) {

		Student[] stuObj = new Student[MAX];
		
		boolean Exit = false;
		
		Scanner sc = new Scanner(System.in);
		while(!Exit)
		{
			System.out.println("Please select the option below or press \"Q\"");
			System.out.println("1. Grad student ");
			System.out.println("2. Under Grad student ");
			var input = sc.nextLine();
			
			switch(input)
			{
			case "1" :
				Exit = userInputGrad(Exit, stuObj);
				GradStudent o = new GradStudent();
				o.bubbleSortStudentByCourses(stuObj);
				o.display(stuObj);
				break;
			case "2" :
				Exit = userInputUGrad(Exit, stuObj);
				UnderGradStudent u = new UnderGradStudent();
				u.bubbleSortStudentByCourses(stuObj);
				u.display(stuObj);
				break;
			case QUIT :
				Exit = true;
				break;
				default:
					System.err.println("Please enter valid input");
			}
			
		}
	
	}
	
	
	public static boolean userInputGrad(boolean exit, Student[] stuObj)
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(!exit)
		{
			
			System.out.print("Please enter first name: ");
			var fname = sc.nextLine();
			System.out.print("Please enter last name: ");
			var lname = sc.nextLine();
			System.out.print("Please enter course name: ");
			var course = sc.nextLine();
			System.out.print("Please enter address name: ");
			var address = sc.nextLine();
			System.out.print("Please enter id: ");
			var id = sc.nextInt();
			sc.nextLine();
			System.out.print("Please enter grade: ");
			var grade = sc.nextLine();
			System.out.print("Please enter college name: ");
			var college = sc.nextLine();
			System.out.print("Please enter credit earned: ");
			var credit = sc.nextInt();
			sc.nextLine();
			
			GradStudent stud = new GradStudent();
			stud.setCollegeName(college);
			stud.setCourse(course);
			stud.setStuId(id);
			stud.setfName(fname);
			stud.setlName(lname);
			stud.setGrade(grade);
			stud.setStuAddress(address);
			stud.setCreditEarned(credit);
			
			stuObj[i] = stud;
			i++;
			
			if(i == MAX)
			{
				exit = true;
			}
		}
		
		return exit;
	
	}
	public static boolean userInputUGrad(boolean exit, Student[] stuObj)
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(!exit)
		{
			
			System.out.print("Please enter first name: ");
			var fname = sc.nextLine();
			System.out.print("Please enter last name: ");
			var lname = sc.nextLine();
			System.out.print("Please enter course name: ");
			var course = sc.nextLine();
			System.out.print("Please enter address name: ");
			var address = sc.nextLine();
			System.out.print("Please enter id: ");
			var id = sc.nextInt();
			System.out.print("Please enter grade: ");
			var grade = sc.nextLine();
			System.out.print("Please enter college name: ");
			var college = sc.nextLine();
			System.out.print("Please enter credit earned: ");
			var credit = sc.nextInt();
			
			UnderGradStudent stud = new UnderGradStudent();
			stud.setCollegeName(college);
			stud.setCourse(course);
			stud.setStuId(id);
			stud.setfName(fname);
			stud.setlName(lname);
			stud.setGrade(grade);
			stud.setStuAddress(address);
			stud.setCreditEarned(credit);
			
			stuObj[i] = stud;
			i++;
			
			if(i == MAX)
			{
				exit = true;
			}
		}
		
		return exit;
		
	}
	



}
