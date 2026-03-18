import java.util.Arrays;
import java.util.HashMap;

public class TwoSum 
{
	private int[] twoSumBruteForce(int[] arr, int target)
	{
		int len = arr.length;
		for (int i = 0; i < len; ++i)
		{
			for (int j = i + 1; j < len; ++j)
			{
				if (arr[i] + arr[j] == target)
				{
					return new int[] {i, j};
				}
			}
		}
		
		return new int[] {};
	}
	
	private int[] twoSum(int[] arr, int target) 										
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		int len = arr.length;
		
		for (int i = 0; i < len; ++i)
		{
			hm.put(arr[i], i);
		}
		
		for (int i = 0; i < len; ++i)
		{
			int complement = target - arr[i];
			if (hm.containsKey(complement) && hm.get(complement) != i)
			{
				return new int[] {i, hm.get(complement)};
			}
		}
		
		return new int[] {};
	}
	
	void main()
	{
		IO.println(Arrays.toString(twoSumBruteForce(new int[] {2, 7, 11, 15}, 9)));
		IO.println(Arrays.toString(twoSumBruteForce(new int[] {1, 2, 3, 4, 5}, 6)));
		IO.println(Arrays.toString(twoSumBruteForce(new int[] {3, 3}, 6)));
		IO.println(Arrays.toString(twoSumBruteForce(new int[] {100, 200, 300, 400}, 500)));
		IO.println(Arrays.toString(twoSumBruteForce(new int[] {0, 0}, 500)));
		
		int[] bigArr = new int[1000];
		for (int i = 0; i < bigArr.length; ++i)
		{
			bigArr[i] = i;
		}
		
		IO.println(Arrays.toString(twoSumBruteForce(bigArr, 1001)));
		
		IO.println("=".repeat(10));
		
		// two sum with hashmap
		IO.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));
		IO.println(Arrays.toString(twoSum(new int[] {1, 2, 3, 4, 5}, 6)));
		IO.println(Arrays.toString(twoSum(new int[] {3, 3}, 6)));
		IO.println(Arrays.toString(twoSum(new int[] {100, 200, 300, 400}, 500)));
		IO.println(Arrays.toString(twoSum(new int[] {0, 0}, 500)));
		IO.println(Arrays.toString(twoSum(bigArr, 1001)));
		IO.println(Arrays.toString(twoSum(new int[] {3, 3, 4, 5, 6}, 6)));
		IO.println(Arrays.toString(twoSum(new int[] {1, -3, 1, -3, 4}, -6)));
		IO.println(Arrays.toString(twoSum(new int[] {3, 2, 4}, 6)));
	}
}
