import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListDemo {
	public static void main(String... strings)
	{
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add(5);
		arr.add(9);
		arr.add(3);
		
		ArrayList arr2 = new ArrayList();
		arr2.add(1);
		arr2.add(5);
		arr2.add(9);
		arr2.add(3);
		
		System.out.println("Actual ArrayList => " +arr);
		Collections.shuffle(arr);
		System.out.println("Shuffle => "+arr);
		Collections.sort(arr);
		System.out.println("Sort => " +arr);
		Collections.reverse(arr);
		System.out.println("Reverse => " +arr);
		System.out.println("Extract portion =>" + arr.subList(1, 4));
		Collections.swap(arr, 2,3);
		System.out.println("Swap => " + arr);
		System.out.println("Compare = > "+arr.containsAll(arr2));
	}

	
}
