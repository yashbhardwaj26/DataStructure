package LinkedList;

public class Main {

	public static void main(String[] args) {
		
		SingleLinkedList sl1 = new SingleLinkedList();
		 sl1.createSingleLinkedListNode(5);
		 System.out.println(sl1.head.value);
		 sl1.insertNode(1, 0);
		System.out.println(sl1.head.value);
		sl1.insertNode(3,2);
		System.out.println(sl1.tail.value);
		sl1.insertNode(5, 1);
		System.out.println(sl1.head.next.value);
		// TODO Auto-generated method stub

	}

}
