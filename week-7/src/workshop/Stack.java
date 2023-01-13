package workshop;

public class Stack {
	private int arr[] = null;
	
	// push method for stack
	void push(int value) {
		if(arr == null) {
			arr = new int[1];
			arr[0]= value;
		}else {
			// temporary array to store elements from stack
			int temp[] = new int[arr.length + 1];
			
			// transferring elements to temporary array
			for (int i = 0; i<arr.length; i++) {
				temp[i] = arr[i];
			}
			temp[temp.length-1] = value;
			
			// increasing length of stack and re-transferring all elements
			arr = new int[temp.length];
			for (int i = 0; i<arr.length; i++) {
				arr[i] = temp[i];
			}
		}
	}
	
	// peek method for stack
	int peek() {
		if(arr == null) {
			System.out.println("Stack is null or empty.");
		}
		// returning topmost element
		return arr[arr.length-1];
	}
	
	int pop() {
		// getting the last topmost element of stack
		int a = this.peek();
		
		// temporary variable to store elements of array
		int temp[] = new int[arr.length - 1];
		
		// transferring elements to temporary array
		for (int i = 0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		
		// redefining new array for stack
		arr = new int[temp.length];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = temp[i];
		}
		
		// returning topmost element
		return a;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		// using push method in stack
		stack.push(5);
		stack.push(10);
		stack.push(15);
		
		// printing out results of peek() and pop() methods
		System.out.println("This is peek "+stack.peek());
		// printing length of stack
		System.out.println(stack.arr.length);
		System.out.println("This is pop "+stack.pop());
		// printing length of stack
		System.out.println(stack.arr.length);
	}
}
