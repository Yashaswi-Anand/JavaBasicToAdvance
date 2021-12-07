package Lists;
import java.util.*;
public class ArrayList1D {
	
	public static void main(String args[]) {
		
	  List<String> arraylist = new ArrayList<String>();
	  arraylist.add("Alice");
	  arraylist.add("Yash");
	  arraylist.add("Ritesh");
	  arraylist.add("Bob");
	  arraylist.add("John");
	  
	  System.out.println(arraylist);  // [Alice, Yash, Ritesh, Bob, John]
	  arraylist.remove("Ritesh");
	  System.out.println(arraylist);   // [Alice, Yash, Bob, John]
		
	}

}
