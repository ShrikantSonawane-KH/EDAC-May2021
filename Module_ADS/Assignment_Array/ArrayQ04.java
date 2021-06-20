/*

4. Write a program to find all pairs on an integer array whose sum
is equal to a given number?
Eg :
Input : 1 2 4 5 3 6 3 7
Output: 3, 3 and 4, 2
6,1 and 4 , 3 and 2,5

*/

class ArrayQ04
{

public static void main(String[] args)
	{
		int[] a = {1,2,4,5,3,6,3,7};	
		int n = a.length;
		int sum = 6;
	
	    System.out.println("===================== sum=6 ========================");
		for(int i= 0; i<n ;i++)
		{
			for(int j=i+1; j<n-1 ;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.print(a[i]+","+a[j]+" & ");	
				}
			}			
		}
		System.out.println();
		
		System.out.println("=====================to remove the duplicates=========================");
		
		for(int i= 0; i< n-1 ;i++)							//sorting
		{
			for(int j=i+1; j< n ;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		
		int[] temp = new int[n];
		int k = 0;
		
		for(int i= 0; i < n-1 ;i++)							//sorting
		{
				if(a[i]!=a[i+1])
				{
					temp[k++]=a[i];
				}
				temp[k]= a[n-1];							// to insert last remaining element
		}
		
		for(int i= 0; i < n ;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i= 0; i <= k ;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		System.out.println("=====================sum=7=========================");
		
		sum=7;
		
		for(int i= 0; i <= k ;i++)
		{
			for(int j=i+1; j< k-1 ;j++)
			{
				if(temp[i]+temp[j]==sum)
				{
					System.out.print(temp[i]+","+temp[j]+" & ");	
				}
			}			
		}	

		
	}
}


