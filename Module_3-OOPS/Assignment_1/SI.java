//Q.08

import java.util.*;
class SI
{public static void main(String[] args)
	{
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the amount, Rate of Interest, Time Period of the Loan/Deposit in years:");
	 double P = sc.nextDouble();
	 double R = sc.nextDouble();
	 double T = sc.nextDouble();
	 double S = (P * R * T) /100;
	 
	 System.out.println("Simple Interest ="+S);
	
	}
}


/*

Write a program to find the simple interest. Take the principle amount, 
rate of interest and time from user using Scanner class.

Simple Interest= (P * R * T) /100;

*/