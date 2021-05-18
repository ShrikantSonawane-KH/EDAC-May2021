//Q.06

import java.util.*;
class Circle
{
	 double radius;
	 double PI=3.14;
	 double area;

	 void GetRadius(double x)
	{
	 this.radius = x;
	 System.out.println(radius);
	}
	void GetArea()
	{
	  area=  PI *radius*radius;
	  System.out.println(area);
	}
	 void GetCircum()
	{
	  double C =  2*PI *radius;
	  System.out.println(C);
	}

	public static void main(String[] args)
	{
	 Circle obj = new Circle();	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("radius:");
	 double x = sc.nextDouble();
	 obj.GetRadius(x);
	 obj.GetArea();
	 obj.GetCircum();
	}
}


/*

Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle.

*/