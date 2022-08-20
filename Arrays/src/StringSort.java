
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "jas", "gab" 
				};
		int[] num = {2,30,52,3,4,9,6};
		sortStringArray(str);
		display(str);
		
		sortIntegerArray(num);
		display(num);
	}

	public static void sortStringArray(String[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0)
				{
					var temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	public static void sortIntegerArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j])
				{
					var temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
			display(arr, i+1);
		}
	}
	public static void display(String[] arr)
	{
		for (var string : arr) {
			System.out.println(string);
		}
	}
	
	public static void display(int[] arr)
	{
		for (var string : arr) {
			System.out.println(string);
		}
	}
	
	public static void display(int[] someNums, int a)
	{
	 System.out.print("Iteration " + a + ": ");
	 for(int x = 0; x < someNums.length; ++x)
	 System.out.print(someNums[x] + " ");
	 System.out.println();
	}
}
