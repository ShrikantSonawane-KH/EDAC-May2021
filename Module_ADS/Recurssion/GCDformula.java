/*

	HW  :  GCD formula 
	[ for n = 3 :  gcd(a,gcd(b,c) ]
	[for n = 5 :  gcd(a,gcd(b, gcd(c, gcd(d,e)) ]

*/



class Recursion
{
	static String method(int n) 
	{
		if (n==0)
			return "Enter valid num..!";
		
		if (n==1)
			return "int";
			
		return "gcd(int,"+method(n-1) +")";
	
	}
}

class GCDformula
{
	public static void main(String[] args) 
	{ 

		System.out.println(Recursion.method(10));
		
	}
}