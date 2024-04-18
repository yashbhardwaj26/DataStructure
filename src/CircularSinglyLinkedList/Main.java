package CircularSinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CircularSingleLinkedList cl = new CircularSingleLinkedList();
		cl.createCircularSingleLinkedList(5);
		
		
		cl.insertNodeInCSLL(7, 0);
		System.out.println(cl.head.value);
		System.out.println(cl.head.next.value);
		System.out.println(cl.head.next.next.value);
	}

}
