package BinaryTree;

import java.util.Scanner;

public class FindLargestNode {
	
	public static int findLargest(BinaryTreeNode<Integer> root) {
		if(root == null) return -1;
		int leftlargest = findLargest(root.left);
		int rightlargest = findLargest(root.right);
		return Math.max(root.data, Math.max(leftlargest, rightlargest));
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
		int largestNode = findLargest(root);
		System.out.println("Largest node of tree:" + largestNode);

	}

}
