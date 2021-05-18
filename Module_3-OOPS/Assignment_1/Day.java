//Q.09

import java.util.*;
class Day
{public static void main(String[] args)
	{
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Days:");
	 int days = sc.nextInt();
	 int Year = days/365;
	 int Month = (days%365)/30;
	 int Days = (days%365)%30;
	System.out.println(Year + " "+ Month+ " "+ Days);

	
	}
}


/*

Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now 
convert the entered days into complete years, months and days and print them.

*/