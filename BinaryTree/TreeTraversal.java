package BinaryTree;

import java.util.Scanner;

public class TreeTraversal {
	
	// print tree in post-order traversal-->
	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root== null) return ;
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
	}
	
	// print tree in per-order traversal-->
	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
	}
	
	// height of the tree-->
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        return 1+ Math.max(left,right);
	}
	
	public static void printTreeInDetails(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		System.out.print(root.data+ ": ");
		if(root.left != null) {
			System.out.print("L" + root.left.data+ ", ");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printTreeInDetails(root.left);
		printTreeInDetails(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root: ");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of: "+ parentData);
			}else {
				System.out.println("Enter right child of: "+ parentData);
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData == -1) return null;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftData = takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightData = takeTreeInputBetter(false, rootData,false);
		root.left = leftData;
		root.right = rightData;
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true,0,true);
		printTreeInDetails(root);
		System.out.println("Height of the tree: "+ height(root));
		System.out.println("Print pre-order: ");
		preOrder(root); 
		System.out.println();
		System.out.println("Print post-order: ");
		postOrder(root);

	}

}
