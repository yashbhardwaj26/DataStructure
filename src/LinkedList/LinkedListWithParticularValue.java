package LinkedList;



public class LinkedListWithParticularValue {
	
	class Node {
		
		int value;
		Node next;
		
		public Node(int value ) {
			
			this.value= value;
		}
	}

	Node head = null;
	Node tail = null;
	
	public void insertNodeAtLast(int value) {
		 
		 Node newnode = new Node(value);
		 
		 if(head ==null) {
			 
			  head = newnode;
			  tail = newnode;
		 }
		 else {
			 
			 tail.next = newnode;
			 newnode.next = null;
			 tail = newnode;
		 }
		 
	 }
	
	public  boolean checkParticularValueInNode(int value) {
		
		Node current = head;
		while (current != null) {
			if(current.value == value) {
				return true;
			}
			current = current.next;
			
			}
		return false;
		
	}
	
	
	public static void main(String [] args ) {
		
		LinkedListWithParticularValue l = new LinkedListWithParticularValue();
			
		 l.insertNodeAtLast(12);
		 l.insertNodeAtLast(20);
		 l.insertNodeAtLast(30);
		 l.insertNodeAtLast(40);
		 boolean checkParticularValueInNode = l.checkParticularValueInNode(6);
		 
		 System.out.println(checkParticularValueInNode);
		
	}

}
