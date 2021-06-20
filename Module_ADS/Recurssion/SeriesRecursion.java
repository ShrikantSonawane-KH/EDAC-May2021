/*

1.Print a series of numbers with recursive Java methods

*/

class  Recursion
{
		static int i = 0;
		static void method(int n)
		{
			
			if (i<=n)
			{
				System.out.print(i+" ");
				i++;
				method(n);
			}
		}
}

class SeriesRecursion
{
	public static void main(String[] agrs)
	{
		Recursion.method(20);
	}
 
}