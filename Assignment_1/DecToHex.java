// Q.20

import java.util.Scanner;
public class DecToHex 
{
   public static void main(String[] args)
   {	 
	int rem;
	char[] a = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	String s1 ="";

	System.out.print("Enter Decimal number: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	while (n!=0) 					
	{
		rem=n%16;			// n = 49-->rem = 49%16 =1 // n=3-->rem = 3%16 =3	
		s1 =  a[rem] + s1;		// s1 = a[1]+0 = 1 // s1 = a[3]+0 = 3			
		n=n/16;				// n=49/16 =3 // n=3/16 = 0 
	}											
	
	System.out.print(s1);
	
  }
}