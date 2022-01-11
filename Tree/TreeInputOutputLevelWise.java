package Tree;
import java.util.*;

public class TreeInputOutputLevelWise {
	
	public static void printLevelWise(TreeNode<Integer> root){
		
        
        if(root == null) return;  
        
        Queue<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
        queue.add(root);
        queue.add(null);
        System.out.println(root.data);
        
        while(!queue.isEmpty()){
            TreeNode<Integer> front = queue.poll();
            
            if(front == null){
                if(queue.isEmpty()) break;
                
                System.out.println();
                queue.add(null);
                continue;
            }
            
            for(int i=0;i<front.children.size();i++){
                System.out.print(front.children.get(i).data+ " ");
                queue.add(front.children.get(i));
            }
        }
        

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		System.out.println();
		//printTreeInDetail(root);
		printLevelWise(root);
		
		

	}

}
