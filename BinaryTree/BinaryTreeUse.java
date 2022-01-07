package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
	
	public static Scanner sc = new Scanner(System.in);
	
	// print numbers of nodes--->
	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		int noOfleft = numNodes(root.left);
		int noOfright =numNodes(root.right);
		return 1+ noOfleft + noOfright;
	}
	
	// print sum of nodes --->
	public static int SumOfNodes(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		int leftSum = SumOfNodes(root.left);
		int rightSum = SumOfNodes(root.right);
		return root.data + leftSum + rightSum;
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
		int rootData = sc.nextInt();
		
		if(rootData == -1) return null;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftData = takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightData = takeTreeInputBetter(false, rootData,false);
		root.left = leftData;
		root.right = rightData;
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter the root: ");
		int rootData = sc.nextInt();
		
		if(rootData == -1) return null;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftData = takeTreeInput();
		BinaryTreeNode<Integer> rightData = takeTreeInput();
		root.left = leftData;
		root.right = rightData;
		return root;
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
	
	public static void print(BinaryTreeNode<Integer> root) {
		
		if(root == null) return;
		System.out.println(root.data+ " ");
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> leftroot = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rightroot = new BinaryTreeNode<Integer>(3);
		root.left = leftroot;
		root.right = rightroot;
		BinaryTreeNode<Integer> leftroot1 = new BinaryTreeNode<Integer>(21);
		BinaryTreeNode<Integer> rightroot1 = new BinaryTreeNode<Integer>(31);
		leftroot.left = leftroot1;
		rightroot.right = rightroot1;
		//print(root);
		//printTreeInDetails(takeTreeInput());
		root = takeTreeInputBetter(true, 0,true);
		printTreeInDetails(root);
		System.out.println("Number 0f nodes: "+ numNodes(root)); 
		System.out.println("Sum 0f nodes: "+ SumOfNodes(root)); 
	}

}
