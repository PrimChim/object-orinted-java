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
		
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}
	
	// inserts value to the first of list [2,3] -> [1,2,3]
	void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		if(tail == null) {
			tail = head;
		}
		size++;
	}
	
	// inserts value to the last of list [1,2] -> [1,2,3]
	void insertLast(int value) {
		Node node = new Node(value);
		
		if(tail == null) {
			insertFirst(value);
		}else {
			tail.next = node;
			tail = node;
			size++;
		}
	}
	
	// inserts value to the middle of list [1,3] -> [1,2,3]
	void insertMiddle(int value, int index) {
		Node temp = head;
		for(int i = 0; i<index-1; i++) {
			temp = temp.next;
		}
		Node node = new Node(value,temp.next);
		temp.next = node;
	}
	
	// deletes first element of linked list
	// [1,2,3] -> [2,3]
	void deleteFirst() {
		if(head == null) {
			throw new NullPointerException("List is empty.");
		} else {
			head = head.next;
			size--;	
		}
	}
	
	// delete element from given index in list
	void deleteMiddle(int index) {
		if(index>size) {
			System.out.println("Index out of bound.");
		}else if (index==1) {
			deleteFirst();
		}else {
			Node temp = head;
			for (int i = 1; i < index-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;
		}
	}
	// this method deletes last element
	// [1,2,3] -> [1,2]
	void deleteLast() {
		if(head==null) {
			System.out.println("List is empty.");
		}else if (head.next==null) {
			head = null;
		}else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
			size--;
		}

	}
	
	// this method will display linked list in form of array
	void display() {
		Node temp = head;
		System.out.print("[");
		while(temp != null) {
			System.out.print(temp.value);
			if(temp.next!=null) {
				System.out.print(", ");
			}
			temp =temp.next;
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insertFirst(35);
		list.insertFirst(25);
		list.insertFirst(15);
		list.insertFirst(10);
		list.insertFirst(5);

		list.display();
		
		list.deleteMiddle(1);
		list.display();
	}
}
