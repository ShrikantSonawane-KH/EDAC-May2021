//Q.13

import java.util.*;

class Greater3
{

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter num1:");
	int num1 = sc.nextInt();
	System.out.print("Enter num2:");
	int num2 = sc.nextInt(); 
	System.out.print("Enter num3:");
	int num3 = sc.nextInt(); 	
	if(num1>num2)
	{
		if(num1>num3)
		{
		  System.out.println("Great is :"+ num1);
		}
		else
		{
		  System.out.println("Great is :"+ num3);
		}

	}

	else 
	{
		if(num2>num3)
		{
		  System.out.println("Great is :"+ num2);
		}
		else
		{
		  System.out.println("Great is :"+ num3);
		}

	}
} 
}


/*

//BY Ternary Operator

import java.util.*;

class Greater3
{

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter num1:");
	int num1 = sc.nextInt();
	System.out.print("Enter num2:");
	int num2 = sc.nextInt(); 
	System.out.print("Enter num3:");
	int num3 = sc.nextInt(); 	
	int gr = (num1<num2) ? ( (num2>num3) ?  num2 : num3 ) : ( (num1>num3) ? num1 : num3 );

	System.out.println("Great is :"+ gr);
} 
}
*/



/*

Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator ( logical operator) ] 
*/