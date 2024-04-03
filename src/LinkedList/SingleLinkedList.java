package LinkedList;

public class SingleLinkedList {
	
	public Node head;
	public Node tail;
	
	public int size;
	
	public Node createSingleLinkedListNode(int value) {
		
		head = new Node();
		Node n = new Node();
		n.next = null;
		n.value= value;
		head= n;
		tail = n;
		return head;
		

	}

}
