import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push(1);
		s.push("Jaspal");
		
		for (var item : s) {
			System.out.print(item+" ");
		}
		System.out.println();
		System.err.println(s.pop());
		for (var item : s) {
			System.out.print(item+" ");
		}
		
		System.out.println();
		System.err.println(s.isEmpty());
		
		
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+ ",");
		}
		
		s.add("John");
		s.add("Jack");
		System.out.println();
		System.out.println(s);
		
		ListIterator iterator = s.listIterator(s.size());
		while(iterator.hasPrevious())
		{
			System.out.print(iterator.previous()+ "("+ iterator.previousIndex() +")");
			
		}
		System.out.println();
		System.out.println(s.peek());
		System.out.println();
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.remove(0));
		System.out.println(s);
		Object[] arr = s.toArray();
		s.clear();
		System.out.println(s);
		System.out.println(arr);
		for (Object object : arr) {
			System.out.println(object);
		}
		
		s.add("John");
		s.add("Jack");
		s.forEach(n->{
			System.out.println(n);
		});
	}

}
