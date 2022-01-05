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
	
	private static Node<Integer> DeleteElement(Node<Integer> head, int pos) {
		if(head == null) return head;
		
		if(pos == 0) {
			head = head.next;
			return  head;
		}
		Node<Integer> temp = DeleteElement(head.next,pos-1);
		head.next = temp;
		return head;
		
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head  = takeInput();
		printNode(head);
		System.out.println();
		System.out.println("Recursively Insert Element at Position:");
		head  = InsertNth(head,99,5);
		
		printNode(head);
		System.out.println();
		System.out.println("Recursively Insert Element at Position:");
		head  = DeleteElement(head,2);
		printNode(head);
		
		
		
	}
	
	public static Node<Integer> InsertNth(Node<Integer> head, int data, int position){
		
		Node<Integer> trackedHeadNode = head;
		    
		Node<Integer> nodeToInsert = new Node<Integer>(data); 
		    
		    //Empty List - Returned newly created node or null
		    if (head==null){return nodeToInsert;}
		    
		    //Inserting a Node ahead of the List
		    if (position == 0){nodeToInsert.next = head; return nodeToInsert;}    
		    
		    //Traverse the Singly Linked List to 1 Position Prior
		    //Stop traversing if you reached the end of the List
		    int currPosition = 0;
		    
		    while (currPosition < position -1 && head.next != null){
		        head = head.next;        
		        currPosition++;       
		    }

		    //Inserting a Node in-between a List or at the end of of a List
		    Node<Integer> nodeAtPosition = head.next;
		    head.next = nodeToInsert;
		    head = head.next;
		    head.next = nodeAtPosition;
		        
		    return trackedHeadNode;
		}                   
	}

	


