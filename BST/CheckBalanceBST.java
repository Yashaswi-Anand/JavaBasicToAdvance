package BST;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import BinaryTree.BinaryTreeNode;

class BinaryTreeReturn{
	int height = 0;
	boolean isBalance = true;
}

public class CheckBalanceBST {
	
	public static BinaryTreeReturn isBalanceBSTBetter(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			BinaryTreeReturn ans = new BinaryTreeReturn();
			ans.height = height;
			ans.isBalance = isBal;
			return ans;
		}
		
		BinaryTreeReturn leftOutput = isBalanceBSTBetter(root.left);
		BinaryTreeReturn rightOutput = isBalanceBSTBetter(root.right);
		boolean isBal = true;
		int height = 1+Math.abs(leftOutput.height - rightOutput.height);
		
		if(Math.abs(leftOutput.height  - rightOutput.height) > 1) {
			isBal = false;
		}
		
		if(!leftOutput.isBalance || !rightOutput.isBalance) {
			isBal = false;
		}
		
		BinaryTreeReturn ans = new BinaryTreeReturn();
		ans.height = height;
		ans.isBalance = isBal;
		return ans;
		
		
		
	}
	
	public static boolean isBalanceBST(BinaryTreeNode<Integer> root) {
		
		if(root == null) return true;
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		
		boolean isLeftBalance = isBalanceBST(root.left);
		boolean isRightBalance = isBalanceBST(root.right);
		
		return isLeftBalance && isRightBalance;
		
	}

	private static int height(BinaryTreeNode<Integer> root) {
		
		if(root == null) return 0;
		int left = height(root.left);
		int right = height(root.right);
		
		return 1+ Math.max(left, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInputLevelwise();
		System.out.println();
		printLevelWise(root);
		System.out.println();
		System.out.println("isBalance: " + isBalanceBST(root));
		System.out.println("isBalanceBetter->O(n): " + isBalanceBSTBetter(root).isBalance);
		
		


	}
	
	public static BinaryTreeNode<Integer> takeInputLevelwise(){
		System.out.println("Enter the root data: ");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData == -1 ) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChild.add(root);
		
		while(!pendingChild.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChild.poll();
			
			System.out.println("Enter the left child of "+ front.data);
			int left = sc.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				pendingChild.add(leftChild);
			}
			
			System.out.println("Enter the right child of "+ front.data);
			int right = sc.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				pendingChild.add(rightChild);
			}
			
		}
		return root;
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
        if(root == null) return;
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
        queue.add(root);
        queue.add(null);
        
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> top = queue.poll();
            
            if(top == null){
                if(queue.isEmpty()) break;
                
                 System.out.println();
                queue.add(null);
                continue;
            }
               
            System.out.print(top.data+" ");
            // for left node
            if(top.left != null){
                queue.add(top.left);       
            }
            // for right node
            if(top.right != null){
                queue.add(top.right);         
            }
        	
        }
	}

}
