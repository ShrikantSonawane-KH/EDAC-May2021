/*

1. If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50,
60], your program should be able to find that the
subarray lies between the indexes 3 and 8.
Output: 30,25,40,32,31,35


*/

class ArrayQ01
{

public static void main(String[] args)
	{
		int[] a = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50,60};
		int k = 0;
		int[] subA = new int[6];						
		for(int i=3 ; i<=8 ;i++)
		{
			
			subA[k]=a[i];
			k++;
		}
		for(int i=0 ; i<k ;i++)
		{
			System.out.print(subA[i]+" ");
			
		}
	}
}