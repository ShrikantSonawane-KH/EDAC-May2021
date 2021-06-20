/*
	LinkedList:
	
	* operations 

*/

class LinkedListTest
{
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next=null;	
		}
	}
	
	public void display()
	{
		Node n =head;
		
		while(n!=null)
		{
			int a = n.data;
			System.out.print(a+" --> ");
			n=n.next;
		
		}
	
	}
	
	public static void main(String[] args)
    {
		LinkedListTest l =  new LinkedListTest();
		l.head = new Node(11);								// creating 1st node--> [11 , null]....head pointing to it
		
		Node second = new Node(22);							// creating 2nd node--> [22 , null]				
		
		Node third = new Node(33);							// creating 3rd node--> [33 , null]
	
		l.head.next = second;								// 1st node --> [11 , second]
				
		second.next = third;								// 2nd node --> [22 , third]   & third node --> [33 , null]==last node
	
		l.display();
	
	
	}

}