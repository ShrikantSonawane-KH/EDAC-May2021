import jdk.internal.jshell.tool.resources.version;

public class ReviseTreeOperation {
    
    Node root;
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int d)
        {
            data = d;
            left = null;
            right = null;
        }
    }

   public void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void insert(int key)
    {
        root = insertData(root,key);
    }

    public Node insertData(Node root , int key)
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        if(key<root.data)
        {
           root.left = insertData(root.left, key);
        }
        else if(key > root.data)
        {
            root.right = insertData(root.right, key);
        }
        return root;
    }
    public void delete(int key)
    {
       root = deleteData(root , key);
    }

    public Node deleteData(Node root, int key)
    {
        if(root == null)
        {
            return root;
        }
        if(key< root.data)
        {
            root.left = deleteData(root.left, key);
        }
        else if(key>root.data)
        {
            root.right = deleteData(root.right, key);
        }

        else{
            
            // leaf node deletion // node with single child
            if(root.right == null)
            {
                return root.left;
            }
            else if(root.left == null)
            {
                return root.right;
            }
            // node with two child
         
            root.data = minvalue(root.right);

            root.right = deleteData(root.right, root.data);

        }
        return root;

    }
    public int minvalue(Node root)
    {   
        int minvalue = root.data;
        while(root.left != null)
        {
            minvalue = root.left.data;
            root = root.left;
        }
        return minvalue;

    }



    public static void main(String[] args) {
        
        ReviseTreeOperation t = new ReviseTreeOperation();

        t.root = new Node(50);
        t.root.left = new Node(40);
        t.root.left.left = new Node(15);
        t.root.left.right = new Node(30);
        t.root.right = new Node(60);

        t.inorder(t.root);
        System.out.println();
        System.out.print("-------------------------");
        System.out.println();
        // t.preorder(t.root);

        System.out.println();
        System.out.print("-------------------------");
        System.out.println();

        // t.postorder(t.root);
        t.insert(55);
        t.inorder(t.root);

        System.out.println();
        System.out.print("-------------------------");
        System.out.println();

        t.delete(50);
        t.inorder(t.root);

    }
}
