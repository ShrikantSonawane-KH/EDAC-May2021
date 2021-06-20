/*
	Stack Impelentation :
	1. using array --> static
	2. using LinkedList -->dynamic

	1. using array
	
	functionalities :
	1. push() : Insertion operation
	2. pop() : deletion operation
	3. peek() : give current topmost element
	4. isEmpty() : to check stack is empty or not
	5. isFull() : to check stack is full or not
	
	TOS : top of stack
	TOP : top of position -  position of last inserted element


*/

class Stack
{
	private int[] ST;
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
		if(top>=size-1)
		{
			System.out.println("Stack overflow");
		}
		ST[++top]= n;
	
	}

	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
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

class StackApp
{
	public static void main(String[] args)
	{
		Stack s = new Stack(5);
		
		System.out.println("========push========");
		s.push(10);
		//s.display();
		s.push(20);
		s.display();
		
		System.out.println("========pop========");
		System.out.println("pop():"+ s.pop());
		System.out.println();
		s.display();
	
		System.out.println("========peek========");
		s.push(30);

		System.out.println(s.peek());
		System.out.println();
		s.display();
		System.out.println("=======isFull/isEmpty=========");
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println("isFull: "+s.isFull());
		System.out.println("isEmpty: "+s.isEmpty());
		
		// s.push(50);										//Stack overflow			
		s.display();
		System.out.println("================");
		System.out.println("pop():"+ s.pop());
		System.out.println("pop():"+ s.pop());
		System.out.println("pop():"+ s.pop());
		System.out.println("pop():"+ s.pop());
		System.out.println("pop():"+ s.pop());
		
		System.out.println("isFull: "+s.isFull());
		System.out.println("isEmpty: "+s.isEmpty());
		s.display();
		s.pop();											//stack underflow
		
		
	}

}



/*


    It is called as stack because it behaves like a real-world stack, piles of books, etc.
    
	A Stack is an abstract data type with a pre-defined capacity, which means that it can store the elements of a limited size.
    
	It is a data structure that follows some order to insert and delete the elements, and that order can be LIFO or FILO.

Applications :
 
+Balancing of symbols
+String reversal
+UNDO/REDO
+Recursion
+DFS(Depth First Search)
+Backtracking
+Expression conversion
+Memory management




*/