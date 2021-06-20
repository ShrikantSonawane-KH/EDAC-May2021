/*

	Queue : FIFI or LILO
	
	
	1. linear data stucture
	2. insertion from one end and  deletion from one end.
	3. operation
		1.insertion : enqueue()
		2.deletion : dequeue()
		3.Overflow : isFull()
		4.Underflow : isEmpty()
	* rear : for inserton
	* front : for deletion
	
	* implementation:
	1. by using Array --> static --> fix
	2. by using LinkedlIst --> dynamc --> flexible
	
	*types
	1. simple /Linear Queue
	2. circular
	3. priority
	4. Deque / double ended
*/

// by using Array -  Simple Queue


class QueueByArray
{

	private int size;
	private int cnt;
	private int[] Queue;
	private int front;
	private int rear;
	
	public QueueByArray(int s)
	{
		size = s;
		front =0;
		rear = -1;
		Queue = new int[size];
		cnt=0;
		
	}
	public void enqueue(int x)
	{
		if(rear == size -1)
		{
			System.out.println("Queue is full..!!");
			//rear = -1;
		}
		Queue[++rear]= x ;
		cnt++;	
	}
	public int dequeue()
	{
		if(front == size)										// if front = 7 then
		{
			System.out.println("Queue Empty..!!");
			//front=0;
		}
		int y = Queue[front++];
		cnt--;
		return y;
	}
	
	
	public boolean dequeueAll()
	{
		for(int j=front; j<size ; j++)
		{
			int y = Queue[front++];
			cnt--;
		}
		front =0;
		rear = -1;
		return true;
	}
	
	
	public void display()
	{
		for(int i = front ; i<size ; i++)
		{
			System.out.print(Queue[i]+" ");
			
		
	}
	
	public boolean isFull()
	{
		if (rear == size -1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isEmpty()
	{
		if (rear == -1)
		{
			return true;
		}
		return false;
	}
	
	

	public static void main(String[] args)
	{
		QueueByArray q = new QueueByArray(5);						//array size
		
		
			System.out.println("==========enqueue/insertion==========");
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.enqueue(40);
			q.enqueue(50);
			
			//q.display();
			//System.out.println("remove: "+q.dequeue());
			//q.display();
			
			System.out.println();
			
			boolean flag1 = q.isFull();
			System.out.println("isfull(): "+ flag1);
			
			boolean flag2 = q.isEmpty();
			System.out.println("isEmpty(): "+ flag2);
			
			
			System.out.println("==========dequeue/deletion==========");
			
			//System.out.println("dequeue all : "+ q.dequeueAll());
			q.dequeue();
			q.display();
			
			 flag1 = q.isFull();
			System.out.println("isfull(): "+ flag1);
			
			 flag2 = q.isEmpty();
			System.out.println("isEmpty(): "+ flag2);
			
			
			/*
			q.dequeue();
			//q.dequeue();
			q.display();
			System.out.println();
				
			q.enqueue(50);
			q.display();
			*/
	
	}

}



/*



+Applications of Queue


    Queues are widely used as waiting lists for a single shared resource like printer, disk, CPU.
    
	Queues are used in asynchronous transfer of data (where data is not being transferred at the same rate between two processes) for eg. pipes, file IO, sockets.
    
	Queues are used as buffers in most of the applications like MP3 media player, CD player, etc.
    
	Queue are used to maintain the play list in media players in order to add and remove the songs from the play-list.
    
	Queues are used in operating systems for handling 
	interrupts.






*/