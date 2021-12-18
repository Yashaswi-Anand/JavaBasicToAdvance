package ArrayList;
import java.util.*;

public class RemoveConsecutiveDuplicates {
	
	public static ArrayList<Integer> removeConsecutiveDuplicates(int arr[]){
		
		ArrayList<Integer> arrL = new ArrayList<>();
		arrL.add(arr[0]);
		
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i-1] != arr[i]) arrL.add(arr[i]); 
		}
		
		
		return arrL;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10,10,10,20,20,30,30,40,50,50,60};
		ArrayList<Integer> arrL = removeConsecutiveDuplicates(arr);
		for(int i : arrL) System.out.print(i + " ");   // 10 20 30 40 50 60 

	}

}
