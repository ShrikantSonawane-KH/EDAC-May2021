/*

*/

import java.util.*;
class RecFact
{
	int facto=1;
	
	int  fact(int n )
		{
			if(n>=1) 
			{
				 facto = n * fact(n-1);
				
			}
			return facto;
		}
	public static void main(String[] args)
	{
		
		RecFact r = new  RecFact();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		
		int num = sc.nextInt();
		
		int res = r.fact(num);
		
		System.out.print(res);
	}

}