//Q.15

import java.util.*;

class Marriage 
{
	public static void main(String[] args)
	{
	 System.out.print("Enter Gender & Age of yours: ");
	  Scanner sc = new Scanner(System.in);
	  char G = sc.next().charAt(0);
          int A = sc.nextInt();
		
	  if ((G=='M' || G=='m') && A>21)
		{
			System.out.println("You are eligible for marriage..!");
		}
	
	  else if ((G=='F' || G=='f') && A>18)
		{
			System.out.println("You are eligible for marriage..!");
		}
	  else {System.out.println("You are NOT eligible for marriage..!");}
	    
	}

}



/*

Accept person’s gender (character m for male and f for female), age (integer), 
as input and then check whether person is eligible for marriage or not.

*/
