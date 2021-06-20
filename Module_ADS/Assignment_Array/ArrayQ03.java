/*

3. Write a program to shift every element of an array to
circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
1 2 3 4 5

*/

class ArrayQ03
{

public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};	
		
		int n = a.length;
		
		for(int k=0; k<n ;k++)
		{
			
			int temp = a[n-1];
			
			for(int i= n-2; i>=0 ;i--)
			{
				a[i+1]=a[i];
				
			}
			a[0]=temp;
			
			for(int i=0 ; i < n ; i++)
			{
				System.out.print(a[i]+" ");
				
			}
			System.out.println();
		}
	}
}