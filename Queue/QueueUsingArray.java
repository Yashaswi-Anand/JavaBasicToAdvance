package Queue;

public class QueueUsingArray {
	
	
	private int front;
	private int rare;
	private int size;
	private int[] data;
	
	
	QueueUsingArray(){
		front = -1;
		rare = -1;
		size = 0;
		data = new int[5];
	}
	
	QueueUsingArray(int capacity){
		front = -1;
		rare = -1;
		size = 0;
		data = new int[capacity];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int ele) {
		
		if(size == data.length) {
			System.out.println("Queue is full.");
		}
		if(size == 0) {
			front = 0;
		}
		data[++rare] = ele;
		size++;
	}
	
	public int dequeue() {
		if(size == 0) return 0;
		int temp = data[front];
		front++;
		if(front == data.length) {
			front = 0;
		}
		size--;
		if(size == 0) {
			front = -1;
			rare = -1;
		}
		return temp;
	}
	
	public int front() {
		if(size == 0) return 0;
		return data[front];
	}
	

}
