package Stack;

public class StackUsingArray {
	
	private int data[];
	private int top;

	
	StackUsingArray(){
		data = new int[2];
		top = -1;
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top == -1 ;
	}
	
	public void push(int ele) {
		
		if(top == data.length-1) {
			//System.out.println("Stack is full.");
			doubleCapacity();
		}
		data[++top] = ele;
	
	}
	
	private void doubleCapacity() {
		int[] temp = data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i] = temp[i];
		}

		
	}

	public int pop() throws StackEmptyException{
		if(top == -1) {
			throw new StackEmptyException();
		}
		int value = data[top--];
		return value;
	}

	public int top() throws StackEmptyException {
		if(top == -1) {
			throw new StackEmptyException();
		}
		return data[top];
	}
}
