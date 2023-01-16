package workshop;

public class Queue {
	int queue[] = null;
	
	void enqueue(int a) {
		if(queue == null) {
			queue = new int[1];
			queue[0] = a;
		} else {
			int temp[] = new int[queue.length];  // temporary array to store items from queue
			
			// transferring items to same index as queue to temporary array
			for(int i = 0; i < queue.length; i++) {
				temp[i] = queue[i];
			}
			
			queue = new int[temp.length+1];  // increasing the length of array
			
			// re-transferring items to queue
			for(int i = 0; i < temp.length; i++) {
				queue[i] = temp[i];
			}
			queue[temp.length] = a;
		}
		
		
		
	}
	
	void dequeue() {
		if(queue == null) {
			System.out.println("Queue is null");
		} else {
			int temp[] = new int[queue.length];  // temporary array to store items from queue
			
			// transferring items to same index as queue to temporary array
			for(int i = 0; i < queue.length; i++) {
				temp[i] = queue[i];
			}
			
			queue = new int[temp.length-1];  // decreasing the length of array
			
			// re-transferring items to queue
			for(int i = 0; i < queue.length; i++) {
				queue[i] = temp[i+1];
			}
		}
	}
	
	int peek() {
		return queue[0];
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		System.out.println(queue.peek());  // expected output: null
		queue.enqueue(9);
		queue.enqueue(15);
		
		System.out.println(queue.queue.length);  // expected output: 2
		System.out.println(queue.queue[0]+" "+queue.queue[1]);  // expected output: 9 15
		
		queue.dequeue();
		
		System.out.println(queue.queue.length);  // expected output: 1
		System.out.println(queue.queue[0]);  // expected output: 15
		
		System.out.println(queue.peek());  // expected output: 15
	}
}
