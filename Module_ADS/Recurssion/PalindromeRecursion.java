/*
	5.A recursive Java palindrome checker

*/

class  Recursion
{		
	static boolean Palindrome(String str, int s , int e)
	{			
		if ( (str.charAt(s)) != (str.charAt(e)) )
		{					
			return false;
		}
		if (s < e+1)
		{
			Palindrome(str, s+1 , e-1);	
		}
		return true;
		}
}

class PalindromeRecursion
{
	public static void main(String[] agrs)
	{
		String name ="shriirhs";
	    int n = name.length();
	
		try {
				
			System.out.print(" Palindrome :" + Recursion.Palindrome(name,0,n-1));
		
		}catch(StringIndexOutOfBoundsException e)									// to handle the empty string 
		{
			System.out.println(" You are provided empty string..!!");
		}
	
	}
 
} 