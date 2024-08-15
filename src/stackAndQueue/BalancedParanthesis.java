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
