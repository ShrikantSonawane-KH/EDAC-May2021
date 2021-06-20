/*
    Queue by using LinkedList
    1. only using Front.
*/

class QueueByLL
{
    Node front;
    
    public QueueByLL()
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
            return;
        }

        Node temp = front;
        while(temp.next != null)
        {
            temp = temp.next;

        }
        
        Node new_node = new Node(data);
        temp.next = new_node; 
    }
    
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty...!");
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
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        QueueByLL l = new QueueByLL();
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
        l.display();
        
    }

}