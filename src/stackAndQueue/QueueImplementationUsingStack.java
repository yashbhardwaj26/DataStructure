package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueImplementationUsingStack {
	
  public static void main (String [] args) {
	  Queue1 stack = new Queue1();
	  
	  stack.push(1);
	  stack.push(2);
	  System.out.println(stack.top());
	  
	  
	
	

  }
}
  
  
class Queue1{
	
	Queue q = new LinkedList();

public void push(int x) {
	
	  q.add(x);
	  
	  int size = q.size();
	  
	  for (int i = 1; i <= q.size();i++ ) {
		  
		 q.add(q.remove());
	  }
}

public int top() {
	
	return (int) q.peek();
	

}
	
}   
	
	


