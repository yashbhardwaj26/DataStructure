package stackAndQueue;


class Node{
	
	int data;
	Node next;
	
	 Node(int x){
		 
		this.data=x;
		next=null;
	}
	
}

public class StackImplementationUsingLinkedlist {
	
	Node top;
	int size=0;
	
	void push(int x) {
		
		Node n1 = new Node(x);
		n1.next=top;
		top=n1;
		size=size+1;
		
	}
	
	void pop() {
		
		Node temp = top;
		top = top.next;
		temp = null;
		size = size -1 ;
	}
	
	void top() {
		
		System.out.println("the top element is "+ top.data);
	}
	
	void size() {
		System.out.println("the size is "+ size);
	}

}
