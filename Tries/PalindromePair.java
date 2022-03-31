package Tries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Trie_Node {
	char data;
	boolean isTerminating;
	Trie_Node children[];
	int childCount;

	public Trie_Node(char data) {
		this.data = data;
		isTerminating = false;
		children = new Trie_Node[26];
		childCount = 0;
	}
}

class Triees {

	private Trie_Node root;
	public int count;

	public Triees() {
		root = new Trie_Node('\0');
	}

	private void add(Trie_Node root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		Trie_Node child = root.children[childIndex];

		if(child == null) {
			child = new Trie_Node(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(Trie_Node root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		Trie_Node child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(Trie_Node root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (Trie_Node child : root.children) {
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





	/*..................... Palindrome Pair................... */


	static boolean isPalindrome(String str) 
    { 
        int len = str.length(); 
       
        // compare each character from starting 
        // with its corresponding character from last 
        for (int i = 0; i < len/2; i++ ) 
            if (str.charAt(i) != str.charAt(len-i-1)) 
                return false; 
       
        return true; 
    } 
	public boolean isPalindromePair(ArrayList<String> vect) {
		//Your code goes here
           String input1,p="";
        for(int i =0;i<vect.size();i++){
            if(!search(root,vect.get(i)))
                add(vect.get(i));
        }
        for(int i =0;i<vect.size();i++){
            p="";
            input1 = vect.get(i);
            for(int k =0;k<input1.length();k++){
                p=input1.charAt(k)+p;
            }
            // System.out.println(p);
            if(search(root,p)){
                return true;
            }
        }		// Complete this function
		// Return the output as specified in question
          
        for (int i = 0; i< vect.size()-1; i++) 
            { 
                for (int j = i+1; j< vect.size() ; j++) 
                { 
                    String check_str = ""; 

                    // concatenate both strings 
                    check_str = check_str + vect.get(i) + vect.get(j); 

                    // check if the concatenated string is 
                    // palindrome 
                    if (isPalindrome(check_str)) 
                        return true; 

                    check_str = vect.get(j) + vect.get(i); 

                    // check if the concatenated string is 
                    // palindrome 
                    if (isPalindrome(check_str)) 
                        return true; 
                } 
            } 
        return false;
	}
} 

public class PalindromePair {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static ArrayList<String> takeInput() throws IOException {
        ArrayList<String> words = new ArrayList<>();

        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) {
            return words;
        }
        
        String[] listOfWords; 
        listOfWords = br.readLine().split("\\s");
        

        for (int i = 0; i < n; ++i) {
            words.add(listOfWords[i]);
        }

        return words;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Triees root = new Triees();

        ArrayList<String> words = takeInput();
        System.out.println(root.isPalindromePair(words));
    } 

}
