
package Lists;
import java.util.*;

public class InputAndOutput {

	public static void main(String[] args) {
		
	
		ArrayList<ArrayList<Integer> > array_list = new ArrayList<ArrayList<Integer> >();
		
		// The space for the 0th row can be allocated with the use of new keyword, this is done in this line.
		//The 0th row also allows the store of 0 value as default .
		array_list.add(new ArrayList<Integer>());
		array_list.get(0).add(0, 3);
		array_list.get(0).add(1, 13);
		
		array_list.add(new ArrayList<Integer>());
		array_list.get(1).add(0, 23);
		array_list.get(1).add(1, 33);
		
		array_list.add(new ArrayList<Integer>());
		array_list.get(2).add(0, 43);
		array_list.get(2).add(1, 53);
		
		System.out.println("2D ArrayList… :");
		System.out.println(array_list);   // [[3, 13], [23, 33], [43, 53]]
		
		// find 1D array from 2D Arraylist
		System.out.println(array_list.get(1)); // [23, 33]
		
		
		//for(List i: array_list) System.out.print(i.get(0) + " "); // 3 23 43
		
		// print all the element from arraylist 
		for(int i=0;i<array_list.size();i++){
			for(int j=0;j<array_list.size()-1;j++){
				System.out.print(array_list.get(i).get(j)+ " "); // 3 13 23 33 43 53 
			}
		}
	}

}
