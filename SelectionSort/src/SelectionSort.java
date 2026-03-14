import java.util.Arrays;

public class SelectionSort {
	
	public void selectionSort(int[] arr)
	{
		
		for (int i = 0; i < arr.length; i++)
		{
			int smallest = arr[i];
			int indexSmallest = i;
			
			for (int j = (i + 1); j < arr.length; j++)
			{
				if (smallest > arr[j])
				{
					smallest = arr[j];
					indexSmallest = j;
				}
			}
			
			int aux = arr[i];
			arr[i] = smallest;
			arr[indexSmallest] = aux;
		}
	}
	
	void main() 
	{
		int[] arr = {5, 2, 8, 4, 7, 9, 0, 1, 2};
		selectionSort(arr);
		IO.print(Arrays.toString(arr));
	}

}
