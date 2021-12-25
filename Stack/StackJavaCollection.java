package Stack;
import java.util.*;
public class StackJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(567);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		
		ReverseWord("Yashaswi Anand");
		

	}
	
	public static void ReverseWord(String str) {
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			s.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(s.pop());
		}
		
	}

}
