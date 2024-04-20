package CircularSinglyLinkedList;

public class CircularSingleLinkedList {

	public Node head;
	public Node tail;
	public int size;

	public Node createCircularSingleLinkedList(int value) {

		head = new Node();
		Node node = new Node();
		node.value = value;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insertNodeInCSLL(int value, int location) {

		Node node = new Node();
		node.value = value;
		if (head == null) {

			createCircularSingleLinkedList(value);

		} else if (location == 0) {
			node.next = head;
			head = node;
			tail.next = head;
		}

		else if (location >= size) {
			tail.next = node;
			tail = node;
			tail.next = head;
		}

		else {
			Node tempnode = head;
			int index = 0;
			while (index < location - 1) {

				tempnode = tempnode.next;
				index++;
			}

			node.next = tempnode.next;
			tempnode.next = node;
		}

		size++;
	}

	public void traverseCSLL() {
		if (head != null) {

			Node tempNode = head;
			for (int i = 0; i < size; i++) {

				System.out.print(tempNode.value);
				if (i < size - 1) {
					System.out.print("->");
				}
				tempNode = tempNode.next;
			}

		}
	}
	
	public boolean searchValueInCSLL(int value) {
		
		if (head!=null) {
			
			Node tempNode = head;
			
			for(int i = 0; i < size; i++) {
				
				if (tempNode.value== value) {
					System.out.println("The node is present at " + i);
					return true;
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("the node does not exist");
		return false;
	}

}
