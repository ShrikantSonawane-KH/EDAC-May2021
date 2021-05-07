//Q.23

import java.util.*;
 
public class BinToHex2
{
	public static void main(String args[]) 
	{
        	int decimal = 0,i=0;
		int rem;
		char[] a = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String s1 ="";
   	
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a Binary Num:");
        	String b1 = sc.nextLine();

       		int n = Integer.parseInt(b1);
        	while(n != 0)								// n=101
		{
            	 decimal += (n%10)*Math.pow(2, i);  					//decimal = (101%10)*2^0 = (1)*2^0 =1 
											//(10%10)*2^1 = 0*2^1=0 
											//(1%10)*2^1 = 1*2^2=4
            	 n = n /10;								// n = 10 // n = 1 //n=0(terminate)
            	 i++;									//i = 1,2 ,3
        	} 

		while (decimal != 0) 
		{
		rem = decimal % 16;
		s1 =  a[rem] + s1;
      		decimal = decimal/ 16;
   		 }
   
      		System.out.println(s1);
    	}
}