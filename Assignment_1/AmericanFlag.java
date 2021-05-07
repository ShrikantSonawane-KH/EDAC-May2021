//Q.14

class AmericanFlag
{
	public static void main(String agrs[])
	{
	for (int i=1;i<=15;i++)
	{	
		if(i<=9)
		{
		if (i%2!=0)
	  	   System.out.println("* * * * * * = = = = = = = = = = = = = = =");
		else if (i%2==0)
		   System.out.println(" * * * * *  = = = = = = = = = = = = = = =");
	
		}
		else 
		     System.out.println("= = = = = = = = = = = = = = = = = = = = =");
		
		} 

	}


}