package Sortings;

import java.util.Scanner;

import LinkedList.Node;

public class BubbleSortUsingLL {
	
	public static Node<Integer> bubbleSortLL(Node<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null) return head;
        
        Node<Integer> fwd = head.next, temp = head, curr = head;
        
        while(temp != null){
            fwd = head.next;
            curr = head;
            
            while(fwd != null){
                if(fwd.data <= curr.data){
                    int data = fwd.data;
                    fwd.data = curr.data;
                    curr.data = data;
                }
                fwd = fwd.next;
                curr = curr.next;
            }
            
            
            temp = temp.next;
        }
        
        return head;
        
        
	}
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
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
	
		return head;
		
	}
	
	public static void printNode(Node<Integer> head) {
		if(head == null) return;
		System.out.print(head.data + " ");
		printNode(head.next);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput();
		head = bubbleSortLL(head);
		printNode(head);

	}

}
