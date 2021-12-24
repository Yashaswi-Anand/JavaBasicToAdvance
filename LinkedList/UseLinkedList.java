package LinkedList;

public class UseLinkedList {
	
	public static void ReverseLinkedList(Node<Integer> head){
		if(head == null) return;
		ReverseLinkedList( head.next);
		System.out.print(head.data + " ");
		
	}
	
	public static Node<Integer> createLinkedList(){
		 Node<Integer> a = new Node<>(10);
		 Node<Integer> b = new Node<>(20);
		 Node<Integer> c = new Node<>(30);
		 
		 // link one node to another
		 System.out.println("Address of node :" + a);
		 System.out.println(a.next); // null
		 a.next = b;
		 b.next = c;
		 return a;
	}
	
	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	public static int LengthOfLinkedList(Node<Integer> head) {
		int count =0;
		Node<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;  // its is iterator like as i++ in for loop

		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> head =  createLinkedList();
		 System.out.print("Print Linked List: ");  // 10 20 30 
		 print(head);
		 System.out.print("Print Incremented Linked List: "); // 11 21 31 
		 increment(head);
		 print(head);
		 System.out.print("Length Of Linked List: ");  // 3
		 int length = LengthOfLinkedList(head);
		 System.out.println(length);
		 System.out.print("Print Reverse linked list: ");
		 ReverseLinkedList(head);
		 

	}

}
