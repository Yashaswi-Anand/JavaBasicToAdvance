package Queue;

import Stack.StackEmptyException;

public class QueueUse {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		
		QueueUsingArray queue = new QueueUsingArray();
		queue.enqueue(23);
		queue.enqueue(12);
		//System.out.println(queue.size());
		//System.out.println(queue.dequeue());
		
		QueueUsinghLL<Integer> queueLL = new QueueUsinghLL<Integer>();
		queueLL.enqueue(30);
		queueLL.enqueue(50);
		System.out.println(queueLL.size);
		System.out.println(queueLL.dequeue());
		System.out.println(queueLL.front());
		System.out.println(queueLL.dequeue());

	}

}
