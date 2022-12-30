package tutorial;

import java.util.LinkedList;

public class Tutorial {

	public static void main(String[] args) {
		LinkedList<Integer> list100 = new LinkedList<Integer>();
		list100.addLast(10);
		list100.addFirst(9);
		list100.addFirst(5);
		list100.add(1, 100);
		System.out.println(list100);
		
	}
}
