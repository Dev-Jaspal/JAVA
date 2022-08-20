import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue obj = new PriorityQueue();
		obj.add(1);
		obj.add(2);
		obj.add(5);
		obj.add(3);
		

		System.out.println("Priority Queue => " + obj);
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		
		  PriorityQueue<String> queue2 = new PriorityQueue<>(
			      4, Collections.reverseOrder());
			    queue2.offer("Oklahoma");
			    queue2.offer("Indiana");
			    queue2.offer("Georgia");
			    queue2.offer("Texas");
			    
			    System.out.println("Priority Queue => " + queue2);
			    System.out.println(queue2.remove());
				System.out.println(queue2.remove());
				System.out.println(queue2.remove());
				System.out.println(queue2.remove());
				
				
				  PriorityQueue<String> queue3 = new PriorityQueue<>();
					    queue3.offer("Oklahoma");
					    queue3.offer("Indiana");
					    queue3.offer("Georgia");
					    queue3.offer("Texas");
					    System.out.println("Priority Queue => " + queue3);
					    System.out.println(queue3.remove());
						System.out.println(queue3.remove());
						System.out.println(queue3.remove());
						System.out.println(queue3.remove());
						

	}

}
