package stackAndQueue;




public class QueueImplementationUsingLinkedList {
	
	Node start,end;
	int size = 0 ;
	
	void push(int x) {
		
		Node n1 = new Node(x);
		 if (start==null) {
			 
			 start=end=n1;
			 size= size+1;
		 }
		 else {
			 end.next=n1;
			 end=n1;
			 size= size+1;
		 }
	}

	void pop() {
		
		Node temp = start;
		start= start.next;
		temp=null;
		size= size-1;
	}
	
	void top() {
		System.out.println("the top element is "+ start.data);
	}
	
	void size() {
		System.out.println("the size is " + size);
	}
}
