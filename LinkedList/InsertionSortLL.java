package LinkedList;

import java.util.Scanner;

public class InsertionSortLL {
	public static Node<Integer> sorted = null;
	
	public static void InsertionSort(Node<Integer> headref){
		// Initialize sorted linked list
		
		Node<Integer> current = headref;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null)
        {
            // Store next for next iteration
        	Node<Integer> next = current.next;
            // insert current in sorted linked list
            sortedInsert(current);
            // Update current
            current = next;
        }
        // Update head_ref to point to sorted linked list
        headref = sorted;
	}
	
	public static void sortedInsert(Node<Integer> newnode)
    {
        /* Special case for the head end */
        if (sorted == null || sorted.data >= newnode.data)
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            Node<Integer> current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.data < newnode.data)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
	
	public static Node<Integer> takeInput(){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the element of linked list: ");
		int data = sc.nextInt();
		Node<Integer> head = null,temp = null;
		
		while(data != -1){
			Node<Integer> current = new Node<>(data);
			if(head == null){
				head = current;
				temp = current;
			}else {
//				Node<Integer> tail = head;
//				while(tail.next != null) {  // here total time complexity -> O(n^2)
//					//tail = current;
//					tail = tail.next;
//				}
//				tail.next = current;
				temp.next = current;  // here total time complexity -> O(n)
				temp = current;  // temp pointing to current node
				
				
			}	
			data = sc.nextInt();	
		}
		sc.close();
		return head;
		
	}
	
	public static void printNode(Node<Integer> head) {
		if(head == null) return;
		System.out.print(head.data + " ");
		printNode(head.next);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head  = takeInput();
		printNode(head);
		InsertionSort(head);
		System.out.println();
		printNode(head);
		
	}

}
