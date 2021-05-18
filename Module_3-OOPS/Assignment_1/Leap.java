import java.util.*;

class Leap
{

public static void main(String[] args)
{
	System.out.print("enter Year: ");
	Scanner sc = new Scanner(System.in);
	int Y = sc.nextInt();

	if (((Y%4==0) && (Y%100!=0)) || (Y%400==0))
	{
	 System.out.print("Leap Year: "+ Y ); 
	
	}
	else
	{ 
	 System.out.print("NOT Leap Year: "+ Y );
	}
} 
}



