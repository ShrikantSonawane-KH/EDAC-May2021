//Q.10

class Pattern10
{
public static void main(String args[])
{
	int A = 64;
	for(int i=5; i>=1; i--)
	{
		for(int j=1 ; j<i ; j++)
		{
		System.out.print(" ");
		}
		for(int k=i; k<=5; k++)
		{
	 	System.out.print((char)(A+k));
		System.out.print(" ");
		}
	 	System.out.println();
	}
}
}
