import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TestStudent {

	public static void main(String[] args) {
		
		List<Student> studPriority = new LinkedList<Student>();
		studPriority.add(new Student("Jaspal", 2,"1993"));
		studPriority.add(new Student("Rose", 15,"1993"));
		studPriority.add(new Student("Kile", 5,"1993"));
		studPriority.add(new Student("Ko", 6,"1993"));
		
		Collections.sort(studPriority);
		for (Student student : studPriority) {
			System.out.println(student);
		}
		PriorityQueue<Student> studPriority2 = new PriorityQueue<Student>();
		
		studPriority2.add(new Student("AA", 2,"1993"));
		studPriority2.add(new Student("JJ", 15,"1993"));
		studPriority2.add(new Student("BB", 13,"1993"));
		studPriority2.add(new Student("KK", 6,"1993"));
		
		System.out.println();
		while(!studPriority2.isEmpty()) {
			System.out.println(studPriority2.poll());
		}
		
		PriorityQueue<Student> studPriority3 = new PriorityQueue<Student>(Comparator.comparing(Student :: getStudName));
		
		studPriority3.add(new Student("AA", 2,"1993"));
		studPriority3.add(new Student("JJ", 15,"1993"));
		studPriority3.add(new Student("BB", 13,"1993"));
		studPriority3.add(new Student("KK", 6,"1993"));
		
		System.out.println();
		while(!studPriority3.isEmpty()) {
			System.out.println(studPriority3.poll());
		}
	}

}
