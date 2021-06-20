public class TreeTraverse
{
	Node root;

	static class Node
	{
		int data;
		Node left;
		Node right;
	
		Node(int d)
		{
			data = d;
			left = null;
			right = null;
		}
		
	}
	public TreeTraverse()
	{
		root=null;
	}
		
    public void Inorder(Node node)
    {
        
        if (node == null)
        {
            //System.out.println("return");
            return;
        }   
        
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
}

	public void Preorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.print(node.data+" ");
		Preorder(node.left);
		Preorder(node.right);
	}

	public void Postorder(Node node)
	{
		if(node == null)
		{
			System.out.println("retu");
			return;
		}
		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.data+" ");
	}

	public static void main(String[] args)
	{
		TreeTraverse b = new TreeTraverse();

		b.root = new Node(10);
		b.root.left = new Node(20);
		b.root.right = new Node(40);
		b.root.left.left = new Node(30);
		b.root.right.left = new Node(50);
		b.root.right.right = new Node(60);
	

		System.out.println("=========Inorder=========");
        b.Inorder(b.root); 
		
		/*
		System.out.println();
		System.out.println("=========preorder========="); 
		b.Preorder(b.root);    
		
		System.out.println();
		System.out.println("=========postorder=========");
		b.Postorder(b.root);
		*/

    }
	
}

/*

        
			10
		  /    \
		20		40
	  /	   	  /	   \
	30		50		60	

	inorder   LVR: 	30 20 10 50 40 60 
	preorder  VLR: 	10 20 30 40 50 60
	postorder LRV:	30 20  50 60 40 10 




	Activation Record : 

    Control stack is a run time stack which is used to keep track of the live procedure activations i.e. it is used to find out the procedures whose execution have not been completed.
    
	When it is called (activation begins) then the procedure name will push on to the stack and when it returns (activation ends) then it will popped.
    
	Activation record is used to manage the information needed by a single execution of a procedure.
    
	An activation record is pushed into the stack when a procedure is called and it is popped when the control returns to the caller function.

 contents of activation records:
 1.

Activation Record

Return Value: It is used by calling procedure to return a value to calling procedure.

Actual Parameter: It is used by calling procedures to supply parameters to the called procedures.

Control Link: It points to activation record of the caller.

Access Link: It is used to refer to non-local data held in other activation records.

Saved Machine Status: It holds the information about status of machine before the procedure is called.

Local Data: It holds the data that is local to the execution of the procedure.

Temporaries: It stores the value that arises in the evaluation of an expression.

*/