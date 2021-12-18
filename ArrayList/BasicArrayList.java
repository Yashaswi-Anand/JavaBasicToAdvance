package ArrayList;
import java.util.*;

public class BasicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(50);
		System.out.println(arr);   // [10, 20, 50]
		arr.add(1,80);
		System.out.println(arr);   // [10, 80, 20, 50]
		System.out.println(arr.get(1)); // 80
		arr.set(0,100);
		System.out.println(arr); // [100, 80, 20, 50]
		
		for(int i=0;i<arr.size();i++) {   // here i = index 
			System.out.print(arr.get(i)+ " ");  // 100 80 20 50 
		}
		System.out.println();
		
		Integer n = 20;
		arr.remove(n);
		
		// using for each loop ( here i = value of array list element )
		for(int i : arr) System.out.print(i+ " ");  // 100 80 50 
	}

}
