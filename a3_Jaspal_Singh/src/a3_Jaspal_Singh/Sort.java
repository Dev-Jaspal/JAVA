package a3_Jaspal_Singh;

public class Sort {

	public static void main(String[] args) {
		 int[] arrayToSort = {20,10,1,2,6,8,9,13,3,5 };
		 
		 System.out.println("Array before sort.");
		 DisplayArr(arrayToSort);
		 
		 System.out.println("\nArray after Insertion sort.");
		 insertionSort(arrayToSort);
		 DisplayArr(arrayToSort);
		 
		 
		 System.out.println("\nArray after Merge sort.");
		 sort(arrayToSort, 0, arrayToSort.length-1);
		 DisplayArr(arrayToSort);
		 
		 System.out.println("\nArray after Quick sort.");
		 sort(arrayToSort, 0, arrayToSort.length-1);
		 DisplayArr(arrayToSort);
		 
		
	}
	
	public static void InsertionSort(int[] inputArray)
	{
		for (int i = 0; i < inputArray.length - 1; i++)
        {
            for (int j = i + 1; j > 0; j--)
            {
                if (inputArray[j - 1] > inputArray[j])
                {
                    int temp = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = temp;
                }
              }
        }
	}
	
	//actual insertion
	public static void insertionSort(int array[]) {
		int count  = 0;
	    int size = array.length;

	    for (int step = 1; step < size; step++) {
	      int key = array[step];
	      int j = step - 1;

	      // Compare key with each element on the left of it until an element smaller than
	      // it is found.
	      // For descending order, change key<array[j] to key>array[j].
	      while (j >= 0 && key < array[j]) {
	        array[j + 1] = array[j];
	        --j;
	      }

	      // Place key at after the element just smaller than it.
	      array[j + 1] = key;
	      count++;
	    }
	    System.out.println();
	    System.out.println(count);
	}
	    
	 void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (arr[j] > arr[j + 1]) {
	                    // swap arr[j+1] and arr[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	    }
	  
	public static void MergeSort(int inputArray[], int start, int middle, int end)
	{
			int leftArrSize = middle - start + 1;
	        int rightArrSize = end - middle;
	 
	        int leftArr[] = new int[leftArrSize];
	        int rightArr[] = new int[rightArrSize];
	 
	        for (int i = 0; i < leftArrSize; ++i)
	        	leftArr[i] = inputArray[start + i];
	        for (int j = 0; j < rightArrSize; ++j)
	        	rightArr[j] = inputArray[middle + 1 + j];
	 
	        int i = 0, j = 0;
	 
	        int k = start;
	        while (i < leftArrSize && j < rightArrSize) {
	            if (leftArr[i] <= rightArr[j]) {
	            	inputArray[k] = leftArr[i];
	                i++;
	            }
	            else {
	            	inputArray[k] = rightArr[j];
	                j++;
	            }
	            k++;
	        }
	 
	        while (i < leftArrSize) {
	        	inputArray[k] = leftArr[i];
	            i++;
	            k++;
	        }
	 
	        while (j < rightArrSize) {
	        	inputArray[k] = rightArr[j];
	            j++;
	            k++;
	        }
	}
	
	
	public static void sort(int inputArray[], int start, int end)
    {
        if (start < end) {
            int middle =start+ (end-start)/2;
            sort(inputArray, start, middle);
            sort(inputArray, middle + 1, end);
            MergeSort(inputArray, start, middle, end);
        }
    }
	
	public static void QuickSort(int inputArray[], int start, int end)
	{
		if (start < end)
	    {
	         
	        int partitionIndex = partition(inputArray, start, end);
	 
	        QuickSort(inputArray, start, partitionIndex - 1);
	        QuickSort(inputArray, partitionIndex + 1, end);
	    }
	}
	
	static int partition(int inputArray[], int start, int end)
	{
	     
	    int pivot = inputArray[end];
	     
	    int i = (start - 1);
	 
	    for(int j = start; j <= end - 1; j++)
	    {
	         
	        if (inputArray[j] < pivot)
	        {
	            i++;
	            swap(inputArray, i, j);
	        }
	    }
	    swap(inputArray, i + 1, end);
	    return (i + 1);
	}

	
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	public static void DisplayArr(int[] inputArray)
	{
		for (int item : inputArray) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

}
