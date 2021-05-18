//Q.07

import java.util.*;
class Marks
{
	public static void main(String[] args)
	{
	 //Circle obj = new Circle();	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Marks of 5 Sub:");
	 double m1 = sc.nextDouble();
	 double m2 = sc.nextDouble();
	 double m3 = sc.nextDouble();
	 double m4 = sc.nextDouble();
	 double m5 = sc.nextDouble();
	
	 double Per=((m1+m2+m3+m4+m5)/500)*100;
	 System.out.println("percentage marks = "+Per);
	
	}
}


/*

Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this 
format [ percentage marks = 99 % ]. Use concatenation operator here.

*/