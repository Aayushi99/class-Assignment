class Node
{
	int data;
	Node left;
	Node right;
	public Node(int d)
	{
		data=d;
		left=null;
		right=null;
	}

}
class tree
{
	static Node root;
	tree()
	{
		root=null;
	}

	static  void insert(int d)
	{
	    root=insertkey(root,d);
	}
	static Node insertkey(Node root,int d)
	{
		if(root==null)
		{
			root=new Node(d);
			return root;
		}
		else if(d<root.data)
		{
		    root.left=insertkey(root.left,d);
		}
		else if(d>root.data)
		{
		    root.right=insertkey(root.right,d);
		}
		 return root;

	}
	static void view(Node r)
	{
		while(r!=null)
		{
			System.out.println(" " + r.data);
			view(r.left);
			 view(r.right);
			 break;

		}
	}

	public static void main (String[] args)
	{
		tree t=new tree();
		tree.insert(40);
        tree.insert(30);
        tree.insert(70);
        tree.insert(35);
        tree.insert(20);
        tree.insert(50);
        tree.insert(80);
        tree.view(root);

	}
}
