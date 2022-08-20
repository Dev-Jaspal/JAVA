import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
	     // Demonstrating Set using HashSet
        // Declaring object of type String 
        Set<String> hash_Set = new HashSet<String>();
  
        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
  
        // Printing elements of HashSet object
        System.out.println(hash_Set+"\n");
        
        Iterator<String> i = hash_Set.iterator();
        while(i.hasNext()) {
        	System.out.print(i.next() + ",");
        }
        
        System.out.println();
        System.out.println();
        unionIntersectionDiffDemo();
        System.out.println();
        System.out.println();
        addElements();
	}
	
	
	public static void unionIntersectionDiffDemo() {
		// Declaring object of Integer type 
        Set<Integer> a = new HashSet<Integer>();
        
        // Adding all elements to List 
        a.addAll(
        		Arrays.asList(
        			new Integer[] { 1, 3, 2, 4, 8, 9, 0 }
        		));
        
      // Again declaring object of Set class
      // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();
          
      b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
  
          
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
  
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
  
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
	}
	
	public static void addElements() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(2);
		
		System.out.println(set);
		
	}

}
