import java.util.ArrayList;

public class node {
	String info;
	ArrayList<node> child = new ArrayList<node>();
	public node()
	{
		
	}
	public node(String info)
	{
		this.info = info;
	}
}
