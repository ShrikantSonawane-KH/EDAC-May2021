// Q.21

import java.util.Scanner;
public class DecToOct 
{
   public static void main(String[] args)
   {	 
	int rem;
	char[] a = {'0','1','2','3','4','5','6','7'};
	String s1 ="";

	System.out.print("Enter Decimal number: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	while (n!=0) 					
	{
		rem=n%8;			// n = 49-->rem = 49%8 =1 // n=6-->rem = 6%8 =6	
		s1 =  a[rem] + s1;		// s1 = a[1]+0 = 1 // s1 = a[6]+0 = 6			
		n=n/8;				// n=49/8 =6 // n=6/8 = 0)(terminate)
	}											
	
	System.out.print(s1);
	
  }
}