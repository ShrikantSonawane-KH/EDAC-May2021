//Q.04

class Pyramid4
{
public static void main(String args[])
{
	for(int i=1; i<=9; i++)
	{
		for(int j=8; j>=i; j--)
		{
	 	System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
	 	System.out.print(k);
		}
		for(int m=i-1; m>=1; m--)
		{
	 	System.out.print(m);
		}
	System.out.println();
	}
}
}
