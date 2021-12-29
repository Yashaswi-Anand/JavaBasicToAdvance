/*
 * AppendLastNToFirst

You have been given a singly linked list of integers along with an integer 'N'.
Write a function to append the last 'N' nodes towards the front of the singly linked list
and returns the new head to the list.
Input format :

The first line of each test case or query contains the elements of the singly linked list 
separated by a single space. 

The second line contains the integer value 'N'. 
It denotes the number of nodes to be moved from last to the front of the singly linked list.

Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list 
and hence, would never be a list element.
Output format :
For each test case/query, print the resulting singly linked list of integers in a row,
separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
0 <= N < M
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5
Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10
Sample Input 2 :
1
10 6 77 90 61 67 100  -1
4
Sample Output 2 :
90 61 67 100 10 6 77 
 Explanation to Sample Input 2 :
We have been required to move the last 4 nodes to the front of the list. 
Here, "90->61->67->100" is the list which represents the last 4 nodes. 
When we move this list to the front then the remaining part of the initial list 
which is, "10->6->77" is attached after 100. Hence, the new list formed with an updated head 
pointing to 90.
 */


package LinkedList;

import java.util.Scanner;

public class AppendLastNToFirst {
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
        
        if(head == null || n==0) return head;
        Node<Integer> tail = head, temp = null;
        
        int count = 0;
        while(tail != null){
            temp = tail;
            tail = tail.next;
            count++;
        }
        temp.next = head;
        tail = null;
        
        int val = count-n;
        while(val-- != 0){
            tail = head;
            head = head.next;
        }
        tail.next = null;
        
        return head;
        
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
	
	public static Scanner sc =  new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput();
		System.out.println("Enter the nth value: ");
		int nth = sc.nextInt();
		head = appendLastNToFirst(head , nth);
		printNode(head);
		

	}

}
