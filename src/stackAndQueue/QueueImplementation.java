package stackAndQueue;

public class QueueImplementation {
	
	
	int end = -1 ;
	int start = -1 ;
	int currentSize = 0;
	int size = 4;
	int [] queue = new int [size];
	
	public void push(int x) {
		
		if (currentSize== size) {
			System.out.println("The queue is full");
		}
		
		if (currentSize==0) {
			end=end+1;
			start = start+1;
			queue[end]= x;
			currentSize=currentSize+1;
		}
		else {
			
			end = (end+1)%size;
			queue[end]=x;
			currentSize= currentSize+1;
			
		}
	}
	
	public void pop() {
		
		if (currentSize==0) {
			System.out.println("the queue is already empty");
		}
		int element = queue[start];
		if (currentSize==1) {
			start = -1;
			end = -1 ;
			currentSize=currentSize-1;
			System.out.println("the popped element is "+ element);
		}
		else {
			start = (start+1)%size;
			currentSize=currentSize-1;
			System.out.println("the popped element is "+ element);
		}
	}
	
	public void top() {
		if (currentSize==0 ) {
			System.out.println("the queue is empty");
			//return -1;
		}
		else {
			System.out.println("the top element is "+ queue[start]);
			//return queue[start];
			
		}
	}
	
	public void size() {
		System.out.println("the current size is " + currentSize);
		//return currentSize;
	}

}
