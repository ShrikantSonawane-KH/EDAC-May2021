//Q.05

class Pattern5
{
public static void main(String args[])
{
	int A = 64;
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=i; j++)
		{
	 	System.out.print((char)(A+i) + " ");
		}
	 	System.out.println();
	}
}
}
