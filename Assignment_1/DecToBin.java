// Q.19

import java.util.Scanner;
public class DecToBin 
{
   public static void main(String[] args)
   {	 
	System.out.print("Enter Decimal number: ");

	Scanner sc = new Scanner(System.in);

	int n, rem, binary=0,i=1;
	
	n = sc.nextInt();

	while (n!=0) 					//n = 12
	{
		rem=n%2;				// rem=0, rem=0, rem=1	, 1
		n=n/2;					// 6 , 3 , 1,  0
		binary = binary + rem*i;		// 0,  0,  100,1100
		i=i*10;					// 10, 100,1000			
	}
	System.out.print(binary);			// 0 , 10 , 100 , 1100							
   }
}

