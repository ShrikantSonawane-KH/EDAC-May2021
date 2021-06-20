/*
    Queue by using LinkedList
    1. only using Front and rear
*/

class QueueByLL2
{
    Node front;
    Node rear;
    public QueueByLL2()
    {
        front =null;
    }
    static class Node
    {
        int data;
        Node next;

        public Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void enqueue(int data)
    {
        if(front == null)
        {
            front = new Node(data);
            rear = front;
            return;
        }


        /*
        Node temp = front;
        while(temp.next != null)
        {
            temp = temp.next;

        }
        */
        Node new_node = new Node(data);
        rear.next = new_node;
        rear = new_node;
    }
    
    public void dequeue()
    {
        if(front==null)
        {
            System.out.println("Stack is empty...!");
            rear = null;
            return;
        }
        //Node temp =  front;
        front = front.next;
    }
    
    public boolean isEmpty()
    {
        if(front == null)
        {
            return true;
        }
        return false;
    }


    public void display()
    {
        Node temp = front;
        while(temp != null)
        {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        QueueByLL2 l = new QueueByLL2();
        System.out.println("=================Enqueue=============");
        l.enqueue(10);
        l.enqueue(20);
        l.enqueue(30);
        l.enqueue(40);
        l.enqueue(50);
        l.enqueue(60);
        l.display();

        System.out.println();
        System.out.println("=================Dequeue=============");
        l.dequeue();
        l.dequeue();
        l.dequeue();
        l.dequeue();
        l.dequeue();
        l.dequeue();
        l.display(); 
       //---------------------------------------
        // after dequeue all the ele reset front and rear to null --> new queue is started
        l.enqueue(100);
        l.enqueue(200);
        l.enqueue(300);
        //l.dequeue();
        l.display();
        
        
    }

}
