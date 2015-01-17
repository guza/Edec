package dll;

public class doublelinkedlist {
	private Node header;
	private int size;
	public doublelinkedlist()
	{
		header = new Node(null);
		size = 0;
	}
	
	private class Node
	{			
		private Object data;
		private Node pre;
		private Node next;
		Node(Object data)
		{
			this.data=data;
			this.pre=header;
			this.next=null;
		}
	}
	
	public void addFirst(Object data)
	{
		Node tmp = new Node(data);
		tmp.pre=header;
		header.next = tmp;
		size++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublelinkedlist dll = new doublelinkedlist();
		dll.addFirst(100);
	}

}
