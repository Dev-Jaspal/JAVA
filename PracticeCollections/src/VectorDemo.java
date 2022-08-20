import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		 Vector<String> v = new Vector<>();
		 v.add("Hi");
		 v.add(null);
		 v.add("Bie");
		 v.add(null);

		 for (String string : v) 
		 {
			System.out.print(string + " ");
		 }	
		 
		 System.out.println();
		 int n = 5;
		 
		 for (int i = 0; i < n; i++) {
			System.out.print(i + " ");;
		}
		 System.out.println();
		 v.remove(1);
		 for (String string : v) 
		 {
			System.out.print(string + " ");
		 }	
		 
		 Vector v1 =new Vector();
		 v1.add("Hi");
		 v1.add(1);
		 v1.add("Bie");
		 v1.add(2);
		 System.out.println();
		 for (var string : v1) 
		 {
			System.out.print(string + " ");
		 }	
		 

		 
				 
	}

}
