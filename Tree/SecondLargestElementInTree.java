package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SecondLargestElementInTree {
	
	private static int largest(TreeNode<Integer> root){
        if(root == null ) return 0;
        
        int max=root.data;
        for(int i=0;i<root.children.size();i++){
            int child = largest(root.children.get(i));
            if(child>max) max = child;
        }
        return max;
    }
    

	private static void firstChangeToMin(TreeNode<Integer> root, int x){
	    if(root == null ) return;
	    if(root.data == x){
	        root.data = Integer.MIN_VALUE;
	    }
	    for(int i=0;i<root.children.size();i++){
	        firstChangeToMin(root.children.get(i),x);
	    }
	}
	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
