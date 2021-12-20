package LinkedList;

// with generic
public class Node<T> {
		
		T data;
		Node<T> next;
		Node(T data){
		   this.data = data;
//		   next = null;
		}
	
}

// without generic
//public class Node {
//	
//	int data;
//	Node next;
//	Node(int data){
//	   this.data = data;
//	}
//
//}
