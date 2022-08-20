import java.util.Scanner;

public class GenericMethodClass {

	public static void main(String[] args) {
		
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter value1");
//		var value1 = sc.next();
//		System.out.println("Enter value2");
//		var value2 = sc.nextLine();
//		System.out.println("Enter value3");
//		var value3 = sc.nextLine();
//		
//		new GenericMethodClass().genericPrint(value1, value2, value3);
      
		genericPrint(1, 2, 3);
		genericPrint(1.2, 2.3, 3.5);
		genericPrint("Hello", "again", "World");
	}
    
	public  static <T> void genericPrint(T value1, T value2, T value3)
	{
		System.out.println("Value1 = " + "\""+ value1 + "\"" + ", Value2 = " + "\""+ value2 + "\""+ ", Value3 = " + "\""+value3 + "\"");
	}
}
