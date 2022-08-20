/**
 * 
 */

/**
 * @author jaspa
 *
 */
public class RecursiveBinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int[] list = {3, 5, 7, 8, 12, 17, 24, 29};
		    int res = binarySearch(list, 7);
		    System.out.println(res<0?"Not Found" : "Found at:" + res);
		    res = binarySearch(list, 0);
		    System.out.println(res<0?"Not Found" : "Found at:" + res);
		 
		  }

	

	public static int binarySearch(int[] list, int num)
	{
		return binarySearch(list, num, 0, list.length-1);
	}
	
	public static int binarySearch(int[] list, int num, int low, int high)
	{
		if (low > high)  
		      return -low - 1;
		int mid = (high+low)/2;
		
		if(num < list[mid])
			return binarySearch(list, num, low, mid-1);
			else if(num == list[mid])
				return mid;
			else
				return binarySearch(list, num, mid + 1, high);
	}
	
}
