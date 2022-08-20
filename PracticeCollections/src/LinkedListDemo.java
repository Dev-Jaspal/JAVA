import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(1);
		lst.add(5);
		lst.add(3);
		lst.add(6);
		
		int count = 1;
		System.out.println("Size => "+lst.size());
		for (Integer integer : lst) {
			System.out.print(integer);
			if(count < lst.size())
			{
				 System.out.print("->");
			}
			
			count++;
		}
		System.out.println();
		System.out.println("Removed => "+lst.remove(3));
		System.out.println("Size => "+lst.size());
		count = 1;
		for (Integer integer : lst) {
			System.out.print(integer);
			if(count < lst.size())
			{
				 System.out.print("->");
			}
			
			count++;
		}
		
	}

}
