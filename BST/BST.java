package BST;
import BinaryTree.BinaryTreeNode;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;
    
    
    private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x) {
    	if(node == null) return false;
    	
    	if(node.data == x) return true;
    	
    	if(x < node.data) {
    		// call on left side
    		return isPresentHelper(node.left,x);
    	}else {
    		// call on right side
    		return isPresentHelper(node.right,x);
    	}
    }
    
    public boolean isPresent(int x) {
    	return isPresentHelper(root,x);
    }
    
    private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> node,int x) {
    	if(node ==null) {
    		BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
    		return newRoot;
    	}
    	
    	if(x >= node.data) {
    		node.right  = insert(node.right,x);
    	}else {
    		node.left = insert(node.left,x);
    	}
    	return node;
    }
    
    public void insert(int x) {
    	root = insert(root,x);
    	size++;   
    }
    
    private static BSTdeleteReturn deleteDataHelper(BinaryTreeNode<Integer> node,int x){
    	// if node has null
    
    	if(node == null) {
    		return new BSTdeleteReturn(null,false);
    	}
    	
    	if(node.data < x) {
    		// call to right side
    		BSTdeleteReturn outputRight = deleteDataHelper(node.right,x);
    		node.right = outputRight.root;
    		outputRight.root = node;
    		return outputRight;
    	}
    	if(node.data > x) {
    		// call to left side
    		BSTdeleteReturn outputLeft = deleteDataHelper(node.left,x);
    		node.left = outputLeft.root;
    		outputLeft.root = node;
    		return outputLeft;
    	}
    	 
    	// case 1: no child
		if(node.left == null && node.right == null) {
			return new BSTdeleteReturn(null,true);
		}
		// case 2: only one child
		if(node.left == null && node.right != null) {
			return new BSTdeleteReturn(node.right,true);
		}else if(node.right == null && node.left != null){
			return new BSTdeleteReturn(node.left,true);
		}
		
		// node has two children
		int rightMin = minimum(node.right);
		node.data = rightMin;
		BSTdeleteReturn outputRight = deleteDataHelper(node.right,rightMin);
    	node.right = outputRight.root;
    	
    	return new BSTdeleteReturn(node,true);
    	
    	
    }
    
    private static int minimum(BinaryTreeNode<Integer> node) {
		// TODO Auto-generated method stub
    	if(node == null) return Integer.MAX_VALUE;

    	int left = minimum(node.left);
    	int right = minimum(node.right);
    	return Math.min(Math.min(left, right), node.data);
    		
	}

	public boolean deleteData(int x) {
		BSTdeleteReturn output =deleteDataHelper(root,x);
		root = output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
    }
    
    public int size() {
    	return size;
    }
    
    private static void printTreeHelper(BinaryTreeNode<Integer> node) {
    	if(node == null) return;
		System.out.print(node.data+ ": ");
		if(node.left != null) {
			System.out.print("L" + node.left.data+ ", ");
		}
		if(node.right != null) {
			System.out.print("R" + node.right.data);
		}
		System.out.println();
		
		printTreeHelper(node.left);
		printTreeHelper(node.right);
    }
    
    public void printTree() {
    	printTreeHelper(root);
    }
}
