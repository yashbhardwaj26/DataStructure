package Stack;

public class StackImplementation {

	int top = -1 ; 
	int size = 10 ;
	int [] stack = new int[size];
	
	public void push(int x) {
		
		top = top+1;
		stack[top]= x;
		
	}
	
	public void pop() {
		
		top = top-1;
		System.out.println("the popped element is " + stack[top+1]);
		
	}
	
	public int size() {
		
		return top+1;
		
	}
	
	public int top() {
		
		
		return stack[top];
	}

}



