// Q.11

import java.util.*;
class Circle
{
	
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Radius:");
	float R = sc.nextFloat();
	float PI = 3.14f;
	float Area = PI*R*R;
	float Perimeter = 2*PI*R;  
	System.out.println("Area is :"+ Area);
	System.out.println("Perimeter is :"+ Perimeter );	
	
	}
}