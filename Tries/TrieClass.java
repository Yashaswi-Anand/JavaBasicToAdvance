package Tries;


class TrieNode{
	char data;
	boolean isTerminal;
	TrieNode children[];
	
	public TrieNode(char data) {
//		this.data = data; 
		this.isTerminal = false;
		this.children = new TrieNode[26];
	}

}

public class TrieClass {
	
	private TrieNode root;
	
	public TrieClass() {
		root = new TrieNode('\0');
	}
	
	private void addHelper(TrieNode root, String word) {
		
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		
		int childIndex = word.charAt(0) -'A';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
		}
		addHelper(root, word.substring(1));
	}
	
	public void add(String word) {
		addHelper(root,word);
	}
	
	private boolean searchHelper(TrieNode root2, String word) {
	
		if(word.length() == 0) {
			return root.isTerminal;
		}
		
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(root, word.substring(1));
	}
	
	public boolean search(String word) {
		return searchHelper(root,word);
	}
	
	private void removeHelper(TrieNode root, String word) {
	
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
		removeHelper(root, word.substring(1));
		
	}

	public void remove(String word) {
		removeHelper(root,word);
	}
	
	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminal) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}


	

}
