package Arrays2D;

import java.util.Scanner;

public class TotalSumOnTheBoundariesAndDiagonals {
	
	
	public static int diagonalBoundarySum(int arr[][]){
		
        int sum = 0;
        int n = arr.length;
        // Loop from i to N-1 for rows
        for (int i = 0; i < n; i++) {
     
            // Loop from j = N-1 for columns
            for (int j = 0; j < n; j++) {
     
                // Condition for diagonal
               
                if (i == j || (i + j) == n - 1) {
                    sum += arr[i][j];
                }
     
                // Condition for Boundary
              
                else if (i == 0 || j == 0 || i == n - 1|| j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }
     
        // return the final Sum
        return sum;
    }
	
	public static void take2DArrayInput(int size) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the elements of 2D Array:");
			int[][] arr = new int[size][size];
			
			for(int i=0;i<size;i++) 
				for(int j=0;j<size;j++) 
					arr[i][j] = sc.nextInt();
			
			int sum = diagonalBoundarySum(arr);
			System.out.println(sum);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc = new Scanner(System.in);
	  int size  = sc.nextInt();
	  take2DArrayInput(size);
	}

}
