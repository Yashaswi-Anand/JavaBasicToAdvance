package BinaryTree;
import java.util.Scanner;

public class NumberOfLeaves {
	
	// Print only depth k nodes
	// Time complexity - O(n)
	public static void printAtdepthK(BinaryTreeNode<Integer> root, int k){
		if(root == null) return;
		
		if(k == 0) {
			System.out.print(root.data+ " ");
			//return;
		}
		printAtdepthK(root.left, k-1);
		printAtdepthK(root.right, k-1);
		
	}
	// Print only leaves nodes
	// Time complexity - O(n)
	public static void numLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		
		if(root.left == null && root.right == null) {
			System.out.print(root.data + " ");
		}
		
		numLeaves(root.left);
		numLeaves(root.right);
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
		
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true,0,true);
		System.out.println("Leaves node are: ");
		numLeaves(root);
		System.out.println();
		System.out.println("Enter the depth k: ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println("Nodes at depth k: ");
		printAtdepthK(root,k);
		
	}

}
