package LinkedList;

public class NodeAtBeginning {
	
	class Node {
		
		int value;
		Node nextNode;
		
		public Node(int value){
			
			this.value = value;
			
		}		
	}

	 Node head = null;
	
	Node tail = null;
	
	public void insertNode(int value) {
		
		Node newnode = new Node (value);
		
		if(head ==null) {
			
			head= newnode;
			tail = newnode;
			
			
		}
		
		else {
			
			tail.nextNode = newnode;
			newnode.nextNode = null;
			tail = newnode;
		}
	}
	
	public void inserNodeAtBeginning(int value) {
		
		Node newnode = new Node(value);
		newnode.nextNode = head;
		head = newnode;
	
	}
	
	public void printLinkedList(Node head) {
		
		Node current = head;
		while(current != null) {
			
			System.out.println(current.value);
			current = current.nextNode;
		}
	}
	
	public void insertNodeAtIndex(int index, int value) {
		
		Node newNode = new Node (value);
		Node current = head;
		int count =1;
		while (current != null && count != index-1) {
			
			
			
			current = current.nextNode;
			
			count++;
			
			
		}
	Node temp = current.nextNode;	
    current.nextNode = newNode;
	newNode.nextNode = temp;
		
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		NodeAtBeginning n = new NodeAtBeginning();
		
		n.insertNode(1);
		
		n.insertNode(2);
		
		n.insertNode(3);
		
		n.insertNode(4);
		
		n.inserNodeAtBeginning(5);
		
		n.insertNodeAtIndex(4, 20);
		
		n.printLinkedList(n.head);
		
		

	}

}
