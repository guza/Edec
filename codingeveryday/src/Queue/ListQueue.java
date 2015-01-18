package Queue;

public class ListQueue {
	// 여기 있어야 할거 같은게 없네. 음. 아 밑에있어서 위로올림.
	
	private Node front;
	private Node rear;
	
	public ListQueue()
	{
		this.front = null;
		this.rear = null;
	}
	
	private class Node
	{
		private Object data;
		private Node next;
		Node(Object data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean empty()
	{
		return (front==null);
	}
	
	public void insert(Object item)
	{
		Node node = new Node(item);
		node.next = null;
		if(empty())
		{
			rear = node;
			front = node;
		}
		else
		{
			rear.next = node;
			rear = node;
		}
	}
	
	public Object peek()
	{
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		return front.data;
	}
	
	public Object remove()
	{
		Object item = peek();
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue lq = new ListQueue();
		lq.insert(1);
		lq.insert(2);
		System.out.println(lq.peek());
		System.out.println(lq.remove());
	}

}
