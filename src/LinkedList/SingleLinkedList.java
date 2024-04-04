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
	
	
	public void traverseLinkedList() {
		
		if (head==null) {
			System.out.println("the list is empty");
		}
		Node tempnode = head;
		for (int i =0;i< size;i++) {
			
			System.out.print(tempnode.value);
			if(i!=size-1) {
				System.out.print("-->");
			}
			tempnode= tempnode.next;
		}
		System.out.println("");
		
	}
	
	public boolean findElement(int value) {
		
		if(head == null) {
			return false;
		}
		Node tempnode = head;
		for (int i=0;i< size;i++) {
			
			if (tempnode.value == value) {
				System.out.println("The value is found at index -> " + i);
				return true;
				
			}
			tempnode = tempnode.next;
		}
		
		System.out.println(" the value is not present in linked list");
		return false;
		
	}
	
	public void deletionOfNode(int location) {
		if (head==null) {
			System.out.println("the List does not exist");
			return;
		}
		else if(location ==0) {
			head = head.next;
			size --;
			if(size==0) {
				tail= null;
			}
		}
		else if(location >= size) {
			Node tempNode = head;
			for (int i=0 ; i< size-1;i++) {
				tempNode = tempNode.next;
				
			}
			if (tempNode==head) {
				tail=head=null;
				size --;
				return;
			}
			else {
				tempNode.next = null;
				tail = tempNode;
				size --;
			}
		}
		else {
			Node tempNode= head;
			for (int i=0; i< location-1;i++) {
				tempNode= tempNode.next;
			}
			tempNode.next= tempNode.next.next;
			size --;
		}
	}
	
	public void deletEntirelist() {
		
		head = null;
		tail= null;
		System.out.println("List deleted successfully");
	}

}
