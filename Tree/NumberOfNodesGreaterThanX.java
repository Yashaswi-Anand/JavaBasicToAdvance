package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfNodesGreaterThanX {
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here	
        int count = 0;
        
        if(root.data > x) count = 1;
        
        
        for(int i=0;i<root.children.size();i++){
            count += numNodeGreater(root.children.get(i),x);
        }
        return count;

	}
	
	public static TreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root data: ");
		int rootData = sc.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> front = queue.poll();
			System.out.println("Enter the number of children of "+ front.data);
			int childNum = sc.nextInt();
			for(int i=0;i<childNum;i++) {
				System.out.println("Enter the "+ i+ "th child of root "+ front.data);
				int childData = sc.nextInt();
				TreeNode<Integer> ChildRoot = new TreeNode<Integer>(childData);
				front.children.add(ChildRoot);
				queue.add(ChildRoot);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the node for checking: ");
		int x = sc.nextInt();
		System.out.println(numNodeGreater(root,x));
		

	}

}
