import java.util.Scanner;

public class CategorisedArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[20];
		boolean exit = false;
		int count = 0;
		int MAX = 20;
		Scanner sc = new Scanner(System.in);

		while (!exit) {
			System.out.println("Please enter the string or type \"EXIT\" to exit");
			var input = sc.nextLine();
			if (count != MAX && !input.equals("EXIT")) {
				str[count] = input;
				count++;
			} else {
				exit = true;
			}
		}

		System.out.println("Press 1 to display long string and 2 to display short strings");
		var option = sc.nextLine();
	//	String[] shortArr = new String[20];
		String[] longArr = new String[20];
		var j = 0;
		if (!isArrayEmpty(str)) {
			for (int i = 0; i < count; i++) {
				var x = str[i].split(" ").length;
				System.err.println(x);
				if (str[i].length() > 11 && option.equals("1")) {
					longArr[j] =  str[i];
					j++;
				} else if (str[i].length() <= 10 && option.equals("2")) {
					longArr[j] =  str[i];
					j++;
				} 
				else if (str[i].split(" ").length == 1 && option.equals("3")) {
					longArr[j] =  str[i];
					j++;
				} 
				else if (str[i].split(" ").length == 2  && option.equals("4")) {
					longArr[j] =  str[i];
					j++;
				} 
				else if (str[i].split(" ").length > 2 && option.equals("5")) {
					longArr[j] =  str[i];
					j++;
				} 
			}
			
			if (!isArrayEmpty(longArr))
			{
				for (int i = 0; i <j; i++)  {
					System.out.println(longArr[i]);
				}
				
			}
			else {
				System.out.println("Not found");
			}
			
		} else {
			System.out.println("Not found");
		}

	}

	public static boolean isArrayEmpty(Object[] arr) {
		if (arr == null) {
			return true;
		} else if (arr.length == 0) {
			return true;
		} else {
			for (var item : arr) {
				if (item != null) {
					return false;
				}
			}
			return true;
		}
	}

}
