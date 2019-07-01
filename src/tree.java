import java.io.File;

public class tree {
	node root;
	public void add(String start, node parent)
	{ 
					node n = new node(start);
					File file = new File(start);
					File[] paths = file.listFiles();
					
					if(parent == null)
					{
						parent = new node();
					}
					if(root == null)
					{
						root = n;
						parent = root;
					}
						for(int i = 0; i < paths.length; i++)
						{
							n.child.add(new node(paths[i].getName()));
						}
					
					
					parent.info = n.info;
					parent.child = n.child;
					for(int i = 0; i < paths.length; i++)
					{
						if(!paths[i].isDirectory())
						{
							continue;
						}
						else
						{
							try 
							{
								add(paths[i].getPath(),parent.child.get(i));								
							}
							catch (NullPointerException x)
							{
								
							}
							
						}
					}
	}
	public void print(node root)
	{
		System.out.println("parent is "+root.info);
		for(int i =0;i<root.child.size();i++)
		{
			System.out.println(root.child.get(i).info);
		}
		for(int i = 0; i< root.child.size(); i++)
		{
			if(root.child.get(i).child.size()<=0)
			{
				continue;
			}
			else
			print(root.child.get(i));
		}
	}
}
