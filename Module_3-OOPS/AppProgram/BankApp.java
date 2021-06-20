/*
Q06

All the banks operating in India are controlled by RBI. RBI has
set a well defined guideline (e.g. minimum interest rate,
minimum balance allowed, maximum withdrawal limit etc)
which all banks must follow. For example, suppose RBI has set
minimum interest rate applicable to a saving bank account to be
4% annually; however, banks are free to use 4% interest rate or to
set any rates above it.
Write a program to implement bank functionality in the above
scenario. Note: Create few classes namely Customer, Account,
RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc).
Assume and implement required member variables and functions
in each class.

*/

import java.util.*;
class RBI
{
	String name;
	int AccNo ;
	int Cust_id;
	String IFSC ;
	int with_amount;
	double balance = 50000;

	double interest_rate;
	int Wid_limit;

	double getInterest()
	 {
		interest_rate = 0.04d;
		return interest_rate;
	 }
	double getWidLimit(int val) 
	{
		if(val<20000)
		{
           		this.balance -= val;
		return this.balance;
		}
		else
		{
			System.out.println("Amount exceeded limit.......!!");
			return this.balance;
		}
	 }	
	
	double Credit(int val)
	{
		this.balance +=val;
		return this.balance;
	}
}

class ICICI extends RBI
{
	ICICI(){}
	ICICI(String name,int AccNo,int Cust_id,String IFSC)
	{
		this.name=name;
		this.AccNo=AccNo;
		this.Cust_id=Cust_id;
		this.IFSC = IFSC;
		System.out.println(" Details: "+name+" "+AccNo+" "+ Cust_id+" "+ IFSC);
	} 					
}
class SBI extends RBI
{
	SBI(){}
	SBI(String name,int AccNo,int Cust_id,String IFSC)
	{
		this.name=name;
		this.AccNo=AccNo;
		this.Cust_id=Cust_id;
		this.IFSC = IFSC;
		//this.with_amount=with_amount;
		System.out.println(" Details: "+name+" "+AccNo+" "+ Cust_id+" "+ IFSC);
	}
}

class BankApp
{
	public static void main(String[] args)
	{
		BankApp bank = new BankApp();
		bank.getDetails();		
	}
	
	void getDetails()
	{	
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Acc_type SBI or ICICI : "); 
		String Acc_type = sc.nextLine();
		String s1="ICICI";
		String s2="SBI";
        sc.close();
		if(Acc_type.equals(s1))
		{
		goICICI();
		}
		else if(Acc_type.equals(s2))
		{
		goSBI();
		}
	}		
	
	void goICICI()	
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter name , AccNo, Cust_id, IFSC : ");
		String name = sc.nextLine();
		int AccNo = sc.nextInt();
		int Cust_id = sc.nextInt();
		String s1 =  sc.nextLine();
		String IFSC = sc.nextLine();
		ICICI obj = new ICICI(name,AccNo,Cust_id,IFSC);		
		
		ICICI icici=new ICICI();
		System.out.print("Choose --: Enter 1 to credit & 2 to debit:-->");
		int choice = sc.nextInt();
		if(choice==2)
		{
		System.out.print("Enter Amount to withdrow:  ");
		int with_amount = sc.nextInt(); 
		
		double bal = icici.getWidLimit(with_amount);
		double interest = icici.getInterest();
		System.out.println("=================================");
		System.out.println("Total balance is :"+ bal+  " Bank basic interest: "+ interest);
		System.out.println("=================================");
		}
		else if (choice == 1 ) 
		{
		System.out.print("Enter Amount to Credit:  ");
		int amount = sc.nextInt(); 
		double credit = icici.Credit(amount);
		double interest = icici.getInterest();
		System.out.println("=================================");
		System.out.println("Total balance is :"+ credit+  " Bank basic interest: "+ interest);
		System.out.println("=================================");
		}
	}
	void goSBI()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter name , AccNo, Cust_id, IFSC: ");
		String name = sc.nextLine();
		int AccNo = sc.nextInt();
		int Cust_id = sc.nextInt();
		String s1 =  sc.nextLine();
		String IFSC = sc.nextLine();
		SBI obj =new SBI(name,AccNo,Cust_id,IFSC);
		
		SBI sbi = new SBI();
		System.out.print("Choose --: Enter 1 to credit & 2 to debit:-->");
		int choice = sc.nextInt();
		if(choice==2)
		{
		System.out.print("Enter Amount to withdrow:  ");
		int with_amount = sc.nextInt(); 
		double bal = sbi.getWidLimit(with_amount);
		double interest = sbi.getInterest();
		System.out.println("=================================");
		System.out.println("Total balance is :"+ bal+  " Bank basic interest: "+ interest);
		System.out.println("=================================");
		}

		else if (choice == 1 ) 
		{
		System.out.print("Enter Amount to Credit:  ");
		int amount = sc.nextInt(); 
		double credit = sbi.Credit(amount);
		double interest = sbi.getInterest();
		System.out.println("=================================");
		System.out.println("Total balance is :"+ credit+  " Bank basic interest: "+ interest);
		System.out.println("=================================");
		}
	}	
}