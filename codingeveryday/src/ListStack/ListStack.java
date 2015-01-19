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
		top=tmp;//?top�� �׳� ���İ��°�..
		//��ũ�帮��Ʈ�ϱ�. ����ó�� ǥ���ϱ� ���ؼ�. �̷���. 
	}
	public Object peek()
	{
		//throw. if you want
		return top.data;
	}
	public Object pop()
	{
		Object target = peek();
		top = top.next; // �� �̰�.. ��������. 
		return target;
		// ���� �� ���� �ȉ���� ������ �����ε�. 
		//�Ƴ� �װ� �ƴϰ� 
		//��ũ�帮��Ʈ�� ���� ǥ���ϴ°� ��ü�� ���� ���߾���. .
		//�׸��� �ְ��. 
				
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
