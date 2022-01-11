package BinaryTree;

import java.util.*;
import java.util.Scanner;

public class LevelwiseInputOutput {
	
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
	
	public static void printLevelwise(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		
		
		Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChild.add(root);
//		if(root.left != null) {
//			pendingChild.add(root.left);
//		}
//		if(root.right != null) {
//			pendingChild.add(root.right);
//		}
		
		while(!pendingChild.isEmpty()) {
			BinaryTreeNode<Integer> top = pendingChild.poll();
			System.out.print(top.data + ": ");
			if(top.left != null) {
				pendingChild.add(top.left);
				System.out.print("L:" + top.left.data + ",");
			}else {
				System.out.print("L:" + "-1" + ",");
			}
			if(top.right != null) {
				pendingChild.add(top.right);
				System.out.print("R:" + top.right.data);
				System.out.println();
			} else {
				System.out.print("R:" + "-1");
				System.out.println();
			}
		}
		
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
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
		BinaryTreeNode<Integer> root = takeInputLevelwise();
		printLevelwise(root);
		printLevelWise(root);

	}

}
