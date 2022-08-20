import java.util.Comparator;

public class CustomStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudID() < o2.getStudID())
			return -1;
		else if(o1.getStudID() == o2.getStudID())
			return 0;
		else
			return 1;
	}

}
