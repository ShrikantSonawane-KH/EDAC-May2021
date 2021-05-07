//Q.14



class Pyramid14
{

public static void main(String args[])
{
	
	for(int i=1; i<=5; i++)
	{
		for(int k=5; k>i; k--)
		{
	 	System.out.print(" ");
		}
		for(int j=1; j<=i; j++)
		{
		 if(j==i || j==1 || i==5)
		{
		System.out.print("*");
		}
		 else 
		{
		System.out.print(" ");
		}
		System.out.print(" ");

		}
	 	System.out.println();
	}
}
}


/*
    *
   * *
  *   *
 *     *
* * * * *

*/
