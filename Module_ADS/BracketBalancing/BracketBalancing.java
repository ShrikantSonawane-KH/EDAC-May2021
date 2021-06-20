/*
	 
	Bracket Balancing:
	 
	we say a sequence of brackets is balanced if the following conditions are met:

    It contains no unmatched brackets.
    The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

	{[()]} meets both criteria for being a balanced string
	{[(])} is not balanced
	{{[[(())]]}} meets both criteria for being a balanced string

*/


import java.util.*;

class Stack
{
	public  char[] ST;
	private int size; 
	private int top;
	public static int cnt =0; 
	
	public Stack(int s) 
	{
		this.size = s;
		ST =  new char[size];
		top = -1;
	}
	
	public void push(char n)
	{
		if(top>=size-1)
		{
			System.out.println("Stack overflow");
		}
		ST[++top]= n;
		cnt++;
	}

	public char pop()
	{
		
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		cnt--;
		return ST[top--];
	
	}

	public int peek()
	{
		return ST[top];
	}

	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return (top==(size-1));
	}
	public void display()
	{
		for(int i = size-1 ; i>=0; i--)
		{
			System.out.println(ST[i]);
		}
	}
}

class BracketBalancing
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bracket String: ");
		
		String Brackets = sc.nextLine();
		
		int len =  Brackets.length();
		
		boolean bool = true;
		sc.close();
				
		if(len%2 != 0 )
		{
			System.out.println("Not Balanaced..!!");
		}
		
		Stack s = new Stack(len);
		
		for(char i =0 ; i < len ; i++)
		{			
			char ch = Brackets.charAt(i);
			
			if (ch == '(' || ch == '[' || ch == '{')
            {
        		s.push(ch);
            }
			else if (ch == ')' || ch == ']' || ch == '}')
			{
				char ch1 = s.pop();
				
				switch(ch)
                {
                    case ']':
                        if (ch1 != '[')
							{
								bool = false;
							}
                        break;
                    
                    case '}':
                        if (ch1 != '{')
							{
								bool = false;
							}
                        break;
                    case ')':
                         if (ch1 != '(')
							{
							bool = false;
                            
							}
                        break;
                    default:
                        break;
				}
			}	

		}
		if(s.isEmpty() && bool)
		{
            System.out.println("Balanced...!");
        }
        else
		{
            System.out.println(" NOT Balanced...!");
        }

		
	}
}	
			
			
			