package LinkedList;

public class Exercise1 {
	
	public Node head;
	public Node tail;
	public int size ;
	
	
	public Node createSingleLinkedList(int value) {
		
		head = new Node();
		
		Node n1 = new Node();
		
		n1.value = value;
		n1.next = null;
		head = n1;
		tail = n1;
		size=1;
		return head;
		
	}
	
	public void pushNode(int value) {
		
		if (head==null) {
			
			createSingleLinkedList(value);
		}
		
		else {
			
			Node n1 = new Node();
			n1.value = value;
			n1.next=null;
			tail.next= n1;
			tail=n1;
			size ++;
		}
	}
	
	public Node popNode() {
		if (head == null) {
		      System.out.println("The SLL does not exist");
		      return null;
		    } 
		    Node removeNode;
		    Node currentNode;
		    if (head == tail) {
		      removeNode = head;
		      head = tail = null;
		    } else {
		      currentNode = head;
		      while (currentNode.next != tail) {
		        currentNode = currentNode.next;
		      }
		      removeNode = currentNode.next;
		      currentNode.next = null;
		      tail = currentNode;
		    }
		    size--;
		 
		    return removeNode;
	}
	

}
