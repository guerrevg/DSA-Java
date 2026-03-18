public class Factorial {

	private int factorialIterative(int n)
	{
		int total = 1;
		
		for (int i = 1; i <= n; i++)
		{
			total *= i;
		}
		return total;
	}
	
	private int factorialRecursive(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		
		return n * factorialRecursive(n - 1);
	}
	
	void main() 
	{
		IO.println(factorialIterative(1) + " -> " + (factorialIterative(1) == 1 ? "Passed" : "Not Passed"));
		IO.println(factorialIterative(2) + " -> " + (factorialIterative(2) == 2 ? "Passed" : "Not Passed"));
		IO.println(factorialIterative(3) + " -> " + (factorialIterative(3) == 6 ? "Passed" : "Not Passed"));
		IO.println(factorialIterative(4) + " -> " + (factorialIterative(4) == 24 ? "Passed" : "Not Passed"));
		IO.println(factorialIterative(5) + " -> " + (factorialIterative(5) == 120 ? "Passed" : "Not Passed"));
		
		IO.println();
		
		IO.println(factorialRecursive(1) + " -> " + (factorialRecursive(1) == 1 ? "Passed" : "Not Passed"));
		IO.println(factorialRecursive(2) + " -> " + (factorialRecursive(2) == 2 ? "Passed" : "Not Passed"));
		IO.println(factorialRecursive(3) + " -> " + (factorialRecursive(3) == 6 ? "Passed" : "Not Passed"));
		IO.println(factorialRecursive(4) + " -> " + (factorialRecursive(4) == 24 ? "Passed" : "Not Passed"));
		IO.println(factorialRecursive(5) + " -> " + (factorialRecursive(5) == 120 ? "Passed" : "Not Passed"));
	}

}
