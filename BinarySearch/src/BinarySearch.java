public class BinarySearch 
{
	private void fillArray(int[] arr, int n)
	{
		for (int i = 0; i <= n; ++i)
		{
			arr[i] = i;
		}
	}
	
	private int binarySearch(int[] arr, int target)
	{
		int low = 0;
		int high = arr.length - 1;
		int middle = -1;
		
		while (low <= high)
		{
			middle = (high + low) / 2;
					
			if (arr[middle] == target)
			{
				return middle;
			}
			
			if (target > arr[middle])
			{
				low = middle + 1;
			}
			else
			{
				high = middle - 1;
			}
		}
	
		return -1;
	}
	
	void main() 
	{
		// fill the array with numbers from 0 to n
		int n = 10;
		int[] arr = new int[n + 1];
		fillArray(arr, n);
		
		// testing
		IO.println(binarySearch(arr, 5) == 5 ? "Passed" : "Not Passed");
		IO.println(binarySearch(arr, 7) == 7 ? "Passed" : "Not Passed");
		IO.println(binarySearch(arr, -2) == -1 ? "Passed" : "Not Passed");
		IO.println(binarySearch(arr, 100) == -1 ? "Passed" : "Not Passed");
		IO.println(binarySearch(arr, 0) == 0 ? "Passed" : "Not Passed");
		IO.println(binarySearch(arr, 10) == 10 ? "Passed" : "Not Passed");
		IO.println(binarySearch(arr, 11) == -1 ? "Passed" : "Not Passed");
	}

}
