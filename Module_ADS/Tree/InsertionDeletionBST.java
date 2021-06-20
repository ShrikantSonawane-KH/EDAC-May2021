
/*
 
             55
		  /     \
		40		  56
	  /	  \ 	    \
	17	   50		  70	
                    /    
                  60  	  
   
   inorder   LVR: 	17 40 50 55 56 60 70 

*/

public class InsertionDeletionBST 
{
    Node root;

    public InsertionDeletionBST()
    {
        root = null;                        
    }

    static class Node 
    {
        int data;
        Node left,right;

        public Node(){}
 
        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    public void Insertion(int key)                              
    {
      root = InsertionData(root, key);                              
      
    }
    
    public Node InsertionData(Node root, int key)
    {

        if(root == null)
        {
            root = new Node(key);                               
          //  System.out.println("upper "+root.data);               
            return root;
        }

        if(key < root.data)                                 // if key is small search in left
        {
            root.left = InsertionData(root.left, key);
        }

        else if(key > root.data)                            // if key is greater search in right
        {
            root.right = InsertionData(root.right, key);
        }
        //System.out.println(root.data);
        return root;
    }

    public void delete(int key)
    {
        root = deleteData(root, key);           
    }
    public Node deleteData(Node root, int key)
    {
       
        if(root == null)
        {
            return root;                                 
        }
       
        if(key < root.data)                             //execute until the node is not found
        {
            root.left = deleteData(root.left, key);     // to change the link 
        }
        else if(key > root.data)
        {
            root.right = deleteData(root.right, key);

        }
        
        else
       {
           //for deletion of leaf node
           // execute when both the root.data and key has same value(from calling fun)
        if(root.left==null)
            return root.right;
        else if(root.right==null)
            return root.left;                
        
            // to delete the node with 2 child
            //2 way : by replacing with inorder predecessor or sucessor
            // used : inorder sucessor
        root.data = minValueOfRightSubtree(root.right);            //root = 40 node // only the value is assinged //yet to delete that small value node

        root.right = deleteData(root.right, root.data);             //after assigning value --> go to right subtree and delete the node having that value 
        }
        return root;
    }

    int minValueOfRightSubtree(Node root)
    {
       int minVal = root.data;
       
       while(root.left != null)                     //until the least left node occure
       {
           minVal = root.left.data;         
           root = root.left;                        
       }
       return minVal;                               //return smallest data 
    }
 
    public void Inorder()
    {
        Inorder(root);
    }

    public void Inorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
    }

    public void Preorder()
    {
        Preorder(root);
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
    public static void main(String[] args) 
    {

    InsertionDeletionBST bts = new InsertionDeletionBST();

    System.out.println("===================insertion===================");

    bts.Insertion(55);
    bts.Insertion(40);
    bts.Insertion(50); 
    bts.Insertion(56);
    bts.Insertion(17);
    bts.Insertion(70);
    bts.Insertion(60);
    //bts.Insertion(40);            // it replace the previous same value
   
    bts.Inorder();
    System.out.println();
    System.out.println("===================deletion node leaf / node having 1 child===================");
    
    System.out.println("deleting -->60");
    bts.delete(60);                   // 17,50,60,88 - leaf node
    bts.Inorder();

    System.out.println();
    System.out.println("===================deletion node has 2 child===================");
    
    System.out.println("deleting -->40");
    bts.delete(40);
    bts.Inorder();

    }
}



/*

//INSERTION

public class InsertionDeletionBST 
{
        Node root;

    public InsertionDeletionBST()
    {
        root = null;
    }

    static class Node 
    {
        int data;
        Node left,right;

        public Node(){}

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
 
    public void Insertion(int key)
    {
       root = InsertionData(root, key);
    }

    public Node InsertionData(Node root, int key)
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }

        if(key < root.data)
        {
            root.left = InsertionData(root.left , key);
        }

        else if (key > root.data)
        {
            root.right = InsertionData(root.right , key);            
        }

        return root;
    }

    public void Inorder()
    {
        Inorder(root); 
    }

    public void Inorder(Node node)
    {
        if(node == null)
        {
            return;
        }   
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
    } 

    public static void main(String[] args)
    {

        InsertionDeletionBST b = new InsertionDeletionBST();
        
        b.Insertion(10);
        b.Insertion(20);
        b.Inorder();
    }
 
}

*/