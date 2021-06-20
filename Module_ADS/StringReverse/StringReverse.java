/*

	String reverse : using stack


*/

class Stack
{
	int[] ST; 
	private int size; 
	private int top; 

	public Stack(int s) 
	{
		this.size = s;
		ST =  new int[size];
		top = -1;
	}
	
	public void push(int n)
	{
		ST[++top]= n;
	
	}

	public int pop()
	{
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

public class StringReverse
{	
		
	public static void reverse(StringBuffer str)
	{
		int len = str.length();
		Stack s = new Stack(len);
		
		for(int i=0 ; i<len ;i++)
		{
			s.push(str.charAt(i));
		}
		
	    for(int i=0 ; i<len ;i++)
		{
			char r = (char)s.pop();
			str.setCharAt(i,r);
		}

	}

	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Shrikant Sonawane");

		reverse(s);
		System.out.println("Reverse String   :  "+s);
	}

}

