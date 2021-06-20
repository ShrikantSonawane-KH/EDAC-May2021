/*
Q05

Create a class named Shape with a function that prints "This is a
shape". Create another class named Polygon inheriting the Shape
class with the same function that prints "Polygon is a shape".
Create two other classes named Rectangle and Triangle having
the same function which prints "Rectangle is a polygon" and
"Triangle is a polygon" respectively. Again, make another class
named Square having the same function which prints "Square is a
rectangle".
Now, try calling the function by the object of each of these
classes

*/


class Shape
{
	void print()
	{
		System.out.println("This is a shape");
	}
}
class Polygon extends Shape
{
	void print()
	{
		System.out.println("Polygon is a shape");
	}	
}

class Rectangle
{
	void print()
	{
		System.out.println("Rectangle is a polygon");
	}
}
class Triangle
{
	void print()
	{
		System.out.println("Triangle is a polygon");
	}

}

class Square
{
	void print()
	{
		System.out.println("Square is a rectangle");
	}
} 

public class MainShapeR
{
	public static void main(String[] args)
	{
		Shape obj1=new Shape();
		obj1.print();
		System.out.println("#########################");
		Polygon obj2=new Polygon();
		obj2.print();
		System.out.println("#########################");
		Rectangle obj3=new Rectangle();
		obj3.print();
		System.out.println("#########################");
		Triangle obj5=new Triangle();
		obj5.print();
		System.out.println("#########################");
		Square obj6=new Square();
		obj6.print();
	}

}




