package a3_Jaspal_Singh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Search {

	public static void main(String[] args) {
		
		 int[] arrayToSearch = {20,10,1,2,6,8,9,13 };
	     int searchValue = 6;
	     
	     System.out.println("Array >> ");
	     for (int val : arrayToSearch) {
	    	 System.out.print(val + " ");
		}
	    
	     System.out.println();
	     System.out.println("\nLinear Search: >>");
	     LinearSearch(arrayToSearch, searchValue);
	     
	     arrayToSearch = new int[]{1,2,6,8,9,10,13,20};
	     searchValue = 6;
	     
	     System.out.println("\nArray >> ");
	     for (int val : arrayToSearch) {
	    	 System.out.print(val + " ");
		}
	    
	     System.out.println();
	     System.out.println("\nBinary Search: >>");
	     BinarySearch(arrayToSearch, searchValue);
	     
	     int start = 0;
		 int end = arrayToSearch.length -1;
		 
		 System.out.println("\nInterpolation Search: >>");
		 int response = InterpolationSearch(arrayToSearch, start, end, searchValue);
		 if (response != -1)
		 {
	          System.out.println(searchValue + " is found at index "+ response);
		 }
	     else
	     {
	         System.out.println("Value not found.");
	     }
		 
		 System.out.println("Arrays.BinarySearch >> ");
		 Integer[] ar = {1,5,10,11,15,42};
		 System.out.println(Arrays.binarySearch(ar, 0));
		 System.out.println(Arrays.binarySearch(ar, 11));
		 List<Integer> arrList= Arrays.asList(ar);
		 ArrayList<Integer> list = new ArrayList<Integer>(arrList);
		 System.out.println("Collection.BinarySearch >> ");
		 System.out.println(Collections.binarySearch(list, 11));
	}
	
	public static void LinearSearch(int arrToSearch[], int searchValue)
	{
		int arrLength = arrToSearch.length;
		int start = 0;
		int end = arrLength -1;
		int index = -1;
		
		while(start <= end)
		{
			if(arrToSearch[start] == searchValue)
			{
				index = start;
				System.out.println(searchValue +" is found at index " + (index));
				break;
			}
			
			if(arrToSearch[end] == searchValue)
			{
				index = end;
				System.out.println(searchValue +" is found at index " + (index));
				break;
			}
			
			start++;
			end--;
		}
		
		if(index == -1)
		{
			System.out.println("Value not found !!");
		}
	}
	
	public static int BinarySearch(int arrToSearch[], int searchValue)
	{
		int arrLength = arrToSearch.length;
		int start = 0;
		int end = arrLength -1;
		
		while(start <= end)
		{
			int middle = start + (end - start)/2;
			
			if(arrToSearch[middle] == searchValue)
			{
				//System.out.println(searchValue +" is found at index " + (middle));
				return middle;
				//break;	
			}
			
			if(arrToSearch[middle] < searchValue)
			{
				start = middle + 1;
			}
			else
			{
				end = middle - 1;
			}
		}
		
		return -1;
		
	}
	
	public static int InterpolationSearch(int arrToSearch[],int start, int end, int searchValue)
	{
		int index;
		
		if (start <= end && searchValue >= arrToSearch[start] && searchValue <= arrToSearch[end]) {
	  
	           
				index = start + (((end - start) / (arrToSearch[end] - arrToSearch[start])) * (searchValue - arrToSearch[start]));
	  
	            if (arrToSearch[index] == searchValue)
	                return index;
	  
	            if (arrToSearch[index] < searchValue)
	            {
	            	 return InterpolationSearch(arrToSearch, index + 1, end, searchValue);
	            }
	               
	            // If x is smaller, x is in left sub array
	            if (arrToSearch[index] > searchValue)
	                return InterpolationSearch(arrToSearch, end, index - 1, searchValue);
	        }
	        return -1;
	}

}
