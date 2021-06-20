import javax.net.ssl.SSLSession;

/*
    Reverse the stack using LL:

    +MAX ,MIN in stack

*/

class ReverseStackLL
{
    Node top;
    Node prev;     
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
    
    public void push(int data)
    {
        if(top==null)
        {
            top = new Node(data);
            return;
        }
        Node temp = top;
                
        while(temp.next != null)
        {        
            temp = temp.next;
        }
        Node new_node = new Node(data);
        temp.next = new_node;        
        return;
    }

    public void pop()
    {
        try
        {
        if(top.next==null)
        {
            top=null;
            return;
        }
        Node temp = top;        
        while(temp.next != null)
        {        
            prev = temp;
            temp = temp.next;
        }
        prev.next= null;
        }
        catch (NullPointerException e)
        {
            System.out.println("Stack is underflow....!!");
        }            
    }
    public int peek()
    {
        Node temp = top;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        return temp.data;
    }

    public void reverse()
    {
        Node curr = top;
        Node prev = null;
        Node temp = null;

        while(curr != null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        top = prev;
    }
   
    public int maxElement()
    {
        Node temp = top;
        int max = temp.data;
        while(temp!=null)
        {
            if(max < temp.data)
            {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
    public int minElement()
    {
        Node temp = top;
        int min = temp.data;
        while(temp!=null)
        {
            if(min > temp.data)
            {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }


    public void display()
    {
        Node temp = top;
        while(temp != null )
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }

    
    public static void main(String[] args)
    {
        ReverseStackLL s =new  ReverseStackLL();

        System.out.println("=======push()=====");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        
        System.out.println("=======reverse()=====");
        s.reverse();
        s.display();

        System.out.println("=======max/min=====");
        int max = s.maxElement();
        System.out.println("MAX : "+max);

        int min = s.minElement();
        System.out.println("MIN : "+min);
    

    }

}