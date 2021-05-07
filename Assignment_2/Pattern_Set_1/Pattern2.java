//Q.02

class Pattern2
{
public static void main(String args[])
{
	int A = 64;			// A-Z-->65 to 90
	for(int i=1; i<=5; i++)		// a to z --> 97 to 122
	{
		for(int j=1; j<=i; j++)
		{
	 	System.out.print((char)(A+j));
		}
	 	System.out.println();
	}
}
}


/*

A
AB
ABC
ABCD
ABCDE

*/