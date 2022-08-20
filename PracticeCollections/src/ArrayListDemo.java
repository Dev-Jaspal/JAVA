import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String... str)
	{
		    ArrayList<String> arrl = new ArrayList<String>();
		    arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        
	        System.out.println(arrl);
	        System.out.println(arrl.indexOf("Third"));
	        System.out.println(arrl.get(2));
	        
	        System.out.println("-------------------------------------");
			System.out.println("         Sort ArrayList             ");
			System.out.println("-------------------------------------");
			
			Collections.sort(arrl);
			System.out.println(arrl);
	        Iterator<String> iterator = arrl.iterator();
	       while (iterator.hasNext())
	       {
				String string = (String) iterator.next();
				System.out.print(string + ", ");
				System.out.println();
	       }
	       
	        System.out.println("-------------------------------------");
			System.out.println("         Clone ArrayList             ");
			System.out.println("-------------------------------------");
			
			ArrayList<String> arrlCopy = (ArrayList<String>) arrl.clone();
			System.out.println("Clone => "+ arrlCopy);
			
			  System.out.println("-------------------------------------");
			System.out.println("Here we can see example for copying another collection instance objects to existing ArrayList.");
			  System.out.println("-------------------------------------");
			  
			  
			  List<String> list = new ArrayList<>();
			  list.add("Hi");
			  list.add("Hello");
			  list.addAll(arrlCopy);
			  
			  System.out.println(list);
			  
			  System.out.println("-------------------------------------");
			  System.out.println("       Clear all object              ");
			  System.out.println("-------------------------------------");
			  
			  list.clear();
			  System.out.println(list);
			  
			  System.out.println("-------------------------------------");
			  System.out.println(" the instance of an ArrayList contains all objects of another Collection instance.");
			  System.out.println("-------------------------------------");
			  
			  System.out.println("Contains all objects => "+ arrl.containsAll(list));
			  System.out.println("Contains all objects => "+ list.containsAll(arrl));
			  
			  System.out.println("-------------------------------------");
			  System.out.println("       Convert Array list to array    ");
			  System.out.println("-------------------------------------");
			  
			  String[] strArr = new String[arrl.size()];
			  arrl.toArray(strArr);
			  
			  System.out.println(strArr);
			  for (String string : strArr) {
				System.out.println(string);
			}
			  
			  System.out.println("-------------------------------------");
			  System.out.println("getting ArrayList content based on range of index");
			  System.out.println("-------------------------------------");
			  
			  System.out.println(arrl);
			  List<String> lst = arrl.subList(1, 4);
			  System.out.println(lst);
			  
			  
			  
	}

}
