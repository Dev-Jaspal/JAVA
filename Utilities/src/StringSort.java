
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "Jaspal", "Lucy", "Ali", "Rony", "Pam" };
		sortStringArray(str);
		display(str);
	}

	public static void sortStringArray(String[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				System.err.println(arr[i].compareTo(arr[j]));
				if(arr[i].compareTo(arr[j]) > 0)
				{
					var temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void display(String[] arr)
	{
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
