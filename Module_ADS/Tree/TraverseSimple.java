/*
    Traverse tree without recursion with stack.
*/

import java.util.Stack;
 class TraverseSimple 
{
    Node root;
    static class Node
    {
        int data;
        Node left;
        Node right;
        
        public Node(int d)
        {
            data = d;
            left = right = null;

        }

    }

    public static void main(String[] args) 
    {
        Stack<Node> treeStack = new Stack<Node>();

        TraverseSimple b = new TraverseSimple();

        b.root = new Node(10);
		b.root.left = new Node(20);
		b.root.right = new Node(40);
		b.root.left.left = new Node(30);
		b.root.right.left = new Node(50);
		b.root.right.right = new Node(60);

        Node curr = b.root ;
    
            while(curr != null ||  treeStack.size()>0)
            {
        
                // to pop the left element until its become null
                while(curr != null)
                {    
                    treeStack.push(curr);                       // 10 20 30 
                    curr = curr.left;
                }    
                // this pt : curr is null
        
               curr = treeStack.pop();                          // pop the stored element 
               System.out.print(curr.data+" ");    
               curr = curr.right;                               // null until it reach to root(10).. then it will come in picture. store seq.  40 50 ,60 separately after poping  50 40  

        }   

    }
}


/*

			10
		  /    \
		20		40
	  /	   	  /	   \
	30		50		60	

	inorder   LVR: 	30 20 10 50 40 60 




*/