package LinkedList;

import java.util.Scanner;

public class MergeTwoSortedLL {
	
	public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2){
		
		Node<Integer> head = null, tail = null;
        
        if(head1 == null) {
            return head2;
        }else if (head2 == null){
            return head1;
        }
        
        if(head1.data <= head2.data){
            head = head1;
            tail = head1;
            head1= head1.next;
        }else{
            head = head2;
            tail = head2;
            head2= head2.next;
        }
        
        while((head1 != null) && (head2 != null) ){
            Node<Integer> temp = null;
            if(head1.data <= head2.data){
                temp = head1;
                head1 = head1.next;
            }else {
                temp = head2;
                head2 = head2.next;
            }
            tail.next = temp;
            tail = temp;
        }
        
        // tricky concept
        if(head1 != null){
            tail.next = head1;
        }else{
            tail.next = head2;
        }
        
        return head;
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
		
		return head;
		
	}
	
	public static void printNode(Node<Integer> head) {
		if(head == null) return;
		System.out.print(head.data + " ");
		printNode(head.next);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> newhead = mergeTwoSortedLL(head1,head2);
		printNode(newhead);
		

	}

}
