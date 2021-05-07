// Q.25


import java.util.*;
 
public class OctToDec
{
	public static void main(String args[]) 
	{
        	int octal = 0, i=0;
   	
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a octal Num:");
        	String o1 = sc.nextLine();

       		int n = Integer.parseInt(o1);
         	// System.out.println(num);
        	while(n != 0)								// n=101
		{
            	 octal += (n%10)*Math.pow(8, i);  					//decimal = (101%10)*2^0 = (1)*2^0 =1 
											//(10%10)*2^1 = 0*2^1=0 
											//(1%10)*2^1 = 1*2^2=4
            	 n = n /10;								// n = 10 // n = 1 //n=0(terminate)
            	 i++;									//i = 1,2 ,3
        	} 
   
      		System.out.println("Decimal Number : "+ octal);
    	}
}