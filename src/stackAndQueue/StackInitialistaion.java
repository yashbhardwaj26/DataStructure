package stackAndQueue;

public class StackInitialistaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StackImplementation st = new StackImplementation();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.pop();
		st.pop();
		int top = st.top();
		System.out.println("the top elements is "+ top);
		st.push(5);
		int top2 = st.top();
		System.out.println("the top elements is "+ top2);
		int size = st.size();
		System.out.println("the size is "+ size);

	}

}
