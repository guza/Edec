package tree;

public class tree {
	
	private node root;
	//어제 했던 헤더랑 같은느낌이야. 
	
	public void insert(int data)
	{
		node tmp = new node();
		tmp.setData(data);
		//뭔가 모순이다. 일단 되나 안되나 체크.
		if(root == null)
		{
			root = tmp;
		}
		else
		{
			insertNode(root,tmp);
		}
	}
	public void insertNode(node root , node tmp)
	{
		if(root.getData() < tmp.getData())
		{
			if(root.getRight() == null)
			{
				root.setRight(tmp);
			}
			else
			{
				insertNode(root.getRight(),tmp);
			}
		}
		
		else if(root.getData() > tmp.getData())
		{
			if(root.getLeft()==null)
			{
				root.setLeft(tmp);
			}
			else
			{
				insertNode(root.getLeft(),tmp);
			}
		}
		
		else
		{
			System.out.println("Fail");
		}
	}
	
	public void search(int data)
	{
		searchNode(root,data);
	}
	public void searchNode(node root , int find)
	{
		if(root ==null)
		{
			System.out.println("Fail to find");
		}
		if(root.getData() == find)
		{
			System.out.println("[+]Find value is " + root.getData());
		}
		else if(root.getData() < find)
		{
			searchNode(root.getRight() , find);
		}
		else
		{
			searchNode(root.getLeft(),find);
		}
	}
	
	public void inorder (node root)
	{
		if(root != null)
		{
			inorder(root.getLeft());
			System.out.printf("%d ", root.getData());
			inorder(root.getRight());
		}
	}
	
	public static void main(String args[])
	{
		tree t = new tree();
		t.insert(10);
		t.insert(5);
		t.insert(100);
		t.insert(30);
		t.insert(50);
		t.search(30);
		t.print();
	}
	public void print()
	{
		inorder(root);
		System.out.println();
	}
}

