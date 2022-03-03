package Tries;

class TrieNode2{
	char data;
	boolean isTerminating;
	TrieNode2 children[];
	int childCount;

	public TrieNode2(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode2[26];
		childCount = 0;
	}
}


public class TrieClass2 {

	private TrieNode2 root;
	private int numWords;

	public TrieClass2() {
		root = new TrieNode2('\0');
		numWords = 0;
	}
	

	public void remove(String word){
		if(remove(root, word)) {
			numWords--;
		}
	}
	

	private boolean remove(TrieNode2 root, String word) {
		if(word.length() == 0){
			if(root.isTerminating) {
				root.isTerminating = false;
				return true;
			}
			else {
				return false;
			}
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode2 child = root.children[childIndex];
		if(child == null){
			return false;
		}
		boolean ans = remove(child, word.substring(1));
		// We can remove child node only if it is non terminating and its number of children are 0	

		if(!child.isTerminating && child.childCount == 0){
			root.children[childIndex] = null;
			child = null;
			root.childCount--;
		}
		return ans;
	}

	private boolean add(TrieNode2 root, String word){
		if(word.length() == 0){
			if(root.isTerminating) {
				return false;
			}
			else {
				root.isTerminating = true;
				return true;
			}
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode2 child = root.children[childIndex];
		if(child == null){
			child = new TrieNode2(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		return add(child, word.substring(1));
	}

	public void add(String word){
		if(add(root, word)) {
			numWords++;
		}
	}
	
	private boolean searchHelper(TrieNode2 root2, String word) {
		
		if(word.length() == 0) {
			return root.isTerminating;
		}
		
		int childIndex = word.charAt(0) - 'a';
		TrieNode2 child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(root, word.substring(1));
	}
	
	public boolean search(String word) {
		return searchHelper(root,word);
	}
	
	public int countWords() {
		// Write your code here
        return numWords;
	}
	
}