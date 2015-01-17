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
		top=tmp;//?top은 그냥 거쳐가는거..
		//링크드리스트니까. 스택처럼 표현하기 위해서. 이렇게. 
	}
	public Object peek()
	{
		//throw. if you want
		return top.data;
	}
	public Object pop()
	{
		Object target = peek();
		top = top.next; // 아 이게.. 삭제구나. 
		return target;
		// 내가 좀 이해 안됬던게 리턴의 개념인듯. 
		//아냐 그게 아니고 
		//링크드리스트포 스택 표현하는거 자체를 이해 못했었어. .
		//그림이 최고다. 
				
	}
	public static void main(String[] args) {
		ListStack ls = new ListStack();
		ls.push(100);
		ls.push(200);
		ls.push(300);
		System.out.println(ls.pop());
		System.out.println(ls.peek());
		ls.push(400);
		System.out.println(ls.peek());
	}
}
