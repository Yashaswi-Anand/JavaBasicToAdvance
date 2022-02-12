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

public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	public void add(String word) {
		
	}
	
	public boolean search(String word) {
		return false;
	}
	
	public void remove(String word) {
		
	}

}
