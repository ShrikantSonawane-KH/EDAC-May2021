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
	1. simple 
	2. circular
	3. priority
	4. double ended
*/

// by using Array -  Simple Queue


class CirQueueByArray
{

	private int size;
	private int cnt;
	private int[] Queue;
	private int front;
	private int rear;
	
	public CirQueueByArray(int s)
	{
		size = s;
		front =0;
		rear = -1;
		Queue = new int[size];
		cnt=0;
		
	}
	public void enqueue(int x)
	{
		
		// work on terminate if full 
		if(rear == size -1)
		{
			System.out.println("Circulated..!!");
		}
		
		rear = (rear+1)%size;	
		Queue[rear]= x;
		cnt++;
	}
	public int dequeue()
	{
		
		if(front == size)										// if front = 7 then
		{
			System.out.println("Queue Empty..!!");
			front=0;
		}
		
		int y = Queue[front++];
		cnt--;
		return y;
	}
		
	public void display()									// to show data from front pointer		
	{
		//System.out.print(front);
		for(int i = front ; i<size ; i++)
		{
			System.out.print(Queue[i]+" ");
			
		}
	}
	
	public void show()										//to show cerculated data
	{
		for(int i = 0 ; i<size ; i++)
		{
			System.out.print(Queue[i]+" ");
			
		}
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
		CirQueueByArray q = new CirQueueByArray(5);						//array size
		
		
			System.out.println("==========enqueue/insertion==========");
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.enqueue(40);
			q.enqueue(50);
			q.display();
			q.dequeue();

			q.enqueue(60);
			System.out.println();
			q.show();	
			
			
	
	}

}