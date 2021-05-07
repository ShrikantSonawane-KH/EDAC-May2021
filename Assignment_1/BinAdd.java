// Q.17

import java.util.Scanner;
public class BinAdd {
   public static void main(String[] args)
   {
	 
	long b1, b2;
	int i = 0, carry = 0;
	int[] sum = new int[10];
	int rem1,rem2;

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first binary number: ");
	b1 = scanner.nextLong();
	
	System.out.print("Enter second binary number: ");
	b2 = scanner.nextLong();

	while (b1 != 0 || b2 != 0) 					// b1=101 b2=110
	{
		sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);	// 1 iteration : i=0, sum[0] = (1+0+0)%2 = 1, 
									// 2 iteration : i=1, sum[1] = (0+1+0)%2 = 1, 
									// 3 iteration : i=2, sum[2] = (1+1+0)%2 = 0, i=3

		carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);		// 1 iteration : carry = (1+0+0)/2 = 0
									// 2 iteration : carry = (0+1+0)/2 = 0
									// 3 iteration : carry = (1+0+1)/2 = 1

		b1 = b1 / 10;						//1 iteration : b1=10 ,b2=11
		b2 = b2 / 10;						//2 iteration : b1=1 , b2=1
									//2 iteration : b1=0 , b2=0
	}

	if (carry != 0) 
	{
		sum[i++] = carry;					//1 iteration : sum[3]=1; i=4;
	}
	--i;								//1 iteration : i=3,
	System.out.print("Output: ");

	while (i >= 0) 							//1 iteration : i=3,2,1,0
	{
		System.out.print(sum[i--]);				//sum[3]=1 sum[2]=0 sum[1]=1 sum[0]=1			
	}
	System.out.println();  
   }
}