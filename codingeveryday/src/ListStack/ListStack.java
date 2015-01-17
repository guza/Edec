package ListStack;

public class ListStack {
	private Node top;
	public ListStack()
	{
		this.top=null;
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
	
	public void push(Object item)
	{
		Node tmp = new Node(item);
		tmp.next=top;
		top=tmp;
	}
	public Object peek()
	{
		//throw. if you want
		return top.data;
	}
	public Object pop()
	{
		Object target = peek();
		top = top.next;
		return target;
		// 내가 좀 이해 안됬던게 리턴의 개념인듯. 
	}
	public static void main(String[] args) {
		ListStack ls = new ListStack();
		ls.push(100);
		ls.push(200);
		ls.push(300);
		System.out.println(ls.pop());
		System.out.println(ls.peek());
	}
}
