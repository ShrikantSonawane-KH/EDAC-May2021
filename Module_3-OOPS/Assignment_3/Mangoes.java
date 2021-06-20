/*
Q.02
Make a class named Fruit with a data member to calculate the
number of fruits in a basket. Create two other class named
Apples and Mangoes to calculate the number of apples and
mangoes in the basket. Print the number of fruits of each type
and the total number of fruits in the basket.
*/
import java.util.*;
abstract class fruit
{
	static int sum=0;
	public abstract void cal (int a);
}

class Apples extends fruit
{
	public void cal (int a)
	{	
		sum=sum+a;
	}		

}

class Mangoes extends Apples
{
	public static void main(String[] args)
	{
		
	  Scanner sc = new Scanner(System.in);
	  
	  Apples obj = new Apples();
	  System.out.print("The Apples: ");
	  int a = sc.nextInt();
	  obj.cal(a);
	 
	  System.out.print("The Mangoes: ");
	  int m = sc.nextInt();
	  obj.cal(m);
	  System.out.println("Total Fruits: " + fruit.sum);
	}
		
}
