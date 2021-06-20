/*
	LinkedList:  undone
	
	*variation
	* by making head of Node class

*/

class Node
	{
		Node head;
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next=null;	
		}
	}


class LinkedListTest1
{
	//Node head;
	
	public void display(Node head)
	{
		Node n = head;
		
		while(n!=null)
		{
			int a = n.data;
			System.out.print(a+" --> ");
			n=n.next;
		
		}
	
	}
	
	public static void main(String[] args)
    {
		LinkedListTest1 l =  new LinkedListTest1();
		//l.head = new Node(11);								// creating 1st node--> [11 , null]....head pointing to it
		
		Node n = new Node(11);
		
		n.head = n;
		
		Node second = new Node(22);							// creating 2nd node--> [22 , null]				
		
		Node third = new Node(33);							// creating 3rd node--> [33 , null]
	
		n.head.next = second;								// 1st node --> [11 , second]
				
		second.next = third;								// 2nd node --> [22 , third]   & third node --> [33 , null]==last node
	
		l.display(n.head);
	
	
	}

}








 /*

class LinkedListTest1
{
	//Node head;
	
	static class Node
	{
		Node head;
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next=null;	
		}
	}
	
	public void display(Node head)
	{
		Node n = head;
		
		while(n!=null)
		{
			int a = n.data;
			System.out.print(a+" --> ");
			n=n.next;
		
		}
	
	}
	
	public static void main(String[] args)
    {
		LinkedListTest1 l =  new LinkedListTest1();
		//l.head = new Node(11);								// creating 1st node--> [11 , null]....head pointing to it
		
		Node n = new Node(11);
		
		n.head = n;
		
		Node second = new Node(22);							// creating 2nd node--> [22 , null]				
		
		Node third = new Node(33);							// creating 3rd node--> [33 , null]
	
		n.head.next = second;								// 1st node --> [11 , second]
				
		second.next = third;								// 2nd node --> [22 , third]   & third node --> [33 , null]==last node
	
		l.display(n.head);
	
	
	}

}

*/