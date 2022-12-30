package tutorial;

public class LinkedList {
	
	Node head;
	Node tail;
	
	int size;
	
	LinkedList(){
		this.size = 0;
	}
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
	}
	
	void display() {
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertFirst(5);
	}
}
