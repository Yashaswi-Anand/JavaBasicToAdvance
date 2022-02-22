package PriorityQueue;

public class PriorityQueueUse {

	public static void main(String[] args) throws PriorityQueueException {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.insert("abc", 15);
		pq.insert("def", 13);
		pq.insert("mno", 90);
		pq.insert("pqr", 10);
		
		System.out.println(pq.size());
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
		System.out.println(pq.size());

	}

}
