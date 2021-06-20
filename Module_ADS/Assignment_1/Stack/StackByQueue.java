
/* # remain  
    stack by queue.

*/

class StackByQueue
{
    int front1;
    int rear1;

    int front2;
    int rear2;
    
    int[] queue1;                   // for storing the data
    int[] queue2;                   // for retrive the data
    int size;

    public StackByQueue(int d)
    {
         front1 = 0;
         rear1 = -1;
    
         front2 = 0;
         rear2 = 0;

        size = d;
        queue1 = new int[size];
        queue2 = new int[size];
    }

    public void enqueue(int data)
    {
        if(rear1 == size-1)
        {
            System.out.println("Queue is full..!!");
            return;
        }
            queue1[++rear1] = data;
        
    }
    
    public void dequeue()
    {

        if(isEmpty())
        {
            System.out.println("Queue is empty..!");
        }
        int temp=0;
        for(int i = 0  ; i < rear1 ; i++)
        {
            temp++;
        }
        System.out.println("Element removed : "+queue1[temp]);
        if(temp==rear1)
        {
            rear1=rear1-1;
        }
       
    }
    
    public void display()
    {
        for(int i = rear1 ; i>=0; i--)
        {
            System.out.println(queue1[i]+" ");
        }
    }
    public boolean isEmpty()
    {
        if(rear1 == -1 && front1 == 0)
        {
            return true;
        }
        return false;
    }


    public static void main(String[] args) 
    {
        StackByQueue q = new StackByQueue(5);

        System.out.println("============PUSH()============");
       q.enqueue(10);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.display();
        System.out.println("============POP()============");
        q.dequeue();
        q.enqueue(100);
       // q.dequeue();
        q.display();
    }
}
