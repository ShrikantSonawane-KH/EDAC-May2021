//Q.04

import java.util.*;
class byteType
{
public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter 2 byte type variable value: ");
	 byte a = sc.nextByte();
	 byte b = sc.nextByte();
	 byte c= (byte)(a+b);
	 System.out.println("Addition: "+ c);
	}
}


/*

Write a program that initializes 2 byte type of variables. 
Add the values of these variables and store in a byte type of variable. 
[Note: primitive down casting is required in this program ] .

*/