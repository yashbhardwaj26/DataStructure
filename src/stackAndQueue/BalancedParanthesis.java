//package stackAndQueue;
//
//import java.util.Stack;
//
//public class BalancedParanthesis {
//
//	public static void main(String[] args) {
//		
//		
//		// TODO Auto-generated method stub
//
//		Stack<Character> s = new Stack<> ();
//		String demo = "{}{}";
//		System.out.println(demo.length());
//		
//		for (int i = 0 ; i< demo.length(); i++) {
//			System.out.println(demo.charAt(i));
//			if (demo.charAt(i)=='{'|| demo.charAt(i)=='['|| demo.charAt(i)=='(') {
//				s.add(demo.charAt(i));
//			}
//			
//			else {
//				if (s.empty()) {
//					System.out.println("the stack is empty and not balanced");
//				}
//			}
//			
//			if (s.get(i)=='{'&& demo.charAt(i)=='}') {
//				
//				System.out.println("the string is balanced");
//			}
//		}
//	}
//
//}

// Java program for checking
// balanced brackets
import java.util.*;

public class BalancedParanthesis {

    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
            = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;

            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;

            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }

    // Driver code
    public static void main(String[] args)
    {
        String expr = "([{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

