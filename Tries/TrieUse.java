package Tries;

public class TrieUse {

	public static void main(String[] args) {
		
		TrieClass trie = new TrieClass();
		trie.add("NOT");
		trie.add("NO");
		trie.add("ABC");
		System.out.println(trie.search("NOTE"));
		trie.remove("NO");
		System.out.println();
		trie.print();
		
		
		TrieClass2 trie2 = new TrieClass2();
		trie2.add("not");
		trie2.add("no");
		trie2.add("abc");
		System.out.println(trie2.countWords());
		System.out.println(trie2.search("note"));
		trie2.remove("no");
		System.out.println(trie2.countWords());

	}

}
