/*

	Doubly Linklist : Operations

+doubly linked list overcome one way traverse limitation of singly linked list.

	*Insertion
	1) At the front of the DLL 
	2) After a given node. 
	3) At the end of the DLL 
	4) Before a given node
	
	*Deletion
	1) delete by data(key)  
	2) delete by position 
	

*/

class DoublyLL
{
	Node head;
	
 	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			prev = null;
			next = null;
		}
	}
	
	public void insertFirst(int data)
	{
		Node First_node = new Node(data);
		
		First_node.next = head;							// bcz we dont know the head is atually pointing to node or not.
		First_node.prev = null;							// optional
		
		if(head != null)
		{
			head.prev = First_node;						//First_node.next...?--> working fine 
		}
		
		head = First_node;								// changed the head.
		
	}
	
	public void append(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			return;
		}
		
		Node n = head;
		while(n.next != null)
		{
			n=n.next;
		}
		
		Node Last_node = new Node(data);
		
		n.next = Last_node;
		Last_node.next=null;
		
		Last_node.prev = n;
		
	}
	
	public void insertAfter(Node prev_node, int data)
	{
		
		if(prev_node == null)
		{
			System.out.println("Sorry..!insertion not possible.");
			return;
		}
		else if (prev_node.next == null)										// if we gave the head as a argument
		{
			append(data);
			return;		
		}
		
		Node new_node = new Node(data);
		
		new_node.next = prev_node.next;
		prev_node.next.prev =  new_node;
		new_node.prev = prev_node;
		prev_node.next = new_node;
		
		if(new_node.next != null)
		{
			new_node.next.prev =  new_node;
		}
		
	}
	
	public void insertBefore(Node next_node , int data)
	{
		if(next_node == null )											
		{
			System.out.println("Sorry..!insertion not possible.");
			return;
		}
		else if (next_node.prev == null)										// if we gave the head as a argument
		{
			insertFirst(data);
			return;
			
		}
		Node  new_node = new Node(data);
		
		new_node.next = next_node; 
		new_node.prev = next_node.prev;
		next_node.prev.next = new_node;
		
		if(new_node.next != null)
		{
			new_node.next.prev = new_node;
		}
		
	}
	
	public void disply()
	{
		Node n = head;
		
		while (n != null)
		{
			int a = n.data;
			System.out.print(" <- "+a+" -> ");			
			n = n.next;
		}	
	}
	
	public void insertPos(int pos , int data)
	{
		if(pos > 0)
		{
			if(pos ==1)
			{
				insertFirst(data);
				
			}
			else
			{
				try{
				Node temp=head;
				for(int i= 2 ; i<=pos;i++)
				{
					temp = temp.next;
				}
				insertAfter(temp, data);
				}catch(NullPointerException e)
				{System.out.println("Out of Bound");}
			}
		}
		else
		{
			System.out.println("Enter valid position");
		}
	}
	
	public void delete(int key)
	{
		
		if (head.data == key )
		{
			head = head.next;
			return;
		}
		
		Node temp = head;
		Node prev_node = null;
		
			while (temp !=null && temp.data != key)
			{
				prev_node = temp;
				temp = temp.next;
			}
			if(temp==null)
			{	
				System.out.println("KEY NOT FOUND..!");
				return;
			}
			prev_node.next = temp.next;
			temp.next.prev = prev_node;
	}
	
	public void deleteByPos(int pos)
	{
		 if(pos>0)
		 {
			 if(pos==1)
			 {
				 head = head.next;
				 return;
			 }
			 else
			 {
				 try{
				 Node temp = head;
				 for(int i=2;i<pos; i++)
				 {
					 temp = temp.next;
				 }
				 
				 temp.next = temp.next.next;
				 temp.next.next.prev = temp; 
				 }catch(NullPointerException e)
				{System.out.println("Out of Bound");}
			}
		 }
		 else
		 {
			System.out.println("Enter valid position"); 
		 }	
	}
	
	public void toSearch(int key)
	{
		Node temp = head;
		int cnt = 1;
		while (temp != null && temp.data != key)
			{
				temp = temp.next;
				cnt++;
			}
			if(temp==null)
			{	
				System.out.println("KEY NOT FOUND..!");
				return;
			}
			else
			{
				System.out.println("KEY FOUND..! at position: " + cnt);
			}
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
	
	public void toFindOddEven()
	{
		Node n = head ;
		Node m = head ;
		int cnt1 = 1 ;
		int cnt2 = 1;
		while(n!=null)
		{
			if(cnt1 % 2 == 1)
				System.out.print("Odd pos : "+n.data+" ");
			
			n=n.next;
			cnt1++;
		}

		System.out.println();
		while(m != null)
		{			
			if (cnt2 % 2 == 0)
			{
				System.out.print("Even pos : "+m.data+" ");
			}
			m=m.next;
			cnt2++;				 
		}	
	}

	public static void main(String[] args)
	{
		DoublyLL d = new DoublyLL();
		
		d.head = new Node(10);
		
		Node second = new Node(20);
		
		d.head.next = second;
		
		Node third = new Node(30);
		
		second.next = third;
		
		System.out.println("==============Insertion at first==============");
		
		d.insertFirst(-100);
		d.insertFirst(200);
		
		d.disply();
		
		System.out.println();
		System.out.println("==============Insert after=============");
		d.insertAfter(d.head.next, 500);
		d.insertAfter(d.head.next.next, 600);
		d.disply();
		
		// inserting at last.
		System.out.println();
		d.insertAfter(d.head.next.next.next.next.next.next, 1111);							// if we gave the last position to insertAfter.
		d.disply();
		
		System.out.println();
		System.out.println("==============append=============");
		
		d.append(800);
		d.append(900);
		d.disply();
		
		System.out.println();
		System.out.println("==============Insert before=============");
		
		d.insertBefore(d.head.next.next.next, 7000);
		d.insertBefore(d.head, 9000);									
		d.disply();
			
		System.out.println();
		System.out.println("==============Insert by position =============");
			
		//d.insertPos(20,400);												//out of bound
		d.insertPos(1,400);
		d.disply();	
	
		System.out.println();
		System.out.println("==============deletion=============");
		
		//if key is not present
		//d.delete(0);
		d.delete(800);
		d.disply();	
		
		System.out.println();
		System.out.println("==============delete by position=============");
	
		//d.deleteByPos(-1);												// enter valid position
		d.deleteByPos(12);
		d.disply();
	
		System.out.println();
		System.out.println("==============Search=============");
	
		d.toSearch(300);
		
		System.out.println();
		System.out.println("==============findMid=============");
		//d.insertFirst(99);
		d.disply();
		d.tofindMid();
		
		System.out.println();
		System.out.println("==============Odd/Even element=============");
		
		d.insertFirst(166);
		d.disply();
		System.out.println();
		
		d.toFindOddEven();
	}
	
}