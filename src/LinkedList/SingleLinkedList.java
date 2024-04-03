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
	
	
	public void insertNode(int value, int location) {
		
		Node n1 = new Node();
		n1.value= value;
		if(head == null) {
			createSingleLinkedListNode(value);
			return;
			
		}
		
		else if(location == 0) {
			n1.next = head ;
			head = n1;
			
		}
		
		else if (location >= size) {
			n1.next= null;
			tail.next = n1;
			tail = n1;
			
		}
		
		else {
			
			Node tempNode = head ; 
			int index = 0;
			while (index < location-1) {
				
				tempNode = tempNode.next;
				index++;
			}
			
			Node second = new Node();
			second = tempNode.next;
			tempNode.next = n1;
			n1.next= second;
		}
		
		size ++;
	}

}
