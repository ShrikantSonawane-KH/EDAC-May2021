/*
	LinkedList:
	A linked list is also a collection of elements, but the elements are not stored in a consecutive location.
	
	* operations  : insertion, deletion. 

*type
    Singly Linked List
    Circular Linked List			
    Doubly Linked List
    Circular Doubly Linked List		-->remain

Implement : to delete last 2 nodes
[hint: while(temp.next.next!=null){temp=temp.next}--> rest logic]


+One way chain or singly linked list can be traversed only in one direction. 
*/

class LinkedListInsertion
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
		Node n = head;
		
		while(n!=null)											//check	 by  node	
		{
			int a = n.data;
			System.out.print(a+" --> ");
			n=n.next;
		
		}
	
	}
	
	public void insertFirst(int data)
	{
		Node First_node = new Node(data);
		
		First_node.next = head;
		
		head = First_node;									// make head of newly added node
		
	}
	
	public void append(int data)
	{
		Node Last_node = new Node(data);
		if(head == null)
		{
			head =  new Node(data);
			return;
		}
		//Last_node.next=null;								// optional								// to make last node null --> use in display()
		Node n = head;
		//System.out.println(head.data);
		while (n.next != null)								// check by node address
		{
			n = n.next;
		}
		n.next = Last_node;
	}
	
	public void insertAfter(Node prev_node , int data)
	{
		if(prev_node == null)
		{
			System.out.println("Sorry..! given node is null");
			
		}
		Node inbetween = new Node(data);
		Node q = prev_node.next;
		prev_node.next = inbetween;
		inbetween.next = q;
	}
	
	
	public void delete(int key)
	{
		Node temp = head;
		Node prev_node=null;
		
		if(head.data==key)
		{
			head = head.next;
			return;															// if we tried to delete the 1st node and (without return) control goes to last (prev_node.next = temp.next;) and it will through the java.lang.NullPointerException.
		}
		
		
		while(temp != null && temp.data != key)
		{
			prev_node = temp;
			temp = temp.next;
		}
		
		prev_node.next = temp.next;
		
	}
	
	public void deleteByposition(int pos)
	{
		Node temp = head;
		
		if (pos == 0)
		{
			head = head.next;
			return;
		}
		
		for(int i = 0 ; temp != null && i < pos-1;i++)						// goes up to the position.-->pos-1 because we starting from head
		{
			temp = temp.next;
			
		}
		Node n = temp.next.next;
		temp.next = n;
	}
	
	public void reverse()
	{
		Node temp =null;
		Node prev = null;
		Node curr = head;
		
		while(curr != null)
		{
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			
		}
		head = prev;
	}
	
	public void tofindMid()
	{
		Node temp = head;
		int cnt = 0;
		
		while(temp!=null)
		{
			temp = temp.next;
			cnt++;
		}
		System.out.println();
		System.out.println(" Mid Node: "+cnt/2);
		
		Node n = head;
	
		for (int i=1 ; i<cnt/2 ;i++)
		{
			n = n.next;
		}
		System.out.println(" data at mid "+n.data);
	}	
			
	
	public static void main(String[] args)
    {
		LinkedListInsertion l =  new LinkedListInsertion();
		l.head = new Node(11);												// creating 1st node--> [11 , null]....head pointing to it
		
		Node second = new Node(22);											// creating 2nd node--> [22 , null]				
		
		Node third = new Node(33);											// creating 3rd node--> [33 , null]
	
		l.head.next = second;												// 1st node --> [11 , second]
				
		second.next = third;												// 2nd node --> [22 , third]   & third node --> [33 , null]==last node
	
		System.out.println("================insert at very first position===================");
		System.out.println("Befor insertion: ");
		l.display();
		
		l.insertFirst(197);
		
		System.out.println();
		System.out.println("After 1st insertion: ");
		l.display();
	
		System.out.println();
		System.out.println("================insert at very last position===================");
		
		l.append(1000);
		
		l.display();
		
		System.out.println();
		System.out.println("================insert between===================");
		
		l.insertAfter(l.head.next,200);										// add after 2nd nade. 197 --> 11 --> 200 --> 22 --> 33 --> 1000 -->
		//l.insertAfter(l.head.next.next,200);								// add after 3rd node. 197 --> 11 --> 22 --> 200 --> 33 --> 1000 -->
		l.display();
		
		System.out.println();
		System.out.println("================Delete by key===================");
		
		l.delete(197);
		l.delete(22);
		
		l.append(40);
		l.append(50);
		//l.display();
		
		l.delete(50);
		l.display();
		
		System.out.println();
		System.out.println("================Delete by position===================");
		l.deleteByposition(2);
		l.display();
		
		System.out.println();
		System.out.println("================reverse the list===================");
	
		l.reverse();
		l.display();

		System.out.println();
		System.out.println("================Mid position===================");
	
		l.insertFirst(777);
		//l.insertFirst(888);
		l.display();
		l.tofindMid();
	
	}

}





/*

+Advantages of using a Linked list over Array

+Dynamic data structure
+Insertion and Deletion
+Memory efficient
+Implementation

+Disadvantages of Linked list

+Memory usage

The node in a linked list occupies more memory than array as each node occupies two types of variables,

+Traversal
In a linked list, the traversal is not easy. If we want to access the element in a linked list, we cannot access the element randomly, but in the case of an array, we can randomly access the element by index.

+everse traversing
In a linked list, backtracking or reverse traversing is difficult. In a doubly linked list, it is easier but requires more memory to store the back pointer.

+Applications of Linked List

+Stack, Queue, tree and various other data structures can be implemented using a linked list.
+To implement hashing, we require hash tables. The hash table contains entries that are implemented using linked list.

+A linked list can be used to implement dynamic memory allocation. The dynamic memory allocation is the memory allocation done at the run-time.
++







*/