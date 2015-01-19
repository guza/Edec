package SingleLinkedList;

public class SLL {
	
	private Node header;
	private int size;
	
	public SLL()
	{
		header = new Node(null);
		size = 0;
	}
	
	private class Node
	{
		private Object data;
		private Node nextNode;
		
		Node(Object data)
		{
			this.data = data;
			this.nextNode = null;
		}
	}
	//////////////////////////////
	//////////////////////////////
	
	public void addFirst(Object data)
	{
		Node tmp = new Node(data); //빈거만들고 
		tmp.nextNode = header.nextNode; // 
		header.nextNode = tmp;// 변수 스왑 할때 처럼 하나씩. 
		size++;
	}
	
	/*public void addLast(Object data)
	{
		Node iter = header.nextNode;
		while( iter.nextNode !=null)
			{
				if(iter.nextNode.nextNode == null)
				{
					System.out.println("?");
					Node tmp = new Node(data);
					iter.nextNode.nextNode = tmp;
				}
				iter = iter.nextNode;
			}
	}*/ //음 잔꾀 부리다가 무한루프에 빠져부럿성. .
	
	public Object get(int index)
	{
		return getNode(index).data;
	}
	// return index
	public Node getNode(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException("index error");
		}
		Node node = header.nextNode;
		
		//아.. 거기까지만 돌고 그 노드를 반환하는구나.. 오왕. 
		for ( int i = 0; i<index; i++)
		{
			node = node.nextNode;
		}
		return node;
	}
	
	// 좋은 발상..
	
	public int getNodeIndex(Object obj)
	{
		if(size < 0 ) { return -1; }
		
		int index = 0;
		Node node = header.nextNode;
		Object data = node.data;
		
		while(!obj.equals(data))
		{
			node = node.nextNode;
			if(node == null) //아 반복을 이렇게도.. 노드자체가 널..
			{
				return -1;
			}
			data = node.data;
			index++;
		}
		return index;
	}
	
	public void add ( int index, Object data)
	{
		if(index ==0) { addFirst(data); }
		Node pre = getNode(index-1);
		Node next = pre.nextNode;
		
		Node node = new Node(data);
		pre.nextNode = node;
		node.nextNode = next;
		size++;
	}
	
	public String toString()
	{
		StringBuffer result = new StringBuffer("[");
		Node node = header.nextNode;
		
		if(node !=null)
		{
			result.append(node.data);
			node = node.nextNode;
			
			while(node!= null)
			{
				result.append(", ");
				result.append(node.data);
				node = node.nextNode;
			}
		}
		result.append("]");
		return result.toString();
	}
	
	public void removeFirst ()
	{
		Node tmp = header.nextNode;
		header.nextNode = tmp.nextNode;
		//헤헿ㅎ 쉬워 다되는거야. 이상한생각하지마. 
	}
	
	public Object remove(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException("index error");
		}
		else if(index ==0)
		{
			removeFirst();//이건내맘대로한거라 아다리가 안맞네.
		}
		
		Node pre = getNode(index-1);
		Node target = pre.nextNode;
		pre.nextNode = target.nextNode;
		size--;
		//자바에서 객체의 메모리 해제는 그 객체를 참조하는 객체가 없어야 작동합니다.
		//라고 해서 저거 끊어줘야것당.
		target.nextNode = null;
		
		return 	1;	
		//메모리 해제도 없고 이럴꺼면 굳이 오브젝트 형으로 해야되나 싶기도하고
	}
	
	public static void main(String[] args) {
		SLL sll = new SLL();		
		sll.addFirst(100);
		sll.addFirst(200);
		sll.addFirst(300);
		sll.addFirst(400);
		sll.remove(1);
		//sll.addLast(400);
		//sll.removeFirst();
		System.out.println(sll);
		System.out.println("o_o");
	}
}
