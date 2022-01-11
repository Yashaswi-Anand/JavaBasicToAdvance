package Tree;

public class BasicTreeUse {
	
	public static int sumOfAllNode(TreeNode<Integer> root){
        
        //if(root == null) return 0;
        
        int sum =0;
        for(int i=0;i<root.children.size();i++){
            sum += sumOfAllNode(root.children.get(i));
            
        }
        
        return root.data+sum;
	
	}
	
	public static int numberOfNodes(TreeNode<Integer> root) {
		if(root == null) return 0;
		int count=0;
		for(int i=0;i<root.children.size();i++) {
			count += numberOfNodes(root.children.get(i));
		}
		return 1+count;
	}
	
	public static void printTreeInDetail(TreeNode<Integer> root) {
		
		// Special case not base case
		if(root == null) return;
		
		System.out.print(root.data+ ": ");
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+ " ");
			
		}
		System.out.println();
		
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTreeInDetail(child);
		}
		
	}
	
	public static void printTree(TreeNode<Integer> root) {
		
		// Special case not base case
		if(root == null) return;
		
		System.out.print(root.data+ " ");
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
		
	}

	public static void main(String[] args) {
		
		TreeNode<Integer> root = new TreeNode<Integer>(1);
		TreeNode<Integer> root1 = new TreeNode<Integer>(2);
		TreeNode<Integer> root2 = new TreeNode<Integer>(3);
		TreeNode<Integer> root3 = new TreeNode<Integer>(4);
		TreeNode<Integer> root4 = new TreeNode<Integer>(5);
		TreeNode<Integer> root5 = new TreeNode<Integer>(6);
		
		root.children.add(root1);
		root.children.add(root2);
		root.children.add(root3);
		
		root2.children.add(root4);
		root2.children.add(root5);

		printTree(root);
		System.out.println();
		printTreeInDetail(root);
		System.out.println();
		System.out.println("Number of nodes: "+ numberOfNodes(root));
		
		System.out.println();
		System.out.println("Sum of the nodes: "+ sumOfAllNode(root));
	}

}
