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
	       
	        //새로운 Node 구성
	        final Node newNode = new Node(data, null);     
	        newNode.data = data;
	       
	        //새로운 노드의 link 는 기존의 head 노드
	        newNode.link = head;
	       
	        //기존의 head 를 newNode 로 지정.
	        head = newNode;
	       
	        if (tail == null) { //tail이 null 인경우 데이터가 한번도 삽입되지 않음.
	            tail = head;
	        }	       
	        size++;
	    }
	  
}
