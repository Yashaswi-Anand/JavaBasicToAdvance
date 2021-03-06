package LinkedList;

import java.util.Scanner;

public class ReverseLLRecursively {
	
	public static Node<Integer> Reverse(Node<Integer> head) {
		// time complexity = o(n^2)
		
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallHead = Reverse(head.next);
		Node<Integer> tail = smallHead;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallHead;
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
		 Node<Integer> head =  takeInput();
		 head =  Reverse(head);  // O(n^2)
		// head = ReverseBetter(head); // O(n)
		 printNode(head);
		 
	}

}
