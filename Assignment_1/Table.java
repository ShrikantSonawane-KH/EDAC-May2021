// Q.10

import java.util.*;
class Table
{
	
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Num:");
	int a = sc.nextInt();
	//System.out.println(int a = sc.nextInt());

	for(int i=1; i<=10; i++)
	{
	int c = a*i;
	System.out.println(a + "*" + i + "=" + c);
	}
}
}

