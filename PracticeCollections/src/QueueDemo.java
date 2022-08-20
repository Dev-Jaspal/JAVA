import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		q.add("Jasmine");
		q.offer("Jaspal");
		
		System.out.println("Queue => " + q);
		System.out.println("Remove => " + q.remove());
		System.out.println("Queue => " + q);
		System.out.println("Poll => " + q.poll());
		System.out.println("Queue => " + q);
		System.out.println("Size => "+ q.size());
		q.offer("Jaspal");
		q.offer("Jassi");
		q.offer("John");
		System.out.println("Size => "+ q.size());
		System.out.println("Empty => "+ q.isEmpty());
		System.out.println("Element => "+ q.element());
		System.out.println("Peek => "+ q.peek());
		System.out.println("Queue => "+ q);
	
		
	}

}
