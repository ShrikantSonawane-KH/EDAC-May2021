/*

2.Sum a series of numbers with Java recursion

*/

class  Recursion
{
		static int i = 0;
		static int sum=0;
		
		static int method(int n)
		{
			if (i<=n)
			{	
				
				
				
				sum = sum + i;
				i++;
				System.out.println("i "+ i);
				System.out.println("sum "+ sum);
				method(n);
			}
			
			return sum;
		}
}

class SeriesSumRecursion
{
	public static void main(String[] agrs)
	{
		System.out.print(Recursion.method(5));
		
	}
 
}