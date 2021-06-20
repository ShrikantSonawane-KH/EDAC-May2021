/*
TREE TYPE:
1.general 
2.Binary
3.Binary Search tree
4.AVL tree : AVL tree satisfies the property of the binary tree as well as of the binary search tree.
5.Red-Black Tree : In the AVL tree, we do not know how many rotations would be required to balance the tree, but in the Red-black tree, a maximum of 2 rotations are required to balance the tree.
6.B-tree : B-tree is a balanced m-way tree where m defines the order of the tree.all the leaf nodes must be at the same level.	
7.Splay tre :The splay tree data structure is also binary search tree in which recently accessed element is placed at the root position of tree by performing some rotation operations.
8.treap : In treap data structure, each node has both key and priority where key is derived from the Binary search tree and priority is derived from the heap data structure

*Traverse
1. Inorder	--> left, root, right
2. Preorder	--> root , left , right
3. Postorder--> left, right, root

// TREE FORMATION

*/


class BinaryTreeDemo
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
	public void display()
	{
		Node temp = root;
		while (temp != null)
		{
			System.out.println(temp.data+"  ");
			temp = temp.next;

		}
	}

	public static void main(String[] args)
	{

		BinaryTreeDemo b = new BinaryTreeDemo();

		b.root = new Node(10);
		b.root.left = new Node(20);
		b.root.left.left = new Node(30);
		b.root.right = new Node(40);
		b.root.right.left = new Node(50);
		b.root.right.right = new Node(60);
		
		}
	
}



/*
				10
			  /    \
			20		40
		  /	   	  /	   \
		30		50		60	

+A tree is also one of the data structures that represent hierarchical data. 
+A tree data structure is defined as a collection of objects or entities known as nodes that are linked together to represent or simulate hierarchy.
+A tree data structure is a non-linear data structure because it does not store in a sequential manner. It is a hierarchical structure as elements in a Tree are arranged in multiple levels.
+In the Tree data structure, the topmost node is known as a root node. Each node contains some data, and data can be of any type. In the above tree structure, the node contains the name of the employee, so the type of data would be a string.
+Each node contains some data and the link or reference of other nodes that can be called children.


    Root: The root node is the topmost node in the tree hierarchy. In other words, the root node is the one that doesn't have any parent. In the above structure, node numbered 1 is the root node of the tree. If a node is directly linked to some other node, it would be called a parent-child relationship.
    
	Child node: If the node is a descendant of any node, then the node is known as a child node.
    
	Parent: If the node contains any sub-node, then that node is said to be the parent of that sub-node.
    
	Sibling: The nodes that have the same parent are known as siblings.
    
	Leaf Node:- The node of the tree, which doesn't have any child node, is called a leaf node. A leaf node is the bottom-most node of the tree. There can be any number of leaf nodes present in a general tree. Leaf nodes can also be called external nodes.
    
	Internal nodes: A node has atleast one child node known as an internal
    
	Ancestor node:- An ancestor of a node is any predecessor node on a path from the root to that node. The root node doesn't have any ancestors. In the tree shown in the above image, nodes 1, 2, and 5 are the ancestors of node 10.
    
	Descendant: The immediate successor of the given node is known as a descendant of a node. In the above figure, 10 is the descendant of node 5.

	Number of edges: If there are n nodes, then there would n-1 edges. Each arrow in the structure represents the link or path. Each node, except the root node, will have atleast one incoming link known as an edge. There would be one link for the parent-child relationship.
	
	Depth of node x: The depth of node x can be defined as the length of the path from the root to the node x. One edge contributes one-unit length in the path. So, the depth of node x can also be defined as the number of edges between the root node and the node x. The root node has 0 depth.
	Height of node x: The height of node x can be defined as the longest path from the node x to the leaf node.
*/