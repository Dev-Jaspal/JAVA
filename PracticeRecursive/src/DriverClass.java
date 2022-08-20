
public class DriverClass {

	public static void main(String[] args) {
		GenericClass<Integer> strObj = new GenericClass<>(10);
		System.out.println(strObj.getObj().toString());
		
		strObj.print(new Integer[]{1, 2});

	}

}
