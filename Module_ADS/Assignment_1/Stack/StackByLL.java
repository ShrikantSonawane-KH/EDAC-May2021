class StackByLL
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
        StackByLL s =new  StackByLL();

        System.out.println("=======push()=====");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        
        System.out.println("=======pop()=====");
        s.pop();
       // s.pop();
       // s.pop();
       // s.pop();
       // s.pop();                        //Stack is underflow..!!
        s.display();
        
        System.out.println("=======peek()=====");
        System.out.println(s.peek());
    }

}