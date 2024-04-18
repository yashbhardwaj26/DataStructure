package CircularSinglyLinkedList;

public class CircularSingleLinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node createCircularSingleLinkedList(int value) {
		
		head= new Node();
		Node node = new Node();
		node.value=value;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	

}
