package Queue;

public class ArrayQueue {
	
	private int front;
	private int rear;
	private int max;
	private Object[] aq;
	
	public ArrayQueue(int max)
	{
		this.front =0;
		this.rear = -1;
		this.max = max;
		this.aq = new Object[max];
	}
	public void insert(Object item)
	{
		aq[++rear] = item;
	}
	public Object peek()
	{
		return aq[front];
		//아.. 인덱스로 이렇게 간단한게 구현했구나.
		//FIFO 구조를 이렇게 표현했어.. 으흠. 
	}
	public Object remove()
	{
		Object item = peek();
		front++;
		return item;
		//근데 메모리에는 여전히 남아있잖아? 
	}
	
	public boolean empty()
	{
		return (front==rear+1);
	}
	public boolean full()
	{
		return (rear == max-1);
	}
	//위에 두개도 인덱스로 이렇게.. 우왕. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue ar = new ArrayQueue(3);
		ar.insert(1);
		ar.insert(2);
		System.out.println(ar.peek());
		System.out.println(ar.remove());
	}

}
