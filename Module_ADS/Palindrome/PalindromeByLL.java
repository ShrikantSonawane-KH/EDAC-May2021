import java.util.*;

public class PalindromeByLL {
    Node head;
    int flag = 0;
	static class Node
	{
		char data;
		Node next;
		
		Node(char d)
		{
			data = d;
			next=null;	
		}
	}

    public void insert(char data)
    {
      //System.out.print(data + "  data  ");
        if(head == null)
        {
            head = new Node(data);
            return;
        }

        Node  temp = head;
        while(temp.next != null)
        {
            temp = temp.next;

        }
        Node new_node = new Node(data);
        temp.next = new_node;

    }

	public void display()
	{
		Node temp =head;
		
		while(temp!=null)
		{
            System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
	}
    public void palindromeCheck(char[] arr,int len)
    {
        Node temp = head;

        for(int i=0; i< len ; i++)
        {
            if(arr[i]!= temp.data && temp!=null)
            {
                flag = 1;
                break;
            }
            temp = temp.next;
        }
        if(flag==0)
        {
            System.out.println("Palindrome..!");
        }
        else{
            System.out.println("Not Palindome..!");
        }
    }
	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the exp. to convert it into postfix : ");
        String exp = sc.nextLine();
        sc.close();
        char[] ch = exp.toCharArray();
        int len = ch.length;
        PalindromeByLL p = new PalindromeByLL();
        
        for(int i=len-1; i >= 0 ;i--)
        {
            p.insert(ch[i]);
            //System.out.println(ch[i]);
        }
      //  p.display();
        p.palindromeCheck(ch,len);


	}

}
