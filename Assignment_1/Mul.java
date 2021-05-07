// Q.05

import java.util.*;
class Mul
{
	
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st Num:");
	int a = sc.nextInt();
	System.out.print("Enter 2nd Num:");	
	int b = sc.nextInt();
	int c = a * b;
	System.out.println("Expected O/P");
	System.out.println(a + "*" + b + "=" + c);
	}
}