/*
LinkedList: self referencial structure 

	* creating nodes.

*/

class LinkedListDS
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
	
	
	public static void main(String[] args)
    {
		LinkedListDS l =  new LinkedListDS();
		l.head = new Node(11);								// creating 1st node--> [11 , null]....head pointing to it
		
		//System.out.println(l.head);
		
		Node second = new Node(22);							// creating 2nd node--> [22 , null]
		
		//System.out.println(second);							//LinkedListDS$Node@5d22bbb7				
		
		Node third = new Node(33);							// creating 3rd node--> [33 , null]
	
		//System.out.println(third);							//LinkedListDS$Node@5d22bbb7
	
		l.head.next = second;								// 1st node --> [11 , second]
		
		//System.out.println(l.head.next);					//LinkedListDS$Node@5d22bbb7
		
		second.next = third;								// 2nd node --> [22 , third]   & third node --> [33 , null]==last node
	
		//System.out.println(second.next);					//LinkedListDS$Node@5d22bbb7
	
	
	}

}



/*


*Linked List can be defined as collection of objects called nodes that are randomly stored in the memory.
*A node contains two fields i.e. data stored at that particular address and the pointer which contains the address of the next node in the memory.
The last node of the list contains pointer to the null.

Uses of Linked List:

    The list is not required to be contiguously present in the memory. The node can reside any where in the memory and linked together to make a list. This achieves optimized utilization of space.
    list size is limited to the memory size and doesn't need to be declared in advance.
    Empty node can not be present in the linked list.
    We can store values of primitive types or objects in the singly linked list.

Types:

	1. Singly
	2. Doubly
	3. Circular 
	4. Circular doubly 
	
advs:

    1. It allocates the memory dynamically. All the nodes of linked list are non-contiguously stored in the memory and linked together with the help of pointers.
    2. Sizing is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.

Singly linked list or One way chain 	
 
One way chain or singly linked list can be traversed only in one direction. In other words, we can say that each node contains only next pointer, therefore we can not traverse the list in the reverse direction. 


*/