package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueImplementationUsingStack {
	
  public static void main (String [] args) {
	  Queue1 stack = new Queue1();
	  
	  stack.push(1);
	  stack.push(2);
	  stack.push(3);
	  System.out.println(stack.top());
	  
	  
	
	

  }
}
  
  
class Queue1{
	
	Queue<Integer> q1 = new LinkedList<Integer>();

	void push(int x)
    {
        //  Get previous size of queue
        int s = q1.size();

        // Push the current element
        q1.add(x);

        // Pop all the previous elements and put them after
        // current element
        for (int i = 0; i < s; i++) {
            q1.add(q1.remove());
        }
    }

	 int top()
	    {
	        if (q1.isEmpty())
	            return -1;
	        return q1.peek();
	    }
	 
	 void pop()
	    {
	        // if no elements are there in q1
	        if (q1.isEmpty())
	            return;
	        q1.remove();
	    }
	
}   
	
	


