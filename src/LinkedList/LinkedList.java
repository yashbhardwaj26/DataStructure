package LinkedList;

public class LinkedList {
	
	class Node {
		
		int value;
		Node next;
		
		public Node (int value) {
			this.value = value;
		}
	}
	
	static Node head = null;
	Node tail = null;
	Node current = head;
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
 
 public void printLinkedList(Node headNode) {
	 
	 Node current = headNode;
	 
	 while(current != null) {
		 
		 System.out.println(current.value);
		 current= current.next;
		 
	 }
 }
 

 
 public static void main (String [] args ) {
	 
	 LinkedList l = new LinkedList();
	
	 l.insertNodeAtLast(12);
	 l.insertNodeAtLast(20);
	 l.insertNodeAtLast(30);
	 l.insertNodeAtLast(40);
	 l.printLinkedList(head);
	 
	 
 }

}
