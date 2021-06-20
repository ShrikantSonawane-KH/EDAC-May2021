/*
Q.03

We want to calculate the total marks of each student of a class in
Physics,Chemistry and Mathematics and the average marks of
the class. The number of students in the class are entered by the
user. Create a class named Marks with data members for roll
number, name and marks. Create three other classes inheriting
the Marks class, namely Physics, Chemistry and Mathematics,
which are used to define marks in individual subject of each
student. Roll number of each student will be generated
automatically.

*/

import java.util.*;
class marks
{
	int roll_no;		
	String name;
	double p,m,c;
}
class Physics extends marks
{	
	void m1(int n, String id )
	{	
		id=id;
		Scanner sc = new Scanner(System.in);
		double a[] = new double[n];
		System.out.println("=============================");
		System.out.println("Enter the Physics Marks: ");
		double sum =0;
		for(int i=0;i<n;i++)
		{	
			a[i]=sc.nextDouble();
			sum+=a[i];
		}
		double avg = sum/n;
		System.out.println("Phy------->  Total : "+sum+ " avg "+avg );
	}
}
class Chemistry extends marks
{
	void m2(int n,String id)
	{
		id=id;
		Scanner sc = new Scanner(System.in);
		double a[] = new double[n];
		System.out.println("=============================");
		System.out.println("Enter the Chem Marks: ");
		double sum =0;
		for(int i=0;i<n;i++)
		{	
			a[i]=sc.nextDouble();
			sum+=a[i];
		}
		double avg = sum/n;
		System.out.println("Chem------->Total : "+sum+ " avg "+avg );
	}
		
}
class Math extends marks
{

	void m3(int n,String id)
	{
		id=id;
		Scanner sc = new Scanner(System.in);
		double a[] = new double[n];
		System.out.println("=============================");
		System.out.println("Enter the Math Marks: ");
		double sum =0;
		for(int i=0;i<n;i++)
		{	
			a[i]=sc.nextDouble();
			sum+=a[i];
		}
		double avg = sum/n;
		System.out.println("Math-------> Total : "+sum+ " avg "+avg );
	}
	
}

class StudentMarks
{

public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Physics  Student: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Chem  Student: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the Math Student: ");
		int num3 = sc.nextInt();
	
		Physics obj1 = new Physics();
		obj1.m1(num1,"111");
		Chemistry obj2 = new Chemistry();
		obj2.m2(num2,"222");
		Math obj3 = new Math();
		obj3.m3(num3,"333");
		

	}

}