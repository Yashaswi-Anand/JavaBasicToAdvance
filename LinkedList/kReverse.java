/*  
 * 
 Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and
 return its modified list.
 'k' is a positive integer and is less than or equal to the length of the linked list. 
 If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
 Example :
 Given this linked list: 1 -> 2 -> 3 -> 4 -> 5

 For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5

 For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4
 Note :
 The first line contains the elements of the singly linked list separated by a single space.
 The second line of input contains a single integer depicting the value of 'k'.
 Remember/Consider :
 While specifying the list elements for input, -1 indicates the end of the singly linked list 
 and hence, would never be a list element
 Output format :
 print the elements of the updated singly linked list.

	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= M <= 10^5
	Where M is the size of the singly linked list.
	0 <= k <= M

	Time Limit:  1sec
	Sample Input 1 :
	1 2 3 4 5 6 7 8 9 10 -1
	4
	Sample Output 1 :
	4 3 2 1 8 7 6 5 10 9
	Sample Input 2 :
	1 2 3 4 5 -1
	0
	10 20 30 40 -1
	4
	Sample Output 2 :
	1 2 3 4 5 
	40 30 20 10 
 */

package LinkedList;

import java.util.Scanner;

public class kReverse {
	
	 public static Node<Integer> Reverse(Node<Integer> head){
	        
	        if(head == null || head.next == null) {
				return head;
			}
			Node<Integer> smallHead = Reverse(head.next);
			Node<Integer> tail = head.next;
			
			tail.next = head;
			head.next = null;
			return smallHead;
	    }

		public static Node<Integer> kReverse(Node<Integer> head, int k) {
			//Your code goes here
	        if(head == null || head.next == null || k == 0){
	            return head;
	        }
	        
	        Node<Integer> tail = head,temp = null;
	        int c = k-1;
	        while(c != 0 && tail != null){
	            tail = tail.next;
	            c--;
	        }
	        
	        if(tail != null){
	            temp = tail.next;
	            tail.next = null;
	        }
	        
	        Node<Integer> reverseHead = Reverse(head);
	        Node<Integer> reversetail = reverseHead;
	        while(reversetail.next != null) reversetail = reversetail.next;
	        
	        reversetail.next = kReverse(temp,k);
	        
	        return reverseHead;
	        
	        
		}
		
		public static Node<Integer> takeInput(){
			
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
		
		public static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Node<Integer> head = takeInput();
			int k = sc.nextInt();
			head = kReverse(head, k);
			System.out.println("After k reverse: ");
			printNode(head);
	
		}

}
