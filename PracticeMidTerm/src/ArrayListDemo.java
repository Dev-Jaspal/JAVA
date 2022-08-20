import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println(arrayList);
		
		arrayList.add(0,30);
		System.out.println(arrayList);
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		LinkedList<Object> linkedList = new LinkedList<>(arrayList);
		ListIterator<Object> iterator2 = linkedList.listIterator(linkedList.size());
		while(iterator2.hasPrevious())
		{
			System.out.print(iterator2.previous()+" ");
		}
	}

}
