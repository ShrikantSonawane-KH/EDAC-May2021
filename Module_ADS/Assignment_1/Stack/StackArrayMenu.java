/*
	undone....


	Stack:  Array  implementation 
	manu driven

*/
import java.util.*;

class StackArrayMenu
{
	private int[] ST; 
	private int size; 
	private int top; 
	
	public StackArrayMenu(int s, int size)
	{	
		this.size = s;
		ST =  new int[size];				
		top = -1;
	}
	
	public void push(int n)
	{
		ST[++top]=n;
	}


	puclic static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		StackArrayMenu e = new StackArrayMenu(5);
		
		
		do
		{
			System.out.printLn("Press --> 1.push 2.pup 3.peek 4.isEmpty 5.isFull");
			
			int choice = sc.nextInt();
			switch (choice)
			{
				case 1 : System.out.printLn("Push element:");
						 e.push(sc.nextInt());
						 break;
						 
				default: System.out.printLn("You made a wrong choice..!!");
						 break;
			
			}
			
		}while(choice !=0 );
		
	}
}