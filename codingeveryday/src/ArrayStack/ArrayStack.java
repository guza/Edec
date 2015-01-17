package ArrayStack;
//단점은 처음 생성한 크기를 변경할수 없다는 것이래. 
public class ArrayStack {
	private int top;
	private int max;
	private Object[] stack;
	
	public ArrayStack(int max)
	{
		this.max=max;
		this.stack = new Object[max];
		this.top = -1;
	}
	
	public boolean empty()
	{
		return (top==-1);
	}
	
	public boolean isfull()
	{
		return (top==max-1);
	}
	public void push(Object item)
	{
		if(isfull()) { throw new ArrayIndexOutOfBoundsException("full");}
		stack[++top] = item;
	}
	public Object peek()
	{
		if(isfull()) { throw new ArrayIndexOutOfBoundsException("full");}
		return stack[top];
	}
	public Object pop()
	{
		Object item = peek();
		top--;
		return item;
	}
	
	public void print()
	{
		for(int i=top; i>=0; i--)
		{
			System.out.println(stack[i]);
		}//스택같이 보여줄라고. 
	}
	
	public static void main(String[] args) {
		ArrayStack ar = new ArrayStack(5);
		ar.push(1);
		ar.push(2);
		ar.push(3);
		ar.push(4);
		//ar.push(5);
		//System.out.println(ar.peek());
		ar.pop();
		ar.print();
		
	}
	
}
