// Q.06

import java.util.*;
class Arithmetic
{
	
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st Num:");
	int a = sc.nextInt();
	System.out.print("Enter 2nd Num:");	
	int b = sc.nextInt();
	int i,j,k,l,m;
	i = a+b;
	j = a-b;
	k = a*b;
	l = a/b;
	k = a * b;
	m = a%b;

	System.out.println("Expected O/P");
	System.out.println(a + "+" + b + "=" + i);
	System.out.println(a + "-" + b + "=" + j);
	System.out.println(a + "*" + b + "=" + k);
	System.out.println(a + "/" + b + "=" + l);
	System.out.println(a + "Mod" + b + "=" + m);
	}
}