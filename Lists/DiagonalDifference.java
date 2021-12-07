package Lists;
import java.util.*;

public class DiagonalDifference {
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	        int row = arr.size();
	        int col =0;
	        if(row != 0 ) col = arr.get(0).size();
	        int sum1 = 0;
	        for(int i=0;i<row;i++){
	            for(int j=0;j<col;j++){
	                if(i == j) sum1+= arr.get(i).get(j);
	            }
	        }
	        int sum2=0;
	        for(int i=0;i<row;i++){
	            int j=col-1-i;
	            sum2+= arr.get(i).get(j);
	        }
	        return Math.abs(sum1-sum2);

	    }
	
	public static List<List<Integer>> takeInput2dList(){
		System.out.println("Enter the size of 2d array list: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		List<List<Integer>> arr2d = new ArrayList<List<Integer>>();
		for(int i=0;i<size;i++) {
			arr2d.add(new ArrayList<Integer>());
			for(int j=0;j<size;j++) {
				int element = sc.nextInt();
				arr2d.get(i).add(j, element);
			}
		}
		return arr2d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<List<Integer>> arr2d = takeInput2dList();
		System.out.println(arr2d);
		int diff = diagonalDifference(arr2d);
		System.out.println(diff);

	}

}
