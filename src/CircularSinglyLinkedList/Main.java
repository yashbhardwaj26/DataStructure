package CircularSinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CircularSingleLinkedList cl = new CircularSingleLinkedList();
		cl.createCircularSingleLinkedList(5);
		
		
		cl.insertNodeInCSLL(7, 0);
		cl.insertNodeInCSLL(2, 4);
		cl.traverseCSLL();

	}

}
