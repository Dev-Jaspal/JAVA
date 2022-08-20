import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		
		    Patient patient1 = new Patient("John", 2);
		    Patient patient2 = new Patient("Jim", 1);
		    Patient patient3 = new Patient("Tim", 5); // Create Tim with priority 5
		    Patient patient4 = new Patient("Cindy", 7);
		    
		    PriorityQueue<Patient> priorityQueue 
		      = new PriorityQueue<>();
		    
		    priorityQueue.offer(patient1);
		    priorityQueue.offer(patient2);
		    priorityQueue.offer(patient3);
		    priorityQueue.offer(patient4); // Enqueue patient4
		    
		    while (priorityQueue.size() > 0) {
		    	 System.out.println(priorityQueue.poll() + " ");
		    }
		     
		    
		    System.out.println();
		    PriorityQueue<Patient> priorityQueueByName 
		      = new PriorityQueue<>(Comparator.comparing(Patient::getName));
		    
		    priorityQueueByName.offer(patient1);
		    priorityQueueByName.offer(patient2);
		    priorityQueueByName.offer(patient3);
		    priorityQueueByName.offer(patient4); // Enqueue patient4
		    while (priorityQueueByName.size() > 0) 
			      System.out.println(priorityQueueByName.poll() + " ");
			    

	}

}
