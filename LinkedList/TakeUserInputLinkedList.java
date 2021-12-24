// Take user input until -1.

package LinkedList;
import java.util.*;

public class TakeUserInputLinkedList {
	
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
	
	
	public static Node<Integer> InsertElement(Node<Integer> head, int data, int pos){
		// insert element at any index
		
		if(head == null) {
			return head;
		}
		
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(data);
			newNode.next = head;
			return newNode;
		}else {
			Node<Integer> newlist = InsertElement(head.next,data,pos-1);
			head.next = newlist;
			return head;
		}
		
		
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
		System.out.println();
		head  = InsertElement(head,20,2);
		printNode(head);
		
		

	}

}
