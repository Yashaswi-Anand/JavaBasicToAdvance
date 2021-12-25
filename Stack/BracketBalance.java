package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BracketBalance {
	
	public static boolean checkBracketBalance(String s) {
		
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			}else if(s.charAt(i) == ')') {
				if(!stack.isEmpty()){
                    if(stack.peek() == '(') {
                        stack.pop();
                    }
                }
			}
			
		}
		if(stack.isEmpty() && s.charAt(0) == ')' ) return false;
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String brackets = sc.next();
		Boolean check = checkBracketBalance(brackets);
		System.out.println(check);
		
		

	}

}
