import java.util.*;
public class Exp {

	public static void main(String[] args) {
		System.out.println("enter the x:");
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=0;
		int z=0;
		
		 y = x*x + 3*x - 7;
		System.out.println("Y1 "+ y);			

		 y = x++ + ++x;
		 System.out.println("Y2 "+ y); 
		
		 z = x++ - --y - --x  +  x++;
		 System.out.println("Z1 "+ z);
		
		 boolean a=true,b=true,c=true;
		 c = (a && b) || !(a || b);
		System.out.println("C Boolean : "+ c);

	}
}


/*
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/