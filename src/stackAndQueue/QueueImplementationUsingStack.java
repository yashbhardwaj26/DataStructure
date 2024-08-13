package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueImplementationUsingStack {
	
  public static void main (String [] args) {
	  Stack s = new Stack();
	 s.push(1);
	 s.push(2);
	 s.push(3);
	  for (int i =0 ; i <s.size();i++) {
		  
		  System.out.println(s.elementAt(i));
	  }
	  

  }

private static void push(int x) {
	Queue q = new LinkedList();
	  q.add(x);
	  
	  int size = q.size();
	  for (int i = 1; i <= q.size();i++ ) {
		  
		 q.add(q.remove());
	  }
}
	
   
	
	

}
