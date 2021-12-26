package Queue;

import LinkedList.Node;
import Stack.StackEmptyException;

public class QueueUsinghLL<T> {

	private Node<T> front;
	private Node<T> rare;
	int size;
	
	QueueUsinghLL(){
		front = null;
		rare = null;
		size =0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T elem) {
		Node<T> newNode = new Node<T>(elem);
		if(front == null) {
			front = newNode;
			rare = newNode;
		}else {
			rare.next = newNode;
			rare = newNode;
		}
		size++;
		
	}
	
	public T dequeue() throws StackEmptyException{
		if(front == null) {
			throw new StackEmptyException();
		}
		T data = front.data;
		front = front.next;
		size--;
		return data;
	}
	 
	public T front() throws StackEmptyException{
		if(front == null) {
			throw new StackEmptyException();
		}
		return front.data;
	}
	
}
