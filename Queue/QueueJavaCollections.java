package Queue;
import java.util.*;

public class QueueJavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<Integer>();
		int arr[] = {12, 23, 34, 45, 56,67,78,89, 90 };
		
		for(int i : arr) {
			queue.add(i);
		}
		System.out.println(queue.size());
		System.out.println(queue.peek());
		
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}

	}

}
