import java.util.*;
public class PalindromByStack 
{
    int top =-1;
    char[] stack;
    int size;

    public PalindromByStack(int len)
    {
        size = len;
        stack = new char[size];

    }

    public void push(char data)
    {
        if(isFull())
        {
            System.out.println("Stack is overflow..!!");
        }
        stack[++top] = data;
    }
    
    public char pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }

    public boolean isFull()
    {
        //System.out.println(top);
        if(top >= size-1)
        {
            return true;
        }
        return false;
    }
    
    public boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        return false;
    }

    public void display()
    {
       for(char x : stack)
       {
           System.out.println(x);
       }
    }
    public static void main(String[] args)
     {
        int flag =0;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter String :");
        String exp = sc.nextLine();
        sc.close();
       
        char[] ch = exp.toCharArray();                      // convert string into array
        //System.out.println(ch);
        int len = exp.length();
        PalindromByStack p = new PalindromByStack(len);

        for(char x : ch)                                    // push all element of char array into stack
        {
            p.push(x); 
        }
        p.display();

        for(int i = 0; i < len; i++)
        {
            //System.out.println(p.stack[i]);
            char StackChar = p.pop();

            if(StackChar != ch[i])
            {
                flag =1;
                break;
            }
            
        }
        if(flag == 1)
        {
            System.out.println("String is not Palindrome..!!");
        }
        else
        {
            System.out.println("String is Palindrome..!!");
        }
        
    }
}
