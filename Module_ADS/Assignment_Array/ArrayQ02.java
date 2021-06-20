/*

2. Take an array of 10 elements. Split it into the middle and
store the elements in two different arrays. E.g.-
INITIAL array :
1 2 3 4 5 6 7 8 9 10
After splitting :
Array 1 : 1 2 3 4
5
Array 2 : 6 7 8 9
10


*/

class ArrayQ02
{

public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		int n = (a.length/2);	
			
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		int k=0;
		int l=0;
		for(int i=0; i<a.length ;i++)
		{
			if(i < n)
			{
			a1[k]=a[i];
			k++;
			}
			
			else
			{
			a2[l]=a[i];
			l++;	
			}
		}
		for(int i=0 ; i<k ;i++)
		{
			System.out.print(a1[i]+" ");
			
		}
		System.out.println();
		for(int i=0 ; i<k ;i++)
		{
			System.out.print(a2[i]+" ");
			
		}
		
	}
}