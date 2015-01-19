package SingleLinkedList;

public class singlelinkedlist<T> {
	  private Node head; //head Node
	  private Node tail; //tail Node
	  private int size = 0;
	   
	   
	  class Node {
	        private T data; //data field
	        private Node link; //link field
	       
	        private Node(T data, Node link) {
	            this.data = data;
	            this.link = link;
	        }
	    }
	  
	  
	  private void linkFirst(T data) {
	       
	        //���ο� Node ����
	        final Node newNode = new Node(data, null);     
	        newNode.data = data;
	       
	        //���ο� ����� link �� ������ head ���
	        newNode.link = head;
	       
	        //������ head �� newNode �� ����.
	        head = newNode;
	       
	        if (tail == null) { //tail�� null �ΰ�� �����Ͱ� �ѹ��� ���Ե��� ����.
	            tail = head;
	        }	       
	        size++;
	    }
	  
}
