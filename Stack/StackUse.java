package Stack;

public class StackUse {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		
		StackUsingArray stack = new StackUsingArray();
		int[] arr = {12,34,56,78,90};
		for(int i : arr) {
			stack.push(i);
		}
		System.out.println(stack.size());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.top());
		
		// ------------------------------------------------------------------------
		
	   StackUsingLL<Integer> stackLL = new StackUsingLL<Integer>();
	   stackLL.push(20);
	   stackLL.push(30);
	   System.out.println(stackLL.size());
	   System.out.println(stackLL.isEmpty());
	   System.out.println(stackLL.pop());
		
		
	}

}
