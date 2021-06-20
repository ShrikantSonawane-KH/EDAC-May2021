/*
	Linear Search: 

linearly searching key in array.If key is present then return its location, otherwise return false,


*/

import java.util.*;

class LinearSearch
{
	static int key,size; 
		
	public static boolean Search(int[] x, int y, int len)
	{
		key = y;
		size = len;
		
		for(int i =0 ; i < x.length;i++ )
		{
			if(x[i]== key)
			{
				System.out.println("Index: "+i);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {2,45,3,45,78,64,85,22,14,54};  						//duplicate not handled ---> sort ---> duplicate remove																	
			
		int key = 78;
		
		int len = arr.length;
		
		boolean res = Search(arr,key,len);
		
		if(res)
		{
			System.out.println("Congo....! found");
			
		}
		else{
			System.out.println("Sorry....! try another");
		}
	}
}