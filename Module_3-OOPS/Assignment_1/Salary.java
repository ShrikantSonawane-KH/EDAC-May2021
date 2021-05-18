//Q.12

import java.util.*;
class Salary
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the basic salary: ");
	double B = sc.nextInt();
	double HRA;
	 
	double Total,DA;

	if(B<10000)
	{
	 HRA = 0.1*B;			//10% of basic
	 DA = 0.9*B;
  	 Total = B+HRA+DA;
	 System.out.println(Total);
	}

	else if (B>=10000)
	{
	 HRA = 2000;			//98% of basic
	 DA = 0.98*B;
  	 Total = B+HRA+DA;
	 System.out.println(Total);
	}

}
}


/*

In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]

*/