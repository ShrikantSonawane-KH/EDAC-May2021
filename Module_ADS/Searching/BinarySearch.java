/*
	Binary Search:
	1. the given array should be sorted.
	

*/

class BinarySearch
{
	static int key; 
		
	public static int Search(int[] x, int y, int LB,int UB)
	{
		key = y;

		if(UB>=LB)
		{
			int mid = (LB+UB)/2;
			
			if(x[mid]==key)
			{
				return mid;
			}
				
			if( key < x[mid])
			{
				return Search(x, y, LB, (mid-1));
				
			}
			return Search(x, y,  (mid+1), UB);
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11};  						 
			
		int key = 12;
		
		int len = arr.length;
		
		int LB =0;
		
		int UB = len-1;
		
		int res = Search(arr,key, LB,UB);
		
		if(res == -1)
		{
			System.out.println("Sorry....! try another");
		}
		else
		{
			System.out.println("Congo....! found");
		}
	}
}