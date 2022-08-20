import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListPractice {
	public static void main(String... s)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(10);
		al.add(30);
		al.add(300);
		al.add(321);
		
		System.out.println(al);
		al.remove(2);
		al.add(2, 50);
		for (Integer item : al) {
			System.out.println(item);
		}
		
		ArrayList<Car> carList = new ArrayList<Car>(){
			{
			add(new Car("Ford", 2012));
			add(new Car("Tesla", 2012));
			}
		};
		
		System.out.println(carList);
		
		
		 LinkedList<Object> linkedList = new LinkedList<>(al);
		    linkedList.add(1, "red");
		    linkedList.removeLast();
		    linkedList.addFirst("green");

		    System.out.println("Display the linked list forward:"); 
		    ListIterator<Object> listIterator = linkedList.listIterator();
		    while (listIterator.hasNext()) {
		      System.out.print(listIterator.next() + " ");
		    }
		    System.out.println();
		  
		    System.out.println("Display the linked list backward:");
		    listIterator = linkedList.listIterator(linkedList.size());
		    while (listIterator.hasPrevious()) {
		      System.out.print(listIterator.previous() + " ");
		    }
		
	}
}
