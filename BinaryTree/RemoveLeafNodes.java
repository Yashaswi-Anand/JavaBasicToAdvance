package BinaryTree;

import java.util.Scanner;

public class RemoveLeafNodes {
	
	public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
		if(root == null) return null;
		
		if(root.left == null && root.right == null) {
			root.data = -1;
		}
		removeLeafNodes(root.left);
		removeLeafNodes(root.right);
		return root;
		
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		
		System.out.print(root.data+ " : ");
		if(root.left != null) System.out.print("L"+ root.left.data + ", ");
		if(root.right != null) System.out.print("R"+ root.right.data + ", ");
		System.out.println();
		printTree(root.left);
		printTree(root.right);
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root =  takeTreeInputBetter(true,0,true);
		root = removeLeafNodes(root);
		printTree(root);
		printTreeInDetails(root);
		

	}

}
