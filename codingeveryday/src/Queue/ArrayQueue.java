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
		//��.. �ε����� �̷��� �����Ѱ� �����߱���.
		//FIFO ������ �̷��� ǥ���߾�.. ����. 
	}
	public Object remove()
	{
		Object item = peek();
		front++;
		return item;
		//�ٵ� �޸𸮿��� ������ �������ݾ�? 
	}
	
	public boolean empty()
	{
		return (front==rear+1);
	}
	public boolean full()
	{
		return (rear == max-1);
	}
	//���� �ΰ��� �ε����� �̷���.. ���. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue ar = new ArrayQueue(3);
		ar.insert(1);
		ar.insert(2);
		System.out.println(ar.peek());
		System.out.println(ar.remove());
	}

}
