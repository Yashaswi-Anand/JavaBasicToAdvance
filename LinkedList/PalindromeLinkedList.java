/*
 *  Sample Input 1 :
		9 2 3 3 2 9 -1
	Sample Output 1 :
		true
	Sample Input 2 :
		0 2 3 2 5 -1
		-1
	Sample Output 2 :
		false
		true
 */

package LinkedList;
import java.util.*;
public class PalindromeLinkedList {
	
	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
        if(head == null) return true;
        Node<Integer> temp = head;
        
        Stack<Integer> stack = new Stack<Integer>();
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        
        while(temp != null){
            if(temp.data == stack.pop()){
                temp = temp.next;
                //stack.pop();
            }else{
                return false;
            }
        }
        
        return true;
        
        
        
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		boolean check = isPalindrome(head);
		System.out.println(check);

	}

}
